package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainPage extends AppCompatActivity {

    LinearLayout shape_social;

    Animation social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        // load animation
        social = AnimationUtils.loadAnimation(this, R.anim.social);

        // load komponen
        shape_social = findViewById(R.id.shape_social);

        // run animation
        shape_social.startAnimation(social);
    }
}
