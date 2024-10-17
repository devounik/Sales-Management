import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteSalesDataDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/company";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Nikhil@2004810";

    private static final String DELETE_QUERY = "DELETE FROM Sales WHERE SalesID = ?";

    public DeleteSalesDataDAO() {
    }

    protected Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }
        return connection;
    }

    public boolean deleteSalesData(int salesID) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement deleteStatement = connection.prepareStatement(DELETE_QUERY)) {

            // Delete the record with the specified SalesID
            deleteStatement.setInt(1, salesID);
            rowDeleted = deleteStatement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
}
