package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

  @Test
  void shouldReturnF() {
    var grader = new Grader();
    assertEquals('F', grader.determineLetterGrade(10));
    assertEquals('F', grader.determineLetterGrade(44));
    assertEquals('F', grader.determineLetterGrade(36));
    assertEquals('F', grader.determineLetterGrade(59));
  }

  @Test
  void shouldReturnD() {
    var grader = new Grader();
    assertEquals('D', grader.determineLetterGrade(69));
    assertEquals('D', grader.determineLetterGrade(65));
    assertEquals('D', grader.determineLetterGrade(60));
    assertEquals('D', grader.determineLetterGrade(61));
  }

  @Test
  void shouldReturnC() {
    var grader = new Grader();
    assertEquals('C', grader.determineLetterGrade(79));
    assertEquals('C', grader.determineLetterGrade(75));
    assertEquals('C', grader.determineLetterGrade(71));
    assertEquals('C', grader.determineLetterGrade(70));
  }

  @Test
  void shouldReturnB() {
    var grader = new Grader();
    assertEquals('B', grader.determineLetterGrade(89));
    assertEquals('B', grader.determineLetterGrade(81));
    assertEquals('B', grader.determineLetterGrade(85));
    assertEquals('B', grader.determineLetterGrade(80));
  }

  @Test
  void shouldReturnA() {
    var grader = new Grader();
    assertEquals('A', grader.determineLetterGrade(100));
    assertEquals('A', grader.determineLetterGrade(90));
    assertEquals('A', grader.determineLetterGrade(1000));
  }

  @Test
  void shouldThrowIllegalArgumentException() {
    var grader = new Grader();
    assertThrows(IllegalArgumentException.class,
      () -> grader.determineLetterGrade(-1)
    );
  }

}