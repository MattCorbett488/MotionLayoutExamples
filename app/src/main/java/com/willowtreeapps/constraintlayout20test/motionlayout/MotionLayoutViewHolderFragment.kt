package com.willowtreeapps.constraintlayout20test.motionlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.willowtreeapps.constraintlayout20test.databinding.FragmentMotionLayoutViewHolderBinding
import com.willowtreeapps.constraintlayout20test.recyclerview.SimpleAdapter
import com.willowtreeapps.constraintlayout20test.recyclerview.SimpleModel

class MotionLayoutViewHolderFragment : Fragment() {
    private val binding: FragmentMotionLayoutViewHolderBinding by lazy {
        FragmentMotionLayoutViewHolderBinding.inflate(layoutInflater)
    }

    private val sampleItems = listOf(
        SimpleModel("Title 1", "Description 1"),
        SimpleModel("Title 2", "Description 2"),
        SimpleModel("Title 3", "Description 3"),
        SimpleModel("Title 4", "Description 4"),
        SimpleModel("Title 5", "Description 5"),
        SimpleModel("Title 6", "Description 6"),
        SimpleModel("Title 7", "Description 7"),
        SimpleModel("Title 8", "Description 8"),
        SimpleModel("Title 9", "Description 9"),
        SimpleModel("Title 10", "Description 10"),
        SimpleModel("Title 11", "Description 11"),
        SimpleModel("Title 12", "Description 12"),
        SimpleModel("Title 13", "Description 13"),
        SimpleModel("Title 14", "Description 14"),
        SimpleModel("Title 15", "Description 15"),
        SimpleModel("Title 16", "Description 16"),
        SimpleModel("Title 17", "Description 17"),
        SimpleModel("Title 18", "Description 18"),
        SimpleModel("Title 19", "Description 19")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = SimpleAdapter(sampleItems)
        }
    }

}
