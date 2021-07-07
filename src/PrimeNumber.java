import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number to check if it is a prime or not: ");
      int num = in.nextInt();
      in.close();

      if (isPrime(num))
          System.out.println(num + " is a Prime");

      else
          System.out.println(num + " is not a Prime");
  }

  // function to check check if it is a prime or not
    private static boolean isPrime(int num) {

        // Check if number is less than or equal to 1
        //Because 0 & 1 are not prime numbers
        if (num <= 1)
            return false;

        // Check if numbers are 2 or 3
        //Because 2 & 3 are natural primes
        if (num == 2 || num == 3)
            return true;

        // Check if number is a multiple of 2
        // Because a prime number cannot be a perfect division
        else if (num % 2 == 0)
            return false;

    // Check if a number is a multiple of any integer between 2 and sqrt{num}
    int sqrt = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        } return true;
    }
}

