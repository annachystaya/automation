package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest {
    private Calculator calculator = new Calculator();

    @DataProvider(name = "DivisionTestDataDouble")
    public static Object[][] getDivTestDataDouble() {
        return new Object[][] {
                {10d, 1d, 10d},
                {-978d, 23d, -42.5217d},
                {8d, -0.1d, -80d}
        };
    }
    @Test(dataProvider = "DivisionTestDataDouble", groups = {"smoke"})
    public void divTest(double x, double y, double result) {
        Assert.assertEquals(calculator.div(x, y), result, 0.0001, "Division (double) is incorrect");
    }

    @DataProvider(name = "DivisionTestDataLong")
    public static Object[][] getDivTestDataLong() {
        return new Object[][] {
                {10l, 1l, 10l},
                {55l, 5l, 11l},
                {-978l, 23l, -42l},
                {8l, -10l, -0l}
        };
    }
    @Test(dataProvider = "DivisionTestDataLong")
    public void divTest(long x, long y, long result) {
        Assert.assertEquals(calculator.div(x, y), result,"Division (long) is incorrect");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divByZeroLongTest() throws NumberFormatException{
        calculator.div(100l, 0l);
    }

//    @Test(expectedExceptions = NumberFormatException.class)
//    public void divByZeroDoubleTest() throws NumberFormatException{
//        calculator.div(100d, 0d);
//    }
}
