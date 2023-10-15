package com.example.madproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class layout2 extends AppCompatActivity {
    TextView tv2;
    Button p,b,up;
    ImageView i2,i3;
    ConstraintLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        tv2=findViewById(R.id.tv);
        tv2.setTextColor(Color.rgb(0,0,0));

        p=findViewById(R.id.b1);

        b=findViewById(R.id.b2);


        i2=findViewById(R.id.i2);
        up=findViewById(R.id.up);

        up.setBackgroundColor(Color.rgb(135, 212, 59));
        l=findViewById(R.id.ls);
        l.setBackgroundColor(Color.rgb(249,236,236));

        p.setBackgroundColor(Color.rgb(243,135,135));
        b.setBackgroundColor(Color.rgb(243,135,135));

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(layout2.this,second.class);
                startActivity(i1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(layout2.this,mudre.class);
                startActivity(i2);
            }
        });
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ad = new AlertDialog.Builder(layout2.this);
                ad.setTitle("UPGRADE");
                ad.setMessage("Upgrade to premium worth only Rs.199/mo ?");
                ad.setNegativeButton("Later", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                ad.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent ii= new Intent(layout2.this,pay.class);
                        startActivity(ii);
                    }
                });

                AlertDialog a = ad.create();
                a.show();
            }
        });
    }
}