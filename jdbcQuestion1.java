	/*Q1. Create database called bank that have a table called account with below columns
	account_no integer (primary e=key
	first_name String
	last_name String
	balance decimal

	Write a java program to Insert 5 records into the account table using prepared statement 
	Write a java program to double the balances of each record (hint update each record)
	Write a java program to retrieve all records in the ascending order of their balance and print out the first_name and balance.
	Write a java program that Calculates the total sum of the balances for all accounts and print it out.
	Write a java program to Print the account details(first_name, last_name and balance) of the accounts with highest balance and lowest balance.
	Example:	‘Highest Balance: john, Doe, 9500
	‘Lowes Balance:  dave, james, 1500 */


package jdbcQuestion1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcQuestion1 {

	public static void main(String[] args) throws SQLException {
		
		Connection con= null;
		//ResultSet Rs = null;
		//Statement myStmt= null;
		PreparedStatement st= null;
		
		
		
		
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root",
					"Mekelle05!");
			// jdbc:mysql://127.0.0.1:3306/?user=student
			 st = con.prepareStatement("insert into account values (?,?,?,?)");
			 
			 st.setInt(1,1);
			 st.setString(2, "Solomon");
			 st.setString(3, "Heluf");
			 st.setDouble(4, 2500);
			 
		/*	 st.setInt(1,2);
			 st.setString(2, "Nugis");
			 st.setString(3, "Nureya");
			 st.setDouble(4, 5000); */
			 
		/*	 st.setInt(1,3);
			 st.setString(2, "Mahelat");
			 st.setString(3, "Berhane");
			 st.setDouble(4, 1500);*/
			 
			/* st.setInt(1,6);
			 st.setString(2, "Tony");
			 st.setString(3, "Sige");
			 st.setDouble(4, 9000); */
			 
			/* st.setInt(1,5);
			 st.setString(2, "Abiy");
			 st.setString(3, "Fisseha");
			 st.setDouble(4, 7500);*/
			 
			 st.executeUpdate();
			 System.out.println("row affected " + st);
			 }catch (Exception Ex) {
				 Ex.printStackTrace();}
		finally 
		{
		if	(st !=null) {
			st.close();
		}
		if (con != null) {
			con.close();
		}
				 	} 
	
			 
			 
			
			}
	}
