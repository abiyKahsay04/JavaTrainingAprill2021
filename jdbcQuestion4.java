package jdbcQuestion4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcQuestion4 {

	public static void main(String[] args) throws SQLException {
		//Q4.	Write a java program that Calculates the total sum of the balances for all accounts and print it out.

		

			Connection con = null;
			ResultSet rs = null;
			Statement myStmt = null;
			// PreparedStatement st= null;

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Mekelle05!");
				myStmt = con.createStatement();
				String sql = "select sum(balance) from account";
				System.out.println("Succsess");
				rs = myStmt.executeQuery(sql);
				//System.out.println("row affected " + myStmt);
				int sum = 0;
				while (rs.next()) {
				int counter = rs.getInt(1);
				sum= sum + counter;
				}
				System.out.println("total balace = " + sum);
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