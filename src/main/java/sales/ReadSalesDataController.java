package sales;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ReadSalesDataController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        ReadSalesDataDAO dao = new ReadSalesDataDAO();

        if ("viewAll".equals(action)) {
            List<ReadSalesPojo> allSalesData = dao.getAllSalesData();
            if (allSalesData != null && !allSalesData.isEmpty()) {
                request.setAttribute("allSalesData", allSalesData);
            } else {
                request.setAttribute("error", "No sales data available.");
            }
        } else if ("search".equals(action)) {
            String salesidParam = request.getParameter("salesid");
            if (salesidParam != null && !salesidParam.trim().isEmpty()) {
                try {
                    int salesid = Integer.parseInt(salesidParam);
                    ReadSalesPojo salesData = dao.getSalesData(salesid);
                    if (salesData != null) {
                        request.setAttribute("salesData", salesData);
                    } else {
                        request.setAttribute("error", "No sales data found for Sales ID: " + salesid);
                    }
                } catch (NumberFormatException e) {
                    request.setAttribute("error", "Invalid Sales ID format.");
                }
            } else {
                request.setAttribute("error", "Please provide a Sales ID.");
            }
        }
        request.getRequestDispatcher("readsales.jsp").forward(request, response);
    }
}
