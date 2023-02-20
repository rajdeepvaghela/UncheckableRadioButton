package com.rdapps.uncheckableradiobutton

import android.content.Context
import android.util.AttributeSet
import android.widget.RadioGroup
import androidx.appcompat.widget.AppCompatRadioButton

class UncheckableRadioButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatRadioButton(context, attrs) {
    private var uncheckable = false

    init {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.UncheckableRadioButton)
        uncheckable = typedArray.getBoolean(R.styleable.UncheckableRadioButton_uncheckable, false)
        typedArray.recycle()
    }

    override fun toggle() {
        if (uncheckable) {
            if (isChecked) {
                if (parent != null && parent is RadioGroup) {
                    (parent as RadioGroup).clearCheck()
                }
            } else {
                super.toggle()
            }
        } else {
            super.toggle()
        }
    }

    override fun getAccessibilityClassName(): CharSequence {
        return UncheckableRadioButton::class.java.name
    }
}