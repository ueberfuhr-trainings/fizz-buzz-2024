package de.sample;

public class FizzBuzz {

  public String calculate(int i) {
    if (i % 3 == 0) {
      return "Fizz";
    }
    return Integer.toString(i);
  }

}
