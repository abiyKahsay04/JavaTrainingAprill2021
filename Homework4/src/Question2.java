import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your pin");
		
		int a = scan.nextInt();
		int [] b = {12,7,14,5,2};
		boolean c = false;
		for(int i:b) {
			if(i == a) {
				c=true;
				break;
				
			}
		}
		
		if (c) {
			System.out.println(a + " The number is found on our file");
			
		}
		else {
			System.out.println(a +" your input is not in our record ");
		}
	}

}
