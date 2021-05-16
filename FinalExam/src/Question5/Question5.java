/* Write a program that validates a phone number input,  make sure the length of the input is 10 digits
			Example: 	“6414514473” -  		Valid phone number
		      			“62354609845454” - 	Invalid phone number (too long)
						“56454”			Invalid phone number (too short) */

package Question5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a digits of phone number");

		long i = scan.nextLong();
		long size = (long)(Math.log10(i)) + 1;

		if (size == 10) {
			System.out.println("Valid phone number");

		} else if (size < 10) {
			System.out.println("Invalid phone number (too short)");

		} else {
			System.out.println("Invalid phone number (too long)");
		}

	}

}
