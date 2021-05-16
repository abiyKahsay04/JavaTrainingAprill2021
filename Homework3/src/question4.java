import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// Write a program that takes a positive integer input and prints all the positive even number less 
		//than the number in order from big to small.(Use do while loop)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = input.nextInt();
	    int x = 0;
	    do {
	    	
	        x++;
	        i--;
	    	if(i % 2 == 0){
	        	System.out.println(i);
	        }
	 		--i;
	    }
	    while (x < i); 
	    	System.out.println(x);
	}

}
