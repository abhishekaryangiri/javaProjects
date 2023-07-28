

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Authentication logic
		 boolean isValidUser = yourAuthenticationMethod(username, password);
		 
		 if( isValidUser) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			((HttpServletResponse) request).sendRedirect("home.jsp");
		 }else {
			 response.sendRedirect("login.jsp");
		 }
	}

	private boolean yourAuthenticationMethod(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
