package com.willowtreeapps.constraintlayout20test

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.fragment.app.Fragment
import com.willowtreeapps.constraintlayout20test.databinding.FragmentImageFilterBinding
import kotlin.math.abs

class ImageFilterFragment : Fragment() {
    val binding: FragmentImageFilterBinding by lazy { FragmentImageFilterBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageFilterView.setOnClickListener {
            val crossfade = binding.imageFilterView.crossfade

            ObjectAnimator.ofFloat(crossfade, abs(crossfade - 1)).apply {
                duration = 2000
                addUpdateListener {
                    binding.imageFilterView.crossfade = it.animatedValue as Float
                }
                start()
            }
        }

        binding.saturationSeekbar.setOnSeekBarChangeListener(SeekBarChangeListenerAdapter(
            onProgressChange = { _, progress, _ ->
                binding.imageFilterView.saturation = progress / 20f
            }
        ))
        binding.brightnessSeekbar.setOnSeekBarChangeListener(SeekBarChangeListenerAdapter(
            onProgressChange = { _, progress, _ ->
                binding.imageFilterView.brightness = progress / 20f
            }
        ))
        binding.warmthSeekbar.setOnSeekBarChangeListener(SeekBarChangeListenerAdapter(
            onProgressChange = { _, progress, _ ->
                binding.imageFilterView.warmth = progress / 20f
            }
        ))
        binding.contrastSeekbar.setOnSeekBarChangeListener(SeekBarChangeListenerAdapter(
            onProgressChange = { _, progress, _ ->
                binding.imageFilterView.contrast = progress / 20f
            }
        ))
        binding.roundToggleGroup.addOnButtonCheckedListener { _, checkedId, isChecked ->
            if (!isChecked) {
                return@addOnButtonCheckedListener
            }
            val round = when (checkedId) {
                R.id.less_round_button -> 0f
                R.id.round_button -> resources.getDimensionPixelOffset(R.dimen.round).toFloat()
                else -> return@addOnButtonCheckedListener
            }
            binding.imageFilterView.round = round
        }
    }

    inner class SeekBarChangeListenerAdapter(
        private val onProgressChange: ((seekBar: SeekBar?, progress: Int, fromUser: Boolean) -> Unit)? = null,
        private val onStartTouch: ((seekBar: SeekBar?) -> Unit)? = null,
        private val onStopTouch: ((seekBar: SeekBar?) -> Unit)? = null
    ) : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            onProgressChange?.invoke(seekBar, progress, fromUser)
        }

        override fun onStartTrackingTouch(seekBar: SeekBar?) {
            onStartTouch?.invoke(seekBar)
        }

        override fun onStopTrackingTouch(seekBar: SeekBar?) {
            onStopTouch?.invoke(seekBar)
        }

    }
}