import java.util.Scanner;

/**
 * An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of
 * their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number Example:-
 * 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
 */
public class PrintArmstrongNumber {
  // function to check if the number is Armstrong or not
  static boolean isArmstrong(int num) {
    int temp = num;
    int len = 0;

    // check the length of the string
    while (temp > 0) {
      temp /= 10;
      len++;
    }
    int temp2 = num;
    int sum = 0;
    // Reverse the string and add the digit with the power i.e the length of the string
    while (temp2 > 0) {
      int rem = temp2 % 10;
      sum += (Math.pow(rem, len));
      temp2 = temp2 / 10;
    }
    if (sum==num)
        return true;
    else
        return false;
  }
  public static void main(String[] args) {
      int num;
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the limit: ");
      num=sc.nextInt();
      System.out.println("Armstrong Number up to "+ num + " are: ");
      for(int i=0; i<=num; i++)
//function calling
          if(isArmstrong(i))
//prints the armstrong numbers
              System.out.print(i+ ", ");
  }
}
