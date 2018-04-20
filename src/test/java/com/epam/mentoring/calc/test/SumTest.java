package com.epam.mentoring.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class SumTest {
    private Calculator calculator = new Calculator();
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Test Suite is started");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Test Class is started");
    }

    @BeforeMethod
    public void beforeMethod()    {
        System.out.println("Test Method is started");
    }
    @DataProvider(name = "SumTestDataDouble")
    public static Object[][] getSumTestData() {
        return new Object[][] {
                {1d, 1d, 2d},
                {1000000d, 0d, 1000000d},
                {5.5d, 7.9d, 13.4d},
                {8d, -10d, -2d}
        };
    }
    @Test (dataProvider = "SumTestDataDouble", groups = {"smoke"})
    public void sumTest(double x, double y, double result) {
        Assert.assertEquals(calculator.sum(x, y), result, 0.001,"SumDouble is incorrect");
    }

    @DataProvider(name = "SumTestDataLong")
    public static Object[][] getSumTestDataLong() {
        return new Object[][] {
                {1l, 1l, 2l},
                {1000000l, 0l, 1000000l},
                {8l, -10l, -2l},
                {-1000l, -999999l, -1000999l}
        };
    }
    @Test (dataProvider = "SumTestDataLong")
    public void sumTest(long x, long y, long result) {
        Assert.assertEquals(calculator.sum(x, y), result, "SumLong is incorrect");
    }

    @AfterMethod
    public void afterMethod()    {
        System.out.println("Test Method is finished");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Test Class is finished");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Test Suite is finished");
    }
}
