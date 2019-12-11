package com.willowtreeapps.constraintlayout20test.constrainthelper

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.willowtreeapps.constraintlayout20test.databinding.FragmentLayerBinding
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

class LayerFragment : Fragment() {
    private val binding: FragmentLayerBinding by lazy { FragmentLayerBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    @ExperimentalTime
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nerdButton.setOnClickListener {
            animateLayer()
        }
        binding.resetButton.setOnClickListener {
            binding.layer.rotation = 0f
            binding.layer.scaleX = 1f
        }
    }

    @ExperimentalTime
    private fun animateLayer() {

        val rotationAnimator = ObjectAnimator.ofFloat(0f, 720f)
        rotationAnimator.addUpdateListener {
            binding.layer.rotation = it.animatedValue as Float
        }
        val scaleAnimator = ObjectAnimator.ofFloat(1f, 2f, 0f, 1f)
        scaleAnimator.addUpdateListener {
            binding.layer.scaleX = it.animatedValue as Float
            binding.layer.scaleY = it.animatedValue as Float
        }
        val pivotAnimator = ObjectAnimator.ofFloat(0f, 300f, 0f)
        pivotAnimator.addUpdateListener {
            binding.layer.pivotX = it.animatedValue as Float
        }
        val translationAnimator = ObjectAnimator.ofFloat(0f, 300f, 0f)
        translationAnimator.addUpdateListener {
            binding.layer.translationX = it.animatedValue as Float
        }
        AnimatorSet().apply {
            playTogether(rotationAnimator, scaleAnimator, pivotAnimator, translationAnimator)
            duration = 4.seconds.toLongMilliseconds()
            start()
        }
    }
}