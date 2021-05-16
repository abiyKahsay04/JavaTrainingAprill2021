import java.util.Scanner;

public class Question3 {
		public static void main(String[] args) {
			Scanner scan= new Scanner (System.in);
			System.out.println("Enter a number below");
			
			int x = scan.nextInt();
			int[]Array= {12,4,67,3,7};
			
			for(int i = 0; i<Array.length; i++) {
				if(x == Array[i]) {
					System.out.println(x+ " the number is listed on index " + i);
				}
			}
				
			
		}
			

}