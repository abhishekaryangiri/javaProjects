package mayank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String Name=request.getParameter("n");
		String Add=request.getParameter("add");
		String Phone=request.getParameter("phone");
		out.println(" Name  "+ Name +  " Add "+ Add +  " Phone   "+ Phone);
	if(Name.equals("Mayank")) {
		request.getRequestDispatcher("secondServlet").forward(request, response);
	}
	if(Name.equals("Ritik")) {
		request.getRequestDispatcher("My.html").include(request, response);
	}
if(Name.equals("Sharma")) {
	response.sendRedirect("https://www.facebook.com/");
}
	
	}
}
