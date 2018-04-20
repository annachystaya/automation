package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name = "IsNegativeTestData")
    public static Object[][] isNegativeTestData() {
        return new Object[][] {
                {-10l, true},
                {10, false},
                {0, false}
        };
    }
    @Test(dataProvider = "IsNegativeTestData")
    public void isNegativeTest(long x, boolean result) {
        Assert.assertEquals(calculator.isNegative(x), result,"Is Negative Test is incorrect");
    }
}


