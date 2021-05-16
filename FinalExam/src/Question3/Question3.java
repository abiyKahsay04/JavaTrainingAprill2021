	/*Write a program that takes a number and prints n row pyramid accordingly 
For example: if a user inputs 3, it prints the below three ‘*’ in three rows
*
**
***
If the user inputs 5, then it prints 5 rows as pyramid 
*
**
***
****
***** */


	package Question3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your input");

		int rows = scan.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
	}
	}
}
