package com.willowtreeapps.constraintlayout20test.flow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Flow
import androidx.fragment.app.Fragment
import androidx.transition.TransitionManager
import com.google.android.material.button.MaterialButtonToggleGroup
import com.willowtreeapps.constraintlayout20test.R
import com.willowtreeapps.constraintlayout20test.databinding.FragmentVerticalFlowBinding

class VerticalFlowFragment : Fragment() {
    private val binding: FragmentVerticalFlowBinding by lazy { FragmentVerticalFlowBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            verticalBiasToggleGroup.addOnButtonCheckedListener(biasCheckedListener)
            verticalStyleToggleGroup.addOnButtonCheckedListener(verticalStyleCheckedListener)
            verticalGapToggleGroup.addOnButtonCheckedListener(horizonalGapCheckedListener)
            maxElementsToggleGroup.addOnButtonCheckedListener(maxElementsCheckedListener)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.apply {
            verticalBiasToggleGroup.removeOnButtonCheckedListener(biasCheckedListener)
            verticalStyleToggleGroup.removeOnButtonCheckedListener(verticalStyleCheckedListener)
            verticalGapToggleGroup.removeOnButtonCheckedListener(horizonalGapCheckedListener)
            maxElementsToggleGroup.removeOnButtonCheckedListener(maxElementsCheckedListener)
        }
    }

    private val verticalStyleCheckedListener =
        MaterialButtonToggleGroup.OnButtonCheckedListener { _, checkedId, isChecked ->
            if (!isChecked) {
                return@OnButtonCheckedListener
            }
            val verticalStyle = when (checkedId) {
                R.id.spread_button -> Flow.CHAIN_SPREAD
                R.id.spread_inside_button -> Flow.CHAIN_SPREAD_INSIDE
                R.id.packed_button -> Flow.CHAIN_PACKED
                else -> return@OnButtonCheckedListener
            }
            TransitionManager.beginDelayedTransition(binding.root as ViewGroup)
            binding.flowGrid.setVerticalStyle(verticalStyle)
        }

    private val horizonalGapCheckedListener =
        MaterialButtonToggleGroup.OnButtonCheckedListener { _, checkedId, isChecked ->
            if (!isChecked) {
                return@OnButtonCheckedListener
            }
            val verticalGap = when (checkedId) {
                R.id.no_gap_button -> 0
                R.id.small_gap_button -> resources.getDimensionPixelOffset(
                    R.dimen.flow_small_gap
                )
                R.id.medium_gap_button -> resources.getDimensionPixelOffset(
                    R.dimen.flow_medium_gap
                )
                R.id.large_gap_button -> resources.getDimensionPixelOffset(
                    R.dimen.flow_large_gap
                )
                else -> return@OnButtonCheckedListener
            }
            TransitionManager.beginDelayedTransition(binding.root as ViewGroup)
            binding.flowGrid.setVerticalGap(verticalGap)
        }

    private val maxElementsCheckedListener =
        MaterialButtonToggleGroup.OnButtonCheckedListener { _, checkedId, isChecked ->
            if (!isChecked) {
                return@OnButtonCheckedListener
            }
            val maxElements = when (checkedId) {
                R.id.small_max_button -> resources.getInteger(
                    R.integer.small_max_elements
                )
                R.id.medium_max_button -> resources.getInteger(
                    R.integer.medium_max_elements
                )
                R.id.large_max_button -> resources.getInteger(
                    R.integer.large_max_elements
                )
                else -> return@OnButtonCheckedListener
            }
            TransitionManager.beginDelayedTransition(binding.root as ViewGroup)
            binding.flowGrid.setMaxElementsWrap(maxElements)
        }

    private val biasCheckedListener = MaterialButtonToggleGroup.OnButtonCheckedListener { _, checkedId, isChecked ->
        if (!isChecked) {
            return@OnButtonCheckedListener
        }
        val bias = when (checkedId) {
            R.id.no_vertical_bias_button -> 0f
            R.id.fifty_vertical_bias_button -> 0.5f
            R.id.full_vertical_bias_button -> 1f
            else -> return@OnButtonCheckedListener
        }
        TransitionManager.beginDelayedTransition(binding.root as ViewGroup)
        binding.flowGrid.setVerticalBias(bias)
    }
}