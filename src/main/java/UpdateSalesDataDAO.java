import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateSalesDataDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/company";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Nikhil@2004810";

    private static final String UPDATE_QUERY = "UPDATE Sales SET SalespersonName=?, Target=?, NumberOfUnits=?, NumberOfUnitsSold=?, CompletionStatus=? WHERE SalesID=?";

    public UpdateSalesDataDAO() {
    }

    protected Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }
        return connection;
    }

    public void updateSalesData(SalesDataUpdatePojo salesData) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, salesData.getSalespersonName());
            preparedStatement.setInt(2, salesData.getTarget());
            preparedStatement.setInt(3, salesData.getNumberOfUnits());
            preparedStatement.setInt(4, salesData.getNumberOfUnitsSold());
            preparedStatement.setString(5, salesData.getCompletionStatus());
            preparedStatement.setInt(6, salesData.getSalesID());

            preparedStatement.executeUpdate();
        }
    }
}
