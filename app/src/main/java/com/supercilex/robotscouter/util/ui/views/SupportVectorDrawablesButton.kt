package com.supercilex.robotscouter.util.ui.views

import android.content.Context
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import com.supercilex.robotscouter.util.ui.initSupportVectorDrawablesAttrs

/**
 * A custom button that supports using vector drawables with the
 * `android:drawable[Start/End/Top/Bottom]` attribute pre-L.
 *
 * AppCompat can only load vector drawables with srcCompat pre-L and doesn't provide a similar
 * compatibility attribute for compound drawables. Thus, we must load compound drawables at runtime
 * using AppCompat and inject them into the button to support pre-L devices.
 */
class SupportVectorDrawablesButton : AppCompatButton {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initSupportVectorDrawablesAttrs(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr) {
        initSupportVectorDrawablesAttrs(attrs)
    }
}
