package com.example.homefan1;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggeButton;
    ImageView imageView;
    ObjectAnimator rotateAnimator;
    Switch switchButton;
    SeekBar seekbar;
    final int SPEED[] = {0, 5000, 3000, 1000};
    GradientDrawable gd = new GradientDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggeButton=(ToggleButton) findViewById(R.id.Kipas);
        imageView=(ImageView) findViewById(R.id.gambar);
        rotateAnimator= ObjectAnimator.ofFloat(imageView, "rotation", 0, 360);
        rotateAnimator.setDuration(1000);
        rotateAnimator.setRepeatCount(ValueAnimator.INFINITE);
        rotateAnimator.setInterpolator(new LinearInterpolator());
        toggeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateOn();
            }
        });
    }

    protected void rotateOn()
    {
        if(toggeButton.isChecked()){
            rotateAnimator.setDuration(SPEED[1000]);
            rotateAnimator.start();
        }else{
            rotateAnimator.end();
        }
    }
}