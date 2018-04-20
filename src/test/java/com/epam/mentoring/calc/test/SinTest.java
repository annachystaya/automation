package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class SinTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name="SinTestData")
    public static Object[][] getSinTestData() {
        return new Object[][] {
                {Math.toRadians(30), 0.5d},
                {Math.toRadians(90), 1d},
                {Math.toRadians(150),0.5d},
                {Math.toRadians(180), 0d}

        };
    }
    @Test(dataProvider = "SinTestData")
    public void sinTest(double x, double result) {
        Assert.assertEquals(calculator.sin(x), result, 0.0001,"Sin is incorrect" );
    }

}
