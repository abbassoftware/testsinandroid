package com.testsinandroid;

/**
 * Created by abbas on 9/4/17.
 */
public class NumberAdder {

       private final MainActivity mMainActivity;
       public NumberAdder(MainActivity activity) {
            mMainActivity = activity;
        }

    public void performAddition() {

        double number1 = mMainActivity.getFirstNumber();
        double number2 = mMainActivity.getSecondNumber();

        if(!isNumberValid(number1) || !isNumberValid(number2)) {
            throw new RuntimeException("invalid numbers");
        }

        double result = number1 + number2;

        mMainActivity.setAdditionResult(result);
    }

    boolean isNumberValid(double number) {
        if(number > 0) {
            return true;
        } else {
            return false;
        }
    }


}
