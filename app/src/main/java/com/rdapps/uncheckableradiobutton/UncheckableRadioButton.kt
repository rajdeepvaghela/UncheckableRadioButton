package com.rdapps.uncheckableradiobutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import android.widget.RadioGroup;

public class UncheckableRadioButton extends AppCompatRadioButton {

    private boolean uncheckable = false;

    public UncheckableRadioButton(Context context) {
        super(context);
    }

    public UncheckableRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public UncheckableRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.UncheckableRadioButton);
        uncheckable = typedArray.getBoolean(R.styleable.UncheckableRadioButton_uncheckable, false);
        typedArray.recycle();
    }

    @Override
    public void toggle() {

        if (uncheckable) {
            if (isChecked()) {
                if (getParent() != null && getParent() instanceof RadioGroup) {
                    ((RadioGroup) getParent()).clearCheck();
                }
            } else {
                super.toggle();
            }
        } else {
            super.toggle();
        }
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return UncheckableRadioButton.class.getName();
    }
}
