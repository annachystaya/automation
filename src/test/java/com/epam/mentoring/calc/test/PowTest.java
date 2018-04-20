package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest {

    private Calculator calculator = new Calculator();

    @DataProvider(name="PowTestDataDouble")
    public static Object[][] PowTestDataDouble() {
        return new Object[][] {
                {1d, 1d, 1d},
                {1000000d, 0d, 1d},
                //    {5.50d, 7.9d, 706098.43188d},
                {-8d, 5d, -32768d},
                {0.15d, 3d, 0.003375d}
        };
    }
    @Test(dataProvider = "PowTestDataDouble")
    public void powTest(double x, double y, double result) {
        Assert.assertEquals(calculator.pow(x, y), result, 0.001, "ExponentiationDouble is incorrect" );
    }

}
