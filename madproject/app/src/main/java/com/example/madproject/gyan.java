package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class gyan extends AppCompatActivity {
    TextView gyan,gyan1,gyan2,gyan3,gyan4,gyan5;

    ConstraintLayout l;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyan);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        gyan=findViewById(R.id.gyan);
        gyan.setTextColor(Color.rgb(243,135,135));
        //gyan.setTextColor(getResources().getColor(R.color.purple_500));
        gyan1=findViewById(R.id.gyan1);
        gyan2=findViewById(R.id.gyan2);
        gyan3=findViewById(R.id.gyan3);
        gyan4=findViewById(R.id.gyan4);
        gyan5=findViewById(R.id.gyan5);
        l=findViewById(R.id.l);
        l.setBackgroundColor(Color.rgb(249,236,236));

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.gyan);

    }

}