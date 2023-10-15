package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class Apaan extends AppCompatActivity {
    TextView apa,apa1,apa2,apa3,apa4,apa5;

    ConstraintLayout l;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apaan);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        apa=findViewById(R.id.apa);
        apa.setTextColor(Color.rgb(243,135,135));
        //apam.setTextColor(getResources().getColor(R.color.purple_500));
        apa1=findViewById(R.id.apa1);
        apa2=findViewById(R.id.apa2);
        apa3=findViewById(R.id.apa3);
        apa4=findViewById(R.id.apa4);
        apa5=findViewById(R.id.apa5);
        l=findViewById(R.id.l);
        l.setBackgroundColor(Color.rgb(249,236,236));

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.apaan);

    }

}