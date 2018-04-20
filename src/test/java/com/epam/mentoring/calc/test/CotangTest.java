package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name="CotangTestData")
    public static Object[][] getCotangTestData() {
        return new Object[][] {
                {Math.toRadians(45), 1d},
                {Math.toRadians(90), 0d},
                {Math.toRadians(135),-1d}
        };
    }
    @Test(dataProvider = "CotangTestData")
    public void cotangTest(double x, double result) {
        Assert.assertEquals(calculator.ctg(x), result, 0.0001,"Cotang is incorrect" );
    }
}
