package com.example.viewanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    TextView showText;
    Button alpha, scale, rotate, translate;
    ImageView showImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = findViewById(R.id.showTextView);
        alpha = findViewById(R.id.alphaButton);
        scale = findViewById(R.id.scaleButton);
        rotate = findViewById(R.id.rotateButton);
        translate = findViewById(R.id.translateButton);

        showImage = findViewById(R.id.showImage);

        showImage.setImageResource(R.drawable.item01);
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showImage.startAnimation( AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.alpha_out));
                showImage.startAnimation( AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.alpha_in));
            }
        });

        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showImage.startAnimation( AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.scale_out));
                showImage.startAnimation( AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.scale_in));
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showImage.startAnimation( AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.rotate_in));

            }
        });

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showImage.startAnimation( AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.translate_out));
            }
        });


//        showImage.setFactory(new ViewSwitcher.ViewFactory() {
//            @Override
//            public View makeView() {
//                ImageView v = new ImageView(MainActivity.this);
//                v.setBackgroundColor(0xFF000000);
//                v.setScaleType(ImageView.ScaleType.FIT_CENTER);
//                v.setLayoutParams(new ImageSwitcher.LayoutParams(
//                        ViewGroup.LayoutParams.MATCH_PARENT,
//                        ViewGroup.LayoutParams.MATCH_PARENT));
//                v.setBackgroundColor(Color.WHITE);
//                return v;
//            }
//        });
    }
}