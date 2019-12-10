package com.willowtreeapps.constraintlayout20test.motionlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.willowtreeapps.constraintlayout20test.R
import com.willowtreeapps.constraintlayout20test.databinding.FragmentMotionLayoutOnClickBinding

class MotionLayoutOnClickFragment : Fragment() {
    private val binding: FragmentMotionLayoutOnClickBinding by lazy {
        FragmentMotionLayoutOnClickBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

}
