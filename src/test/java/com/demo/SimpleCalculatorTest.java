package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SimpleCalculatorTest {

  @Test
  void shouldAddTwoNumbers() {
    var calc = new SimpleCalculator();
    assertEquals(4, calc.add(2, 2));
    assertNotEquals(0, calc.add(2, 2));
    assertEquals(9, calc.add(7, 2));
    assertEquals(5, calc.add(2, 3));
  }
}