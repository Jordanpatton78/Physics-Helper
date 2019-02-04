package com.example.jordan.physicshelper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button velocity = findViewById(R.id.velocity);
        velocity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent= new Intent(v.getContext(),velocity.class);
                startActivityForResult(myIntent,0);
            }
                                    }

        );
        final Button acceleration=findViewById(R.id.acceleration);
        acceleration.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent =new Intent(v.getContext(),acceleration.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button ke1=findViewById(R.id.ke1);
        ke1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(),ke1.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button ke2=findViewById(R.id.ke2);
        ke2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(),ke2.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button ke3=findViewById(R.id.ke3);
        ke3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(),ke3.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button ke4=findViewById(R.id.ke4);
        ke4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(),ke4.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button more=findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(),MainActivity2.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
