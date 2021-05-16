	//In the main class create 3 objects triangle, rectangle and polygon.

	package homework5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter color");
		
		String color = scan.nextLine();
		System.out.println("Enter side");
		
		int side = scan.nextInt();
		
		Polygon triangle = new Polygon(color, side);
		Polygon rectangle= new Polygon(color, side);
		Polygon polygon = new Polygon(color, side);
		
		System.out.println("trangle "+ triangle.color);
		System.out.println("trangle "+ triangle.side );
		
		System.out.println("rectangle "+ rectangle.color);
		System.out.println("rectangle "+ rectangle.side);
		
		System.out.println("polygon "+ polygon.color);
		System.out.println("polygon "+ polygon.side);
		
		ThreeDimentionalShape threeD = new ThreeDimentionalShape("yellow", 4 , 12);
		
		threeD.height(6);	
		threeD.colorCode("Black");	
		threeD.sideCode(8);	
	}
	
}
