package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StartedAct extends AppCompatActivity {

    TextView name;
    View line;
    Button btn_talk;
    HorizontalScrollView data;
    LinearLayout btn_bio;
    Animation btt, rtl, ltr, btt_btn_bio, rtl_btn_talk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started);

        //load animation
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        rtl = AnimationUtils.loadAnimation(this, R.anim.rtl);
        ltr = AnimationUtils.loadAnimation(this, R.anim.ltr);
        btt_btn_bio = AnimationUtils.loadAnimation(this, R.anim.btt_btn_bio);
        rtl_btn_talk = AnimationUtils.loadAnimation(this, R.anim.rtl_btn_talk);

        //load komponen
        name = findViewById(R.id.name);
        line = findViewById(R.id.line);
        btn_talk = findViewById(R.id.btn_talk);
        data = findViewById(R.id.data);
        btn_bio = findViewById(R.id.btn_bio);

        //run animation
        name.startAnimation(rtl);
        line.startAnimation(ltr);
        data.startAnimation(btt);
        btn_talk.startAnimation(rtl_btn_talk);
        btn_bio.startAnimation(btt_btn_bio);
    }
}
