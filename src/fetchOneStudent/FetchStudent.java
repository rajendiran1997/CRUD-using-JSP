package fetchOneStudent;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import insertStudent.InsertDao;
/**
 * Servlet implementation class FetchStudent
 */
@WebServlet("/FetchStudent")
public class FetchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		FetchDB f= new FetchDB();
		try {
			InsertDao d = f.fetch(uname);
			request.setAttribute("d",d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/DisplayFetchStudent.jsp");
		rd.forward(request, response);
	}

}
