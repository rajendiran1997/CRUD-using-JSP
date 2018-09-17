package updateStudent;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import insertStudent.InsertDao;
import fetchOneStudent.FetchDB;

/**
 * Servlet implementation class UpdateFetch
 */
@WebServlet("/UpdateFetch")
public class UpdateFetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	InsertDao d = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		try {
			d = new FetchDB().fetch(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("d", d);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/UpdateStudent.jsp");
		rd.forward(request, response);
	}

}
