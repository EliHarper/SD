package com.skilldistillery.exceptionsjunit.labz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.exceptionsjunit.labs.Calculator;

public class CalculatorTests {
private Calculator calc;
  
  @Before
  public void setUp() {
    calc = new Calculator();
  }
  
  @After
  public void tearDown() {
    calc = null;
  }
  
  @Test
  public void test_add_adds_two_numbers() {
    assertEquals(6, calc.add(1, 5));
  }
  
  @Test
  public void test_subtract_subtracts_second_from_first() {
    assertEquals(7, calc.subtract(4, -3));
    assertEquals(2, calc.subtract(5, 3));
  }
  
  @Test
  public void test_multiply_multiplies_both_numbers() {
    assertEquals(12, calc.multiply(3, 4));
    assertEquals(-12, calc.multiply(3, -4));
  }
  
  @Test
  public void test_divide_int_divides_numerator_by_denominator() {
    assertEquals(2, calc.divide(6, 3));
    assertEquals(-2, calc.divide(6, -3));
  }
  
  @Test
  public void test_divide_int_loses_remainder() {
    assertEquals(2, calc.divide(7, 3));
  }
  
  @Test
  public void test_divide_double_divides_numerator_by_denominator() {
    assertEquals(2.0, calc.divide(6.0, 3.0), 0.01);
    assertEquals(-2.0, calc.divide(6.0, -3.0), 0.01);
  }
  
  @Test(expected=ArithmeticException.class)
  public void test_int_divide_by_zero_throws_ArithmeticException() {
	  int result = 5/0;
  }
  @Test
  public void test_int_divide_by_zero_throws_ArithmeticException_try_catch() {
	 try {
	  int result = 5/0;
	  fail("Expected ArithmeticException");
	 }
	 catch(Exception e){
	 }
  }
}
