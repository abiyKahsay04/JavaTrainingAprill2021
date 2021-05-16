import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		//Write a Java program to copy an array by iterating the array.
			
	int [] i = {2,3,6,7,8};
	int [] e = new int[i.length];

	for(int j =0; j<i.length; j++) {
		e[j]=i[j];
		
		System.out.print(e[j]);
		System.out.print(", ");
	}
	
	
	
	
	}

}
