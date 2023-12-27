import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) throws SQLException {
		System.out.println("Started ");
		String dbUrl = "jdbc:mysql://localhost:3306/jdbcdem";
		String user = "student";
		String pass = "student12345!@";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(dbUrl, user, pass);
			if (connection != null) {
				System.out.println("connection made");
			} else
				return;

		} catch (SQLException sqlException) {
			System.out.println(sqlException);
		}

		// INSERT QUERY EXECUTION
//		try {
//			String insertStatement = "INSERT INTO `jdbcdem`(`id`, `name`) VALUES (4,'lkm')";
//			Statement statement = connection.createStatement();
//			int numberofrowsinserted = statement.executeUpdate(insertStatement);
//			System.out.println("numberofrowsinserted " + numberofrowsinserted);
//		} catch (SQLException sqlException) {
//			System.out.println(sqlException);
//		}

		// UPDATE QUERY EXECUTION
//		try {
//			int id = 1; // SPECIFY ID
//			String name = "xyz"; // SPECIFY NAME
//			String updateStatement = "UPDATE jdbcdem set name='mno' where id=1";
//			Statement statement = connection.createStatement();
//			int numberofrowsinserted = statement.executeUpdate(updateStatement);
//			System.out.println("numberofrowsinserted " + numberofrowsinserted);
//		} catch (SQLException sqlException) {
//			System.out.println(sqlException);
//		}

//		//SEARCH QUERY EXECUTION
//		try {
//			String searchStatement = "SELECT * FROM `jdbcdem` WHERE 1";
//			Statement statement = connection.createStatement();
//			ResultSet resultset = statement.executeQuery(searchStatement);
//
//			while (resultset.next()) {
//				System.out.println(resultset.getInt("id") + " " + resultset.getString("name"));
//			}
//
//		} catch (SQLException sqlException) {
//			System.out.println(sqlException);
//		}
//		
//		//DELETE QUERY EXECUTION
		try {
			String deleteStatement = "DELETE FROM `jdbcdem` WHERE id=4";
			Statement statement = connection.createStatement();
			int numberofrowsinserted = statement.executeUpdate(deleteStatement);
			System.out.println("numberofrowsinserted " + numberofrowsinserted);
		} catch (SQLException sqlException) {
			System.out.println(sqlException);
		}
	}
}
