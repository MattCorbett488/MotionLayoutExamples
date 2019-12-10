package com.willowtreeapps.constraintlayout20test.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.willowtreeapps.constraintlayout20test.R

class SimpleAdapter(private var items: List<SimpleModel>) :
    RecyclerView.Adapter<SimpleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SimpleViewHolder(
        parent.inflateFromParent(R.layout.view_simple_viewholder)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bind(items[position])
    }

    private fun ViewGroup.inflateFromParent(@LayoutRes layoutId: Int) = LayoutInflater
        .from(context)
        .inflate(layoutId, this, false)
}