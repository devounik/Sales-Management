import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

public class UpdateSalesController extends HttpServlet {
    private UpdateSalesDataDAO updateSalesDataDAO;

    public void init() {
        updateSalesDataDAO = new UpdateSalesDataDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int salesID = Integer.parseInt(request.getParameter("salesID"));
        String salespersonName = request.getParameter("salespersonName");
        int target = Integer.parseInt(request.getParameter("target"));
        int numberOfUnits = Integer.parseInt(request.getParameter("numberOfUnits"));
        int numberOfUnitsSold = Integer.parseInt(request.getParameter("numberOfUnitsSold"));
        String completionStatus = request.getParameter("completionStatus");

        SalesDataUpdatePojo salesData = new SalesDataUpdatePojo();
        salesData.setSalesID(salesID);
        salesData.setSalespersonName(salespersonName);
        salesData.setTarget(target);
        salesData.setNumberOfUnits(numberOfUnits);
        salesData.setNumberOfUnitsSold(numberOfUnitsSold);
        salesData.setCompletionStatus(completionStatus);

        try {
            updateSalesDataDAO.updateSalesData(salesData);
            // Forward to updatesalesdata.jsp on successful update
            RequestDispatcher dispatcher = request.getRequestDispatcher("updatesalesdata.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            // Forward to error.jsp on exception
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }
}
