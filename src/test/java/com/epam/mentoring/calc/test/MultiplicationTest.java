package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest {

    private Calculator calculator = new Calculator();

    @DataProvider(name="MultipleTestDataDouble")
    public static Object[][] getMultiplyTestDataDouble() {
        return new Object[][] {
                {10d, 1d, 10d},
                {1000000d, 0d, 0d},
                {5.50d, 7.908d, 43.494d},
                {-835d, 0.01d, -8.35d},
                {-1005d, -100d, 100500d}
        };
    }
    @Test(dataProvider = "MultipleTestDataDouble", groups = {"smoke"})
    public void multipleTest(double x, double y, double result) {
        Assert.assertEquals(calculator.mult(x, y), result, "Multiply is incorrect");
    }

    @DataProvider(name="MultipleTestDataLong")
    public static Object[][] getMultiplyTestDataLong() {
        return new Object[][] {
                {10l, 1l, 10l},
                {1000000l, 0l, 0l},
                {-835l, 105l, -87675l},
                {-1005l, -100l, 100500l}
        };
    }
    @Test(dataProvider = "MultipleTestDataLong")
    public void multipleTest(long x, long y, long result) {
        Assert.assertEquals(calculator.mult(x, y), result, "Multiply is incorrect");
    }
}
