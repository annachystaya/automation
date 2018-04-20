package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name = "IsPositiveTestData")
    public static Object[][] isPositiveTestData() {
        return new Object[][] {
                {-10l, false},
                {10, true},
                {0, false}
        };
    }
    @Test(dataProvider = "IsPositiveTestData")
    public void isPositiveTest(long x, boolean result) {
        Assert.assertEquals(calculator.isNegative(x), result,"Is Positive Test is incorrect");
    }
}
