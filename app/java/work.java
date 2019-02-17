package com.example.jordan.physicshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class work extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final EditText editText1 = findViewById(R.id.editText1);
        final EditText editText2 = findViewById(R.id.editText2);
        final EditText editText3 = findViewById(R.id.editText3);
        final EditText editText4 = findViewById(R.id.editText4);
        final EditText editText5 = findViewById(R.id.editText5);
        final EditText editText6 = findViewById(R.id.editText6);
        Button solve = findViewById(R.id.solve);
        final TextView textView = findViewById(R.id.textView5);
        solve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String w1Input = editText1.getText().toString();
                final String fInput = editText2.getText().toString();
                final String dInput = editText3.getText().toString();
                final String mInput = editText4.getText().toString();
                final String vfInput = editText5.getText().toString();
                final String w2Input = editText6.getText().toString();
                if (w1Input.equals("") && w2Input.equals("") && mInput.equals("") && vfInput.equals("")) {
                    double forInput = Double.parseDouble(fInput);
                    double disInput = Double.parseDouble(dInput);
                    double value = forInput * disInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                } else if (fInput.equals("") && w2Input.equals("") && mInput.equals("") && vfInput.equals("")) {
                    double work1Input = Double.parseDouble(w1Input);
                    double disInput = Double.parseDouble(dInput);
                    double value = work1Input / disInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                } else if (dInput.equals("") && w2Input.equals("") && mInput.equals("") && vfInput.equals("")) {
                    double forInput = Double.parseDouble(fInput);
                    double work1Input = Double.parseDouble(w1Input);
                    double value = work1Input / forInput;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                } else if (w2Input.equals("") && w1Input.equals("") && fInput.equals("") && dInput.equals("")) {
                    double massInput = Double.parseDouble(mInput);
                    double vfinInput = Double.parseDouble(vfInput);
                    double vfin2Input = Math.pow(vfinInput, 2.0);
                    double value = .5 * massInput * vfin2Input;
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                } else if (mInput.equals("") && w1Input.equals("") && fInput.equals("") && dInput.equals("")) {
                    double work2Input = Double.parseDouble(w2Input);
                    double vfinInput = Double.parseDouble(vfInput);
                    double vfin2Input = Math.pow(vfinInput, 2.0);
                    double value = 2.0 * (work2Input / vfin2Input);
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                } else if (vfInput.equals("") && w1Input.equals("") && fInput.equals("") && dInput.equals("")) {
                    double work2Input = Double.parseDouble(w2Input);
                    double massInput = Double.parseDouble(mInput);
                    double value = Math.sqrt((2.0 * work2Input) / massInput);
                    String strValue = Double.toString(value);
                    textView.setText(strValue);
                }
            }

            ;
        });

    }
}
