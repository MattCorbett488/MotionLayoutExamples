package com.willowtreeapps.constraintlayout20test.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.willowtreeapps.constraintlayout20test.databinding.ViewSimpleViewholderBinding

class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var binding: ViewSimpleViewholderBinding = ViewSimpleViewholderBinding.bind(view)

    fun bind(model: SimpleModel) {
        binding.title.text = model.title
        binding.description.text = model.description
    }
}