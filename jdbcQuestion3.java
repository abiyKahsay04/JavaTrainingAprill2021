	// Q3 Write a java program to retrieve all records in the ascending order of
	// their balance and print out the first_name and balance.
	package jdbcQuestion3;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class jdbcQuestion3 {
	

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		ResultSet rs = null;
		Statement myStmt = null;
		// PreparedStatement st= null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Mekelle05!");
			myStmt = con.createStatement();
			String sql = "select * from account order by balance asc";
			System.out.println("Succsess");
			rs = myStmt.executeQuery(sql);
			// System.out.println("row affected " + myStmt);

			while (rs.next()) {
				System.out.println(rs.getString("first_name") + " \t " + rs.getDouble("balance"));
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