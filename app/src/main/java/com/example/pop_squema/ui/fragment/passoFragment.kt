package com.example.pop_squema.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pop_squema.PassoViewModel
import com.example.pop_squema.R

class passoFragment : Fragment() {

    companion object {
        fun newInstance() = passoFragment()
    }

    private lateinit var viewModel: PassoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_passo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PassoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}