package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionTest {
    private Calculator calculator = new Calculator();

    @DataProvider (name="MinusTestDataDouble")
    public static Object[][] getMinusTestDataDouble() {
        return new Object[][] {
                {1d, 1d, 0d},
                {1000000d, 0d, 1000000d},
                {5.50d, 7.9d, -2.4d},
                {-8d, 10d, -18d},
                {105d, -296d, 401d}
        };
    }
    @Test (dataProvider = "MinusTestDataDouble", groups = {"smoke"})
    public void minusTest(double x, double y, double result) {
        Assert.assertEquals(calculator.sub(x, y), result, 0.001, "MinusDouble is incorrect" );
    }

    @DataProvider (name="MinusTestDataLong")
    public static Object[][] getMinusTestDataLong() {
        return new Object[][] {
                {1l, 1l, 0l},
                {1000000l, 0l, 1000000l},
                {-8l, 10l, -18l},
                {105l, -296l, 401l}
        };
    }
    @Test (dataProvider = "MinusTestDataLong")
    public void minusTest(long x, long y, long result) {
        Assert.assertEquals(calculator.sub(x, y), result, "MinusLong is incorrect" );
    }

}
