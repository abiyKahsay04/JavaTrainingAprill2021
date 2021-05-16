
	//Create an account for “Hagos Gebru” Account number 10001 with an initial balance of $5000. Withdraw $3000 and deposit $1000.
	//Create an account for “James Bond” Account number 10002 with initial balance $3000 and withdraw $4000. 


public class BankingAccount {

	public static void main(String[] args) {
		
		Account hagosAccount= new Account("Hagos","Gebru", 5000);
		Account jamesAccount= new Account("James", "Bond" , 3000);
		
		System.out.println(hagosAccount);
		
		hagosAccount.debit(3000);
		hagosAccount.debit(1000);
		
		
		System.out.println(jamesAccount);
		jamesAccount.debit(4000);
		
		
		
		

	}

}
