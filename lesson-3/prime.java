class Main {
  public static void main(String args[]) {
    int number = 13;
    System.out.println("Is the number prime? " + Utilities.isPrime(number, true));
  }
}

class Utilities {
  static boolean isPrime(int x) {
    return isPrime(x, false);
  }
  static boolean isPrime(int x, boolean shouldPrint) {
    // a number is prime if you can only reach that number by multiplying itself and 1
    // a number is prime if you cannot reach that number by multiplying any two numbers except for 1 and the number
    // 25 / 2 = 12.5
    // 25 / 3 = 
    // 25 / 4 = 
    // 25 / 5 = 5 -> 25 is not prime because 5*5 = 25
    int i = 2;
    while (i < x) {
      int remainder = x % i;
      if (remainder == 0) {
        if (shouldPrint) {
          System.out.println(x + " is not prime because " + i + " * " + x / i + " = " + x);
        }
        return false;
      }
      i = i + 1;
    }
    if (shouldPrint) {
      System.out.println(x + " is prime");
    }
    return true;
  }
}

