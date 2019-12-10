package com.willowtreeapps.constraintlayout20test

import android.content.Context
import android.util.AttributeSet
import android.util.SparseArray
import androidx.constraintlayout.solver.widgets.ConstraintWidget
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
import androidx.constraintlayout.solver.widgets.Helper
import androidx.constraintlayout.widget.ConstraintHelper
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.PARENT_ID
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.UNSET

class Linear @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    themeId: Int = 0
) :
    ConstraintHelper(context, attrs, themeId) {

    var orientation = Orientation.HORIZONTAL
        set(value) {
            if (field == value) {
                return
            }
            field = value
            requestLayout()
        }

    init {
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Linear)
            orientation = Orientation.values()[typedArray.getInt(R.styleable.Linear_orientation, 0)]

            typedArray.recycle()
        }
    }

    override fun updatePreLayout(container: ConstraintLayout?) {
        if (mReferenceIds != null) {
            setIds(mReferenceIds)
        }
        var previousViewId: Int? = null
        var nextViewId: Int?

        (0 until mCount).forEach { i ->

            /*
            mIds has 32 indices whether you use them or not, so we need to check if the value at the
            index is the default value (0)
             */
            nextViewId = if ((i + 1) < mIds.size && mIds[i + 1] > 0) {
                mIds[i + 1]
            } else {
                null
            }

            val view = container?.getViewById(mIds[i])
            view?.layoutParams = when (orientation) {
                Orientation.HORIZONTAL -> mapHorizontal(
                    view?.layoutParams as LayoutParams,
                    previousViewId, nextViewId
                )
                Orientation.VERTICAL -> mapVertical(
                    view?.layoutParams as LayoutParams,
                    previousViewId, nextViewId
                )
            }
            previousViewId = view.id
        }
    }

    override fun updatePostLayout(container: ConstraintLayout?) {
        (layoutParams as LayoutParams).constraintWidget.apply {
            width = 0
            height = 0
        }
    }

    private fun mapHorizontal(
        viewParams: LayoutParams,
        previousViewId: Int? = null,
        nextViewId: Int? = null
    ) = viewParams.apply {
        if (previousViewId != null) {
            startToEnd = previousViewId
        } else {
            startToStart = PARENT_ID
        }
        if (nextViewId != null) {
            endToStart = nextViewId
        } else {
            endToEnd = PARENT_ID
        }

        //Set the vertical params if unset with defaults
        if (topToTop == UNSET && topToBottom == UNSET) {
            topToTop = PARENT_ID
        }
        if (bottomToBottom == UNSET && bottomToTop == UNSET) {
            bottomToBottom = PARENT_ID
        }
    }

    private fun mapVertical(
        viewParams: LayoutParams,
        previousViewId: Int? = null,
        nextViewId: Int? = null
    ) = viewParams.apply {
        if (previousViewId != null) {
            topToBottom = previousViewId
        } else {
            topToTop = PARENT_ID
        }
        if (nextViewId != null) {
            bottomToTop = nextViewId
        } else {
            bottomToBottom = PARENT_ID
        }

        //Set the horizontal params (if unset) with defaults
        if (startToStart == UNSET && startToEnd == UNSET) {
            startToStart = PARENT_ID
        }
        if (endToEnd == UNSET && endToStart == UNSET) {
            endToEnd = PARENT_ID
        }
    }

    enum class Orientation {
        HORIZONTAL,
        VERTICAL
    }
}