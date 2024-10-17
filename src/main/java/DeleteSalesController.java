import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteSalesController extends HttpServlet {
    private DeleteSalesDataDAO deleteSalesDataDAO;

    public void init() {
        deleteSalesDataDAO = new DeleteSalesDataDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int salesID = Integer.parseInt(request.getParameter("salesID"));

        try {
            if (deleteSalesDataDAO.deleteSalesData(salesID)) {
                request.setAttribute("successMessage", "Sales record deleted successfully!");
            } else {
                request.setAttribute("errorMessage", "Failed to delete sales record!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred while deleting the sales record!");
        }

        request.getRequestDispatcher("deletesalesdata.jsp").forward(request, response);
    }
}
