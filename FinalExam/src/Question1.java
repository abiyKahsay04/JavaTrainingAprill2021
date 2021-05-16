	/* Write a program that have variables 
		Name (String)
		city_and_state (String)
		gross salary (double)
		tax (double) = 0.2
		net_salary(double)
		//Tax is always 20%.
		And print out the following.
		Eg: Hello my name is John Doe, I live in Charlotte NC, my gross salary is $100,000.
		I pay $20,000 in tax and I take home $80,000.*/

	
	public class Question1 {

	public static void main(String[] args) {
		
		String name= "John Doe";
		String city= "Charlotte NC";
		
		 double income = 100000;
		    double taxRate =income*0.2;                                            
		    double net = income*0.8;
		 
		    
		 
		   
		    System.out.print("Hello my name is John Doe, I live in Charlotte NC," + " Gross income is $" + (int)income +".");
		    System.out.print(" I pay $ " + taxRate + " in tax and");
		    System.out.println(" I take home $"+ net  );
		 
	}

}
