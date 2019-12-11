package com.willowtreeapps.constraintlayout20test.motionlayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionListenerAdapter
import com.willowtreeapps.constraintlayout20test.R
import com.willowtreeapps.constraintlayout20test.databinding.FragmentMotionLayoutBinding

class MotionLayoutFragment : Fragment() {
    private val binding: FragmentMotionLayoutBinding by lazy {
        FragmentMotionLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.onClickButton.setOnClickListener { findNavController().navigate(R.id.motionLayout_to_motionLayoutOnClick) }
        binding.onSwipeButton.setOnClickListener { findNavController().navigate(R.id.motionLayout_to_motionLayoutOnSwipe) }
        binding.viewholder.setOnClickListener { findNavController().navigate(R.id.motionLayout_to_motionLayoutViewHolder) }

        binding.cycle.setOnClickListener {  findNavController().navigate(R.id.motionLayout_to_keyCycle)  }

        binding.motionLayoutRoot.setTransitionListener(transitionListener)
    }

    override fun onResume() {
        super.onResume()
        binding.motionLayoutRoot.transitionToEnd()
    }

    private val transitionListener = object : MotionLayout.TransitionListener {
        override fun onTransitionTrigger(p0: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {

        }

        override fun onTransitionStarted(p0: MotionLayout?, startId: Int, endId: Int) {
            binding.progressTextView.text = "We startin"
        }

        override fun onTransitionChange(p0: MotionLayout?, startId: Int, endId: Int, p3: Float) {
            binding.progressTextView.text = "${(p3 * 100).toInt()} % done"
        }

        override fun onTransitionCompleted(p0: MotionLayout?, currentId: Int) {
            binding.progressTextView.text = "We done it"
            val animator = binding.progressTextView.animate().alpha(0f)
            animator.duration = 1000
            animator.start()
        }

    }
}