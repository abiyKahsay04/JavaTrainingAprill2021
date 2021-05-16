/* Write a program that accepts mark of a student and prints the grade
If the average of marks is >= 90 then prints Grade ‘A’
If the average of mark is >=80 then prints Grade ‘B’
If the average of mark is >=70 then prints Grade ‘C’
If the average of mark is >=50 then prints Grade ‘D’
else prints Grade ‘F’
Note: Mark of a student should be between 0 and 100 */

package Question2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Your grade value is");
		try {
			int a = scan.nextInt();
			
			if (a <= 100 && a >=0){

			if (a >= 90) {
				System.out.println("Grade A");
			}

			else if (a >= 80) {
				System.out.println("Grade B");
			}

			else if (a >= 70) {
				System.out.println("Grade C");
			} else if (a >= 50) {
				System.out.println("Grade D");
			} else {
				System.out.println("Grade F");
			}
			}
			else {
				System.out.println("Invalud input");
			}
		} catch (Exception e) {
			System.out.println("Something went wrong.");

		}

		{

		}
	}
}
