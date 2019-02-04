package com.example.jordan.physicshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ke4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ke4);

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
                final String disInput=editText4.getText().toString();
                if (vfInput.equals("")) {
                    double distInput = Double.parseDouble(disInput);
                    double vinInput = Double.parseDouble(viInput);
                    double accelInput = Double.parseDouble(accInput);
                    double vinSqInput=Math.pow(vinInput,2.0);
                    double value = Math.sqrt(vinSqInput+((2*accelInput)*distInput));
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
                else if (viInput.equals("")) {
                    double distInput = Double.parseDouble(disInput);
                    double vfinInput = Double.parseDouble(vfInput);
                    double accelInput = Double.parseDouble(accInput);
                    double vfinSqInput=Math.pow(vfinInput,2.0);
                    double value = Math.sqrt(vfinSqInput-(2*accelInput)*distInput);
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
                else if (accInput.equals("")) {
                    double distInput = Double.parseDouble(disInput);
                    double vinInput = Double.parseDouble(viInput);
                    double vinSqInput = Math.pow(vinInput,2.0);
                    double vfinInput = Double.parseDouble(vfInput);
                    double vfinSqInput=Math.pow(vfinInput,2.0);
                    double value = (vfinSqInput-vinSqInput)/(2*distInput);
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                } else if (disInput.equals("")) {
                    double vinInput = Double.parseDouble(viInput);
                    double vinSqInput = Math.pow(vinInput,2.0);
                    double vfinInput = Double.parseDouble(vfInput);
                    double vfinSqInput=Math.pow(vfinInput,2.0);
                    double accelInput=Double.parseDouble(accInput);
                    double value = (vfinSqInput-vinSqInput)/(2*accelInput);
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
            }
        });
    }
}
