package com.willowtreeapps.constraintlayout20test.motionlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.willowtreeapps.constraintlayout20test.databinding.FragmentKeycycleBinding

class MotionLayoutKeyCycleFragment: Fragment() {
    private val binding: FragmentKeycycleBinding by lazy { FragmentKeycycleBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}