package com.example.mm.miwokapp.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextViewText extends TextView {

    public TextViewText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "garamond-bold.ttf"));
    }
}
