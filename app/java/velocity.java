package com.example.jordan.physicshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class velocity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocity);

        final EditText editText1=findViewById(R.id.editText1);
        final EditText editText2=findViewById(R.id.editText2);
        final EditText editText3=findViewById(R.id.editText3);
        Button solve=findViewById(R.id.solve);
        final TextView textView=findViewById(R.id.textView5);
        solve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                final String veloInput=editText1.getText().toString();
                final String disInput = editText2.getText().toString();
                final String timInput = editText3.getText().toString();
                if (veloInput.equals("")) {
                    int distInput = Integer.parseInt(disInput);
                    int timeInput = Integer.parseInt(timInput);
                    int value = distInput / timeInput;
                    String strValue = Integer.toString(value);
                    textView.setText(strValue);
                }
                else if (disInput.equals("")) {
                    int velocInput = Integer.parseInt(veloInput);
                    int timeInput = Integer.parseInt(timInput);
                    int value = velocInput*timeInput;
                    String strValue = Integer.toString(value);
                    textView.setText(strValue);
                }
                else if (timInput.equals("")) {
                    int velocInput = Integer.parseInt(veloInput);
                    int distInput = Integer.parseInt(disInput);
                    int value = distInput/velocInput;
                    String strValue = Integer.toString(value);
                    textView.setText(strValue);
                }
            }
        });
    }
}
