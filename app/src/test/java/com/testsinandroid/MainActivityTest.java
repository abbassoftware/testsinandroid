
package com.testsinandroid;


import org.junit.Test;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;
import org.robolectric.RobolectricGradleTestRunner;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {

    MainActivity activity;
    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;
    @Before
    public void setUp() {
        activity = Robolectric.setupActivity(MainActivity.class);
        firstNumber = (EditText)activity.findViewById(R.id.txtNumber1);
        secondNumber = (EditText)activity.findViewById(R.id.txtNumber2);
        addResult = (TextView)activity.findViewById(R.id.txtResult);
        btnAdd = (Button) activity.findViewById(R.id.btnAdd);
    }

    @Test
    public void testMainActivityAddition() {
        //setup 

        firstNumber.setText("12.2");
        secondNumber.setText("13.3");

        //test
        btnAdd.performClick();

        //verify
        assertEquals(25.5, Double.parseDouble(addResult.getText().toString()), 0.0);

    }
}