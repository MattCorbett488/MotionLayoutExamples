package com.willowtreeapps.constraintlayout20test.motionlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.willowtreeapps.constraintlayout20test.R
import com.willowtreeapps.constraintlayout20test.databinding.FragmentMotionLayoutOnSwipeBinding

class MotionLayoutOnSwipeFragment : Fragment() {
    private val binding: FragmentMotionLayoutOnSwipeBinding by lazy {
        FragmentMotionLayoutOnSwipeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

}
