package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class shoonya extends AppCompatActivity {
    TextView shu,shu1,shu2,shu3,shu4,shu5;

    ConstraintLayout l;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoonya);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        shu=findViewById(R.id.shu);
        shu.setTextColor(Color.rgb(243,135,135));
        //shu.setTextColor(getResources().getColor(R.color.purple_500));
        shu1=findViewById(R.id.shu1);
        shu2=findViewById(R.id.shu2);
        shu3=findViewById(R.id.shu3);
        shu4=findViewById(R.id.shu4);
        shu5=findViewById(R.id.shu5);
        l=findViewById(R.id.l);
        l.setBackgroundColor(Color.rgb(249,236,236));

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.shoonya);

    }

}