/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author PC
 */


import org.testng.Assert;
import org.testng.annotations.Test;
import poly.com.ui.Calculator;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd_PositiveNumbers() {
        Assert.assertEquals(calc.add(5, 3), 8);
    }

    @Test
    public void testSub_PositiveNumbers() {
        Assert.assertEquals(calc.sub(10, 4), 6);
    }

    @Test
    public void testMul_PositiveNumbers() {
        Assert.assertEquals(calc.mul(6, 7), 42);
    }

    @Test
    public void testDiv_PositiveNumbers() {
        Assert.assertEquals(calc.div(20, 5), 4);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDiv_ByZero_ShouldThrow() {
        calc.div(10, 0);
    }
}

