package com.example.jordan.physicshelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button work=findViewById(R.id.work);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(),work.class);
                startActivityForResult(myIntent,0);
            }
        });
        final Button consOfMomentum=findViewById(R.id.momentum);
        consOfMomentum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(), momentum.class);
                startActivityForResult(myIntent,0);

            }
        });
    }
}
