package com.willowtreeapps.constraintlayout20test.flow

import androidx.constraintlayout.helper.widget.Flow
import java.lang.IllegalArgumentException

class FlowState {

    var maxElements: Int? = null

    var horizontalBias: Float? = null
    var horizontalGap: Int? = null
    var horizontalStyle: Int? = null

    var verticalBias: Float? = null
    var verticalGap: Int? = null
    var verticalStyle: Int? = null

    inner class Builder {
        private val state: FlowState =
            FlowState()

        fun horizontalBias(bias: Float) {
            if (bias < 0 || bias > 1) {
                throw IllegalArgumentException("Horizontal bias must be between 0 and 1")
            }
            state.horizontalBias = bias
        }

        fun horizontalGap(gap: Int) {
            if (gap < 0) {
                throw IllegalArgumentException("Horizontal gap cannot be negative")
            }
            state.horizontalGap = gap
        }

        fun horizontalStyle(style: Int) {
            if (style !in arrayOf(Flow.CHAIN_SPREAD, Flow.CHAIN_SPREAD_INSIDE, Flow.CHAIN_PACKED)) {
                throw IllegalArgumentException("Horizontal Style must be one of: Flow.CHAIN_SPREAD, Flow.CHAIN_SPREAD_INSIDE, Flow.CHAIN_PACKED")
            }
            state.horizontalStyle = style
        }

        fun verticalBias(bias: Float) {
            if (bias < 0 || bias > 1) {
                throw IllegalArgumentException("Vertical bias must be between 0 and 1")
            }
            state.verticalBias = bias
        }

        fun verticalGap(gap: Int) {
            if (gap < 0) {
                throw IllegalArgumentException("Vertical gap cannot be negative")
            }
            state.verticalGap = gap
        }

        fun verticalStyle(style: Int) {
            if (style !in arrayOf(Flow.CHAIN_SPREAD, Flow.CHAIN_SPREAD_INSIDE, Flow.CHAIN_PACKED)) {
                throw IllegalArgumentException("Vertical Style must be one of: Flow.CHAIN_SPREAD, Flow.CHAIN_SPREAD_INSIDE, Flow.CHAIN_PACKED")
            }
            state.verticalStyle = style
        }

        fun maxElements(max: Int) {
            if (max < 1) {
                throw IllegalArgumentException("Max elements must be a positive number")
            }
            state.maxElements = max
        }
    }
}