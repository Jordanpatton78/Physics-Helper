package com.example.jordan.physicshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ke1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ke1);

        final EditText editText1=findViewById(R.id.editText1);
        final EditText editText2=findViewById(R.id.editText2);
        final EditText editText3=findViewById(R.id.editText3);
        final EditText editText4=findViewById(R.id.editText4);
        Button solve=findViewById(R.id.solve);
        final TextView textView=findViewById(R.id.textView5);
        solve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                final String disInput=editText1.getText().toString();
                final String viInput = editText2.getText().toString();
                final String vfInput = editText3.getText().toString();
                final String timInput=editText4.getText().toString();
                if (disInput.equals("")) {
                    double timeInput = Double.parseDouble(timInput);
                    double vinInput = Double.parseDouble(viInput);
                    double vfinInput = Double.parseDouble(vfInput);
                    double value = .5*(vinInput+vfinInput)*timeInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
                else if (viInput.equals("")) {
                    double distInput = Double.parseDouble(disInput);
                    double vfinInput = Double.parseDouble(vfInput);
                    double timeInput = Double.parseDouble(timInput);
                    double value = ((2.0*distInput)/timeInput)-vfinInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
                else if (vfInput.equals("")) {
                    double distInput = Double.parseDouble(disInput);
                    double vinInput = Double.parseDouble(viInput);
                    double timeInput = Double.parseDouble(timInput);
                    double value = ((2.0*distInput)/timeInput)-vinInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                } else if (timInput.equals("")) {
                    double distInput = Double.parseDouble(disInput);
                    double vfinInput = Double.parseDouble(vfInput);
                    double vinInput = Double.parseDouble(viInput);
                    double value = ((2.0*distInput)/(vinInput+vfinInput));
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
            }
        });
    }
}
