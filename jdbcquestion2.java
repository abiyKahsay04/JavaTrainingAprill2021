 // Q2. Write a java program to Insert 5 records into the account table using prepared statement	
	package jdbcquestion2;

	import java.sql.*;

	public class jdbcquestion2 {

	
	public static void main(String[] args) throws SQLException {

		Connection con = null;
		ResultSet rs = null;
		Statement myStmt = null;
		// PreparedStatement st= null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Mekelle05!");
			myStmt = con.createStatement();
			String sql = "select first_name,balance, balance*2 as total from account";
			System.out.println("Succsess");
			rs = myStmt.executeQuery(sql);
			//System.out.println("row affected " + myStmt);

			while (rs.next()) {
				System.out.println(rs.getString("first_name") + " \t " + rs.getDouble("balance") + " \t " + rs.getDouble("total"));
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
