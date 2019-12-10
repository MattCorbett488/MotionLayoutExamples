package com.willowtreeapps.constraintlayout20test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.willowtreeapps.constraintlayout20test.databinding.FragmentCustomHelperBinding

class CustomHelperFragment : Fragment() {
    private val binding: FragmentCustomHelperBinding by lazy { FragmentCustomHelperBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.view1.setOnClickListener {

            binding.linearHelper.orientation = when (binding.linearHelper.orientation) {
                Linear.Orientation.VERTICAL -> Linear.Orientation.HORIZONTAL
                Linear.Orientation.HORIZONTAL -> Linear.Orientation.VERTICAL
            }
        }
    }
}