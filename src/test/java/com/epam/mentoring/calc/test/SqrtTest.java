package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name="SqrtTestData")
    public static Object[][] getSqrtTestData() {
        return new Object[][] {
                {64d, 8d},
                {2.25d, 1.5d},
          //      {-100d, "Invalid argument"}
        };
    }
    @Test(dataProvider = "SqrtTestData")
    public void sqrtTest(double x, double result) {
        Assert.assertEquals(calculator.sqrt(x), result, 0.0001,"Sqrt is incorrect" );
    }
}
