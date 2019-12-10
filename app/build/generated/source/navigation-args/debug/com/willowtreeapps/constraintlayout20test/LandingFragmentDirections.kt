package com.willowtreeapps.constraintlayout20test

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class LandingFragmentDirections private constructor() {
    companion object {
        fun landingToHorizontalFlow(): NavDirections =
                ActionOnlyNavDirections(R.id.landing_to_horizontalFlow)

        fun landingToVerticalFlow(): NavDirections =
                ActionOnlyNavDirections(R.id.landing_to_verticalFlow)

        fun landingToLayer(): NavDirections = ActionOnlyNavDirections(R.id.landing_to_layer)

        fun landingToCustomHelper(): NavDirections =
                ActionOnlyNavDirections(R.id.landing_to_customHelper)

        fun landingToImageFilter(): NavDirections =
                ActionOnlyNavDirections(R.id.landing_to_imageFilter)

        fun landingToMotionLayout(): NavDirections =
                ActionOnlyNavDirections(R.id.landing_to_motionLayout)
    }
}
