package com.testsinandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {


    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;

    NumberAdder numberAdder = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.txtNumber1);
        secondNumber = (EditText)findViewById(R.id.txtNumber2);
        addResult = (TextView)findViewById(R.id.txtResult);
        btnAdd = (Button)findViewById(R.id.btnAdd);

        if(numberAdder == null) {
            numberAdder = new NumberAdder(this);
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberAdder.performAddition();
            }
        });


    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText().toString());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText().toString());
    }

    public void setAdditionResult(double result) {
        addResult.setText(Double.toString(result));
    }

}
