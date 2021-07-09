import java.util.Scanner;

/**
 * A string is said to be palindrome if reverse of the string is same as string.
 * For example, “abba” is palindrome, but “abbc” is not palindrome.
 */

public class Palindrome {

  public static void main(String[] args) {

      String real;
      StringBuilder reverse = new StringBuilder();

      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string/number to check if it is a palindrome");
      real = in.nextLine().toLowerCase();

      // Find the length of the string
      int length = real.length();

      //Check if the last element of the string is equal to the first element
      for ( int i = length - 1; i >= 0; i-- )
          reverse.append(real.charAt(i));
      if (real.equals(reverse.toString()))
          System.out.println("Entered string/number is a palindrome.");
      else
          System.out.println("Entered string/number isn't a palindrome.");
  }
}
