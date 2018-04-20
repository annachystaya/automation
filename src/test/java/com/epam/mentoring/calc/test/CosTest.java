package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name="CosTestData")
    public static Object[][] getCosTestData() {
        return new Object[][] {
                {Math.toRadians(60), 0.5d},
                {Math.toRadians(90), 0d},
                {Math.toRadians(180), -1d}

        };
    }
    @Test(dataProvider = "CosTestData")
    public void cosTest(double x, double result) {
        Assert.assertEquals(calculator.cos(x), result, 0.001,"Cos is incorrect" );
    }
}
