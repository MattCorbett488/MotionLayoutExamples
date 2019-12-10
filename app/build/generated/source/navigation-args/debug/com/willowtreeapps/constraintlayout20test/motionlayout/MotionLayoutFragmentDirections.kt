package com.willowtreeapps.constraintlayout20test.motionlayout

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.willowtreeapps.constraintlayout20test.R

class MotionLayoutFragmentDirections private constructor() {
    companion object {
        fun motionLayoutToMotionLayoutOnClick(): NavDirections =
                ActionOnlyNavDirections(R.id.motionLayout_to_motionLayoutOnClick)

        fun motionLayoutToMotionLayoutOnSwipe(): NavDirections =
                ActionOnlyNavDirections(R.id.motionLayout_to_motionLayoutOnSwipe)

        fun motionLayoutToMotionLayoutViewHolder(): NavDirections =
                ActionOnlyNavDirections(R.id.motionLayout_to_motionLayoutViewHolder)

        fun motionLayoutToDiffUtil(): NavDirections =
                ActionOnlyNavDirections(R.id.motionLayout_to_diffUtil)
    }
}
