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

}
