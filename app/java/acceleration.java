package com.example.jordan.physicshelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class acceleration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration);

        final EditText editText=findViewById(R.id.editText);
        final EditText editText2=findViewById(R.id.editText2);
        final EditText editText3=findViewById(R.id.editText3);
        Button solve= findViewById(R.id.solve);
        final TextView textView=findViewById(R.id.textView18);
        solve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String accInput=editText.getText().toString();
                final String velInput=editText2.getText().toString();
                final String timInput=editText3.getText().toString();
                if (accInput.equals("")) {
                    int veloInput=Integer.parseInt(velInput);
                    int timeInput=Integer.parseInt(timInput);
                    int value=veloInput/timeInput;
                    String strValue=Integer.toString(value);
                    textView.setText(strValue);
                } else if (velInput.equals("")) {
                    int accelInput=Integer.parseInt(accInput);
                    int timeInput=Integer.parseInt(timInput);
                    int value=accelInput*timeInput;
                    String strValue=Integer.toString(value);
                    textView.setText(strValue);
                } else if (timInput.equals("")) {
                    int veloInput=Integer.parseInt(velInput);
                    int accelInput=Integer.parseInt(accInput);
                    int value=veloInput/accelInput;
                    String strValue=Integer.toString(value);
                    textView.setText(strValue);
                }
            }
        });

    }
}
