import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
	private static final String URL = "jdbc:mysql://localhost:3306/company";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Nikhil@2004810";

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			throw new SQLException("Database driver not found", e);
		}
	}

	public static int registerUser(RegisterPojo registerPojo) throws SQLException {
		String INSERT_USERS_SQL = "INSERT INTO users (name, userid, email, username, password) VALUES (?, ?, ?, ?, ?);";
		int result = 0;

		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {

			preparedStatement.setString(1, registerPojo.getName());
			preparedStatement.setInt(2, registerPojo.getUserid());
			preparedStatement.setString(3, registerPojo.getEmail());
			preparedStatement.setString(4, registerPojo.getUsername());
			preparedStatement.setString(5, registerPojo.getPassword());

			result = preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
