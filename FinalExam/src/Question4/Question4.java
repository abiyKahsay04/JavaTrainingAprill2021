	/* Write a program that takes a string and displays the vowels count in the input string.
Vowels are: a, e, i, o, u
Example: 	Input:  africa
output :  3
input : sky
Output : 0
 	use the String methods, charAt, and contains. */


	package Question4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a word");
		  
		 String a = scan.nextLine();
		 System.out.println("Vowels in a string are"); 
		 
		 	int count =0;
			for(int i=0;i<a.length();i++) {
				
				if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
					count++;
				}
			}
			System.out.println(count);
		 
		
		

	}

}
