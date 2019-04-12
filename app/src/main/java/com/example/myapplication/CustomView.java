package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/**
 * TODO: document your custom view class.
 */
public class CustomView extends RelativeLayout {

    Button button;
    EditText editText;

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context) {
        super(context);
        init();
}

private void init() {
    inflate(getContext(),R.layout.sample_custom_view, this);
    button = findViewById(R.id.btn);
    button = findViewById(R.id.btn1);
    button = findViewById(R.id.btn2);
    editText = findViewById(R.id.etxt);
    editText = findViewById(R.id.etxt1);
    editText = findViewById(R.id.etxt2);


    }

}