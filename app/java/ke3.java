package com.example.jordan.physicshelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ke3 extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ke3);

            final EditText editText1=findViewById(R.id.editText1);
            final EditText editText2=findViewById(R.id.editText2);
            final EditText editText3=findViewById(R.id.editText3);
            final EditText editText4=findViewById(R.id.editText4);
            Button solve=findViewById(R.id.solve);
            final TextView textView=findViewById(R.id.textView5);
            solve.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){
                    final String vfInput=editText1.getText().toString();
                    final String viInput = editText2.getText().toString();
                    final String accInput = editText3.getText().toString();
                    final String timInput=editText4.getText().toString();
                    if (vfInput.equals("")) {
                        double timeInput = Double.parseDouble(timInput);
                        double vinInput = Double.parseDouble(viInput);
                        double accelInput = Double.parseDouble(accInput);
                        double value = vinInput+(accelInput*timeInput);
                        String strValue = Double.toString(value);
                        textView.setText(strValue);
                    }
                    else if (viInput.equals("")) {
                        double timeInput = Double.parseDouble(timInput);
                        double vfinInput = Double.parseDouble(vfInput);
                        double accelInput = Double.parseDouble(accInput);
                        double value = vfinInput-(accelInput*timeInput);
                        String strValue = Double.toString(value);
                        textView.setText(strValue);
                    }
                    else if (timInput.equals("")) {
                        double vinInput = Double.parseDouble(viInput);
                        double vfinInput = Double.parseDouble(vfInput);
                        double accelInput = Double.parseDouble(accInput);
                        double value = (vfinInput-vinInput)/accelInput;
                        String strValue = Double.toString(value);
                        textView.setText(strValue);
                    } else if (accInput.equals("")) {
                        double timeInput = Double.parseDouble(timInput);
                        double vinInput = Double.parseDouble(viInput);
                        double vfinInput = Double.parseDouble(vfInput);
                        double value = (vfinInput-vinInput)/timeInput;
                        String strValue = Double.toString(value);
                        textView.setText(strValue);
                    }
                }
            });
        }
    }
