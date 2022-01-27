package com.abbasov.inkabet.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abbasov.inkabet.databinding.FragmentCBinding


class C : Fragment() {

    lateinit var binding:FragmentCBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCBinding.inflate(LayoutInflater.from(context))
        return binding.root
    }


}