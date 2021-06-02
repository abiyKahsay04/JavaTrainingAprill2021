package jdbcQuestion5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcQuestion5 {

	public static void main(String[] args) 	throws SQLException {
		/*Write a java program to Print the account details(first_name, last_name and balance) of the accounts with highest balance and lowest balance.
		Example:	‘Highest Balance: john, Doe, 9500
		‘Lowes Balance:  dave, james, 1500 */
	

			Connection con = null;
			ResultSet rs = null;
			Statement myStmt = null;
			// PreparedStatement st= null;

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Mekelle05!");
				myStmt = con.createStatement();
				String sql = "select * from account order by balance asc limit 1";
				System.out.println("Succsess");
				rs = myStmt.executeQuery(sql);
				//System.out.println("row affected " + myStmt);

				while (rs.next()) {
					System.out.println(" lowest balance = " + rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getDouble("balance"));
				}
				String descsql = "select * from account order by balance desc limit 1";
				rs = myStmt.executeQuery(descsql);
				
				while (rs.next()) {
					System.out.println(" Highest  balance = " + rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getDouble("balance"));
				}

			} catch (Exception Ex) {
				Ex.printStackTrace();
			} finally {
				if (myStmt != null) {
					myStmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			}

		}
	}