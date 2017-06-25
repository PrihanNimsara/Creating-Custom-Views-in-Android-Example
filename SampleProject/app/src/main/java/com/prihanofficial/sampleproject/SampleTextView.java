package com.prihanofficial.sampleproject;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Prihan Nimsara on 6/23/2017.
 **/

public class SampleTextView extends TextView {

private String sampletTextViewTitle ;

    private String sampleTextViewId;

    public SampleTextView(Context context) {
        super(context);

    }

    public SampleTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        // sample Test Code
        // retrieved values correspond to the positions of the attributes

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.SampleTextView);
        int count = typedArray.getIndexCount();
        try{

            for (int i = 0; i < count; ++i) {
                int attr = typedArray.getIndex(i);
                // the attr corresponds to the title attribute
                if(attr == R.styleable.SampleTextView_title) {
                    // set the text from the layout
                    sampletTextViewTitle = typedArray.getString(attr);
                    changeATextView();
                }
                else if(attr == R.styleable.SampleTextView_id){
                    sampleTextViewId = typedArray.getString(attr);
                    changeAID();
                }
            }
        }

        // the recycle() will be executed obligatorily
        finally {
            // for reuse
            typedArray.recycle();
        }

    }

    public SampleTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
//
//    public SampleTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//
//    }

    private void changeATextView(){
        setText(sampletTextViewTitle);
        setTextSize(30);
    }
    private void changeAID(){
        setId(R.id.a);
    }

}
