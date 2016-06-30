package com.example.vishal.phonesicalcapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleInterest extends AppCompatActivity implements View.OnClickListener {
    TextView PA;
    TextView Interest_Rate;
    TextView Years;
    EditText PA_bar;
    EditText IR_bar;
    EditText year_bar;
    Button calculate;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        PA = (TextView) findViewById(R.id.PA);
        Interest_Rate = (TextView) findViewById(R.id.Interest_Rate);
        Years = (TextView) findViewById(R.id.Years);
        PA_bar = (EditText) findViewById(R.id.PA_bar);
        IR_bar = (EditText) findViewById(R.id.IR_bar);
        year_bar = (EditText) findViewById(R.id.year_bar);
        calculate = (Button) findViewById(R.id.calculate);
        edt1 = (EditText) findViewById(R.id.edt1);
        //the try catch block is very necessary as it comes with NullpointerException or OutofMemory Exception so it prevents from such ocuurences.
        try {
            calculate.setOnClickListener(this);

        } catch (Exception e) {


        }
    }
    //This gives us the calculated value using the formula of Simple Interest and is invoked by using the OnClick function.
    @Override public void onClick(View v) {
        int num1 = Integer.parseInt(PA_bar.getText().toString());
        int num2 = Integer.parseInt(IR_bar.getText().toString());
        int num = Integer.parseInt(year_bar.getText().toString());

        int si = (num1 * num2 * num) / 100;
        //the setText() metod then sets the result of the equation into the edittext that is predefined.
        edt1.setText(Integer.toString(si));
    }

}
