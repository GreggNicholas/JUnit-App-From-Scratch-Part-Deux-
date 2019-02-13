package com.example.junitappfromscratchpartdeux;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberHelperUnitTest {

    private NumberHelper numberHelper;

    @Before
    public void setup() throws Exception {
        numberHelper = NumberHelper.thisInstance();
    }

    @Test
    public void check_OddOrEven_With_Odd() {
        int testInt = 33;
        String expectedResult = "odd";

        String result = NumberHelper.thisInstance().oddOrEven(testInt);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void check_OddOrEven_With_Even() {
        int testInt = 32;
        String expectedResult = "even";

        String result = NumberHelper.thisInstance().oddOrEven(testInt);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void check_DivisibleBy5_With_True() {
        int testInt = 5;

        boolean result = NumberHelper.thisInstance().divisibleBy5(testInt);

        Assert.assertTrue(result);
    }

    @Test
    public void check_DivisibleBy5_With_False() {
        int testInt = 21;

        boolean result = NumberHelper.thisInstance().divisibleBy5(testInt);

        Assert.assertFalse(result);
    }

    @Test
    public void check_StringToNumber_With_Int_Value() {
        String testString = "5";
        int expectedResult = 5;
        int result = NumberHelper.thisInstance().stringToNumber(testString);

        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void check_ArraySum_With_Largest_int() {
        int[] testArray = {1, 2, 3, 4, 5};
        int expectedResult = 5;

        int result = NumberHelper.thisInstance().arraySum(testArray);

        Assert.assertEquals(expectedResult, result);

    }


    @After
    public void tearDown() throws Exception {
        numberHelper = null;
    }


}
