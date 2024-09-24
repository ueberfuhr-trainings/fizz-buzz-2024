package de.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

  @Test
  void shouldReturnNumberFor1() {
    var fizzbuzz = new FizzBuzz();
    var result = fizzbuzz.calculate(1);
    Assertions.assertEquals("1", result);
  }

  @Test
  void shouldReturnNumberFor2() {
    var fizzbuzz = new FizzBuzz();
    var result = fizzbuzz.calculate(2);
    Assertions.assertEquals("2", result);
  }

  @Test
  void shouldReturnNumberFor3() {
    var fizzbuzz = new FizzBuzz();
    var result = fizzbuzz.calculate(3);
    Assertions.assertEquals("Fizz", result);
  }

  @Test
  void shouldReturnNumberFor6() {
    var fizzbuzz = new FizzBuzz();
    var result = fizzbuzz.calculate(6);
    Assertions.assertEquals("Fizz", result);
  }

}
