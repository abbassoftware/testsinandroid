package com.testsinandroid;
import com.testsinandroid.MainActivity;
import com.testsinandroid.NumberAdder;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumberAdderTest {

    @Mock
    MainActivity mMockMainActivity;

    @Test
    public void testIsNumberValid() {
        //setup

        //test
        NumberAdder numberAdder = new NumberAdder(mMockMainActivity);
        assert(numberAdder.isNumberValid(55.0));

    }

    @Test
    public void testIsNumberNotValid() {
        //setup

        //test
        NumberAdder numberAdder = new NumberAdder(mMockMainActivity);
        assertFalse(numberAdder.isNumberValid(-55.0));

    }

    @Test
    public void testPerformAddition() {
        //setup
        when(mMockMainActivity.getFirstNumber())
                .thenReturn(10.0);
        when(mMockMainActivity.getSecondNumber())
                .thenReturn(11.0);

        //test
        NumberAdder numberAdder = new NumberAdder(mMockMainActivity);
        numberAdder.performAddition();

        //verify
        verify(mMockMainActivity).setAdditionResult(21.0);


    }

}