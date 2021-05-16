import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter first num");
		int a= input.nextInt();
		
		System.out.println("enter second num");
		 
		
		int b=input.nextInt();
		
		int c=(a+b);
		int d=(a-b);
		System.out.println("sum " + c);
		System.out.println("difference " + d);
		
	}

}
