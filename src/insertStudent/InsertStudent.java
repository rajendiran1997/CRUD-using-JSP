package insertStudent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class InsertStudent
 */
@WebServlet("/InsertStudent")
public class InsertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String uname;
	String uage;
	String uemail;
	String uphone;
	String udob;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uname = request.getParameter("username");
		uage = request.getParameter("userage");
		uemail = request.getParameter("useremail");
		uphone = request.getParameter("userphone");
		udob = request.getParameter("userdob");
//		System.out.println(uname);
		
		InsertDao d = new InsertDao();
		d.setUname(request.getParameter("username"));
		d.setUage(request.getParameter("userage"));
		d.setUemail(request.getParameter("useremail"));
		d.setUphone(request.getParameter("userphone"));
		d.setUdob(request.getParameter("userdob"));
		
		insertDB i = new insertDB();
		
		try {
			if(i.insertion(d)>0) {
				response.sendRedirect("insertionsuccess.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
