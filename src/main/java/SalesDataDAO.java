import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalesDataDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/company";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Nikhil@2004810";

    public boolean insertSalesData(SalesDataPojo salesData) throws SQLException {
        boolean rowInserted = false;
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Sales (SalespersonName, Target, NumberOfUnits, NumberOfUnitsSold, CompletionStatus) VALUES (?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, salesData.getSalespersonName());
            preparedStatement.setInt(2, salesData.getTarget());
            preparedStatement.setInt(3, salesData.getNumberOfUnits());
            preparedStatement.setInt(4, salesData.getNumberOfUnitsSold());
            preparedStatement.setString(5, salesData.getCompletionStatus());

            rowInserted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return rowInserted;
    }
}
