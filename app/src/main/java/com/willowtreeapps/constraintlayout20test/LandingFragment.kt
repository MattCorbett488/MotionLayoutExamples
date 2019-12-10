package com.willowtreeapps.constraintlayout20test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.willowtreeapps.constraintlayout20test.databinding.FragmentLandingBinding

class LandingFragment : Fragment() {

    private val binding: FragmentLandingBinding by lazy { FragmentLandingBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.horizontalFlowButton.setOnClickListener {
            findNavController().navigate(R.id.landing_to_horizontalFlow)
        }
        binding.verticalFlowButton.setOnClickListener {
            findNavController().navigate(R.id.landing_to_verticalFlow)
        }
        binding.layerButton.setOnClickListener {
            findNavController().navigate(R.id.landing_to_layer)
        }
        binding.imageFilterButton.setOnClickListener {
            findNavController().navigate(R.id.landing_to_imageFilter)
        }
        binding.customHelperButton.setOnClickListener {
            findNavController().navigate(R.id.landing_to_customHelper)
        }
        binding.motionLayoutButton.setOnClickListener {
            findNavController().navigate(R.id.landing_to_motionLayout)
        }
    }
}