import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

public class AddSalesController extends HttpServlet {
	private SalesDataDAO salesDataDAO;

	public void init() {
		salesDataDAO = new SalesDataDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String salespersonName = request.getParameter("salespersonName");
		int target = Integer.parseInt(request.getParameter("target"));
		int numberOfUnits = Integer.parseInt(request.getParameter("numberOfUnits"));
		int numberOfUnitsSold = Integer.parseInt(request.getParameter("numberOfUnitsSold"));
		String completionStatus = request.getParameter("completionStatus");

		SalesDataPojo salesData = new SalesDataPojo();
		salesData.setSalespersonName(salespersonName);
		salesData.setTarget(target);
		salesData.setNumberOfUnits(numberOfUnits);
		salesData.setNumberOfUnitsSold(numberOfUnitsSold);
		salesData.setCompletionStatus(completionStatus);

		try {
			if (salesDataDAO.insertSalesData(salesData)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("addsalesdata.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("addsalesdata.jsp");
				dispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			RequestDispatcher dispatcher = request.getRequestDispatcher("addsalesdata.jsp");
			dispatcher.forward(request, response);
		}
	}
}
