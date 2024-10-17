import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int userid = Integer.parseInt(request.getParameter("userid")); 
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        RegisterPojo registerPojo = new RegisterPojo(name, userid, email, username, password);

        try {
            int result = RegisterDAO.registerUser(registerPojo);
            if (result > 0) {
                // Registration successful, redirect to login.jsp
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
            } else {
            	 RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                 dispatcher.forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
