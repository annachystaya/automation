package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name="TangTestData")
    public static Object[][] getTangTestData() {
        return new Object[][] {
                {Math.toRadians(45), 1d},
                {Math.toRadians(135), -1d},
                {Math.toRadians(180),0d}
        };
    }
    @Test(dataProvider = "TangTestData")
    public void tangTest(double x, double result) {
        Assert.assertEquals(calculator.tg(x), result, 0.0001,"Tang is incorrect" );
    }
}
