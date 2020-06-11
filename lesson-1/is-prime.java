class IsPrime {
  public static void main(String args[]) {
    // a number is prime if you can only reach that number by multiplying itself and 1
    // a number is prime if you cannot reach that number by multiplying any two numbers except for 1 and the number
    int x = 155;
    // 25 / 2 = 12.5
    // 25 / 3 = 
    // 25 / 4 = 
    // 25 / 5 = 5 -> 25 is not prime because 5*5 = 25
    int i = 2;
    while (i < x) {
      int remainder = x % i;
      if (remainder == 0) {
        System.out.println(x + " is not prime because " + i + " * " + x / i + " = " + x);
        return;
      }
      i = i + 1;
    }
    System.out.println(x + " is prime");
  }
}
