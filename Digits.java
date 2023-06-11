/* Write a program to obtain a number (N) from the user and display whether the number is a one digit number, 2 digit number, 3 digit    	number or more than 3 digit number */

import java.util.Scanner;

public class Digits 
{
    public static void main(String[] args) 
	  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digits = getDigitCount(number);
        String digitType = getDigitType(digits);
        System.out.println("Number of digits: " + digits);
        System.out.println("Digit type: " + digitType);
     }

    private static int getDigitCount(int number) 
	    {
      	  return String.valueOf(Math.abs(number)).length();
    	}

    private static String getDigitType(int digits) 
	    {
        	if (digits == 1) 
		      {
            	return "One-digit number";
        	 } 
		      else if (digits == 2) 
		      {
            	return "Two-digit number";
        	} 
		      else if (digits == 3) 
		      {
            	return "Three-digit number";
        	} 
		      else 
		      {
            	return "More than three-digit number";
        	}
    	}
}
