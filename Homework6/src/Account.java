	/*Create a class called Account  that includes four pieces of information as instance variables
First Name (String)
Last Name (String)
Account Number (long) 
Balance  (double) */

	public class Account {
		private String firstName;
		private String lastName;
		private long accountNumber;
		private double balance;
		
		//Modify the Account class so that the account number auto increments every time a new account is created.
		//Hint: create static variable initialize to 10001 and increment it in the constructor.
		public static long accountIncrement=10000;

		//Your class should have a constructor that initializes the four instance variables. 
		//Provide a set and a get method for each instance variable.

		

	

		public Account(String firstName, String lastName, double balance) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			accountIncrement=accountIncrement+1;
			this.accountNumber= accountIncrement ;
			this.balance = balance;
			
			}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public long getAccountNumber() {
			return accountNumber;
		}

		public void setAccointNumber(long accointNumber) {
			this.accountNumber = accountNumber;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
	}
		
		
		@Override
		public String toString() {
			return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accointNumber=" + accountNumber
					+ ", balance=" + balance + "]";
		}

		/*add methods called debit and credit
		debit withdraws money from the Account. Ensure that the debit amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print a message “Insufficient Balance”
		Credit: that adds money to the balance and prints the final balance.*/
		public void debit (double withdraw) {
			if(balance < withdraw ) {
			System.out.println("insufficient Balance");
				
			}
			else {
				balance= balance- withdraw;
				System.out.println("Final balance" + balance);
				
			}
			
		}
		public void credit (double deposit) {
			balance= balance+ deposit;
			System.out.println("new balance"+ balance);
			
		}
	}
	
	


