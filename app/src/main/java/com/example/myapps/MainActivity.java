package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView app_title, app_subtitle, app_copyright;
    Animation btt, btt_small, ttb, opacity, btt_copyright;
    View line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load animation
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        btt_small = AnimationUtils.loadAnimation(this, R.anim.btt_small);
        ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);
        opacity = AnimationUtils.loadAnimation(this, R.anim.opacity);
        btt_copyright = AnimationUtils.loadAnimation(this, R.anim.btt_copyright);

        //load komponen
        app_title = findViewById(R.id.app_title);
        app_subtitle = findViewById(R.id.app_subtitle);
        app_copyright = findViewById(R.id.app_copyright);
        line = findViewById(R.id.line);

        //run animation
        app_title.startAnimation(btt);
        app_subtitle.startAnimation(ttb);
        app_copyright.startAnimation(btt_copyright);
        line.startAnimation(opacity);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotostarted = new Intent(MainActivity.this, MainPage.class);
                startActivity(gotostarted);
                finish();
            }
        }, 3000);
    }
}
