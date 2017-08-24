package com.example.robirb.round;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;


/**
 * Created by ROBI RB on 8/13/2017.
 */

public class MyButton extends AppCompatButton {
    public MyButton(Context context) {
        super(context);
        init(context,null,0);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs,0);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }
    private void init(Context context, AttributeSet attrs, int defStyleAttr){
        setBackground(ContextCompat.getDrawable(getContext(),R.drawable.h));

    }

}
