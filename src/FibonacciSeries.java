import java.util.Scanner;
/*
The Fibonacci series is a series of elements where,
the previous two elements are added to get the next element, starting with 0 and 1.
Example:--
Input: N = 10
Output: 0 1 1 2 3 5 8 13 21 34
 */

public class FibonacciSeries {

  static void fibonacci(int n) {

    int num1 = 0, num2 = 1, count = 0;

    // Iterate till the count is n
    while (count < n) {

      // Print the number
      System.out.print(num1 + " ");

      // swap the value of the number using a new integer
      int num3 = num2 + num1;
      num1 = num2;
      num2 = num3;
      // Increment the count
      count = count + 1;
    }
  }
  // Main method to get the Number and to run the code
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number for the length of the series : ");
      int num = in.nextInt();
      in.close();

      // call the function Fibonacci
       fibonacci(num);
    }
  }
