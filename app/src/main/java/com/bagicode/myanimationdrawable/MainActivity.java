package com.bagicode.myanimationdrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable animationDrawable;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv_image);

        imageView.setBackgroundResource(R.drawable.ic_signal_animation);

        animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();

    }

//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//
//        animationDrawable.start();
//    }

}
