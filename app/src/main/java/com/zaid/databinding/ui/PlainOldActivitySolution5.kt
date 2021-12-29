package com.zaid.databinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.zaid.databinding.R
import com.zaid.databinding.data.SimpleViewModelSolution
import com.zaid.databinding.databinding.PlainActivitySolution5Binding

class PlainOldActivitySolution5 : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolution5Binding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution_5)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}
