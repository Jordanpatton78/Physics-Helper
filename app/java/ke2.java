package com.example.jordan.physicshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ke2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ke2);

        final EditText editText1=findViewById(R.id.editText1);
        final EditText editText2=findViewById(R.id.editText2);
        final EditText editText3=findViewById(R.id.editText3);
        final EditText editText4=findViewById(R.id.editText4);
        final EditText editText5=findViewById(R.id.editText5);
        Button solve=findViewById(R.id.solve);
        final TextView textView=findViewById(R.id.textView5);
        solve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                final String disInput=editText1.getText().toString();
                final String viInput = editText2.getText().toString();
                final String timInput = editText3.getText().toString();
                final String tim2Input=editText4.getText().toString();
                final String accInput=editText5.getText().toString();
                if (disInput.equals("")) {
                    double timeInput = Double.parseDouble(timInput);
                    double vinInput = Double.parseDouble(viInput);
                    double time2Input = Double.parseDouble(tim2Input);
                    double accelInput = Double.parseDouble(accInput);
                    double timeSqInput=Math.pow(time2Input,2.0);
                    double value = (vinInput*timeInput)+(.5*accelInput*timeSqInput);
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
                else if (viInput.equals("")) {
                    double timeInput = Double.parseDouble(timInput);
                    double distInput = Double.parseDouble(disInput);
                    double time2Input = Double.parseDouble(tim2Input);
                    double accelInput = Double.parseDouble(accInput);
                    double timeSqInput=Math.pow(time2Input,2.0);
                    double value = (distInput-(.5*accelInput*timeSqInput))/timeInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
                else if (timInput.equals("") && tim2Input.equals("")) {
                    String strValue = "Please use the equation vf=vi+aΔt.";
                    textView.setText(strValue);
                } else if (accInput.equals("")) {
                    double timeInput = Double.parseDouble(timInput);
                    double vinInput = Double.parseDouble(viInput);
                    double time2Input = Double.parseDouble(tim2Input);
                    double distInput = Double.parseDouble(disInput);
                    double timeSqInput=Math.pow(time2Input,2.0);
                    double value = ((2.0*distInput)-(vinInput*timeInput))/timeSqInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
            }
        });
    }
}
