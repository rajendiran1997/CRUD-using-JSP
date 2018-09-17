package updateStudent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import insertStudent.InsertDao;

@WebServlet("/UpdateStudents")
public class UpdateStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int status = 0;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String uage = request.getParameter("userage");
		String uemail = request.getParameter("useremail");
		String uphone = request.getParameter("userphone");
		String udob = request.getParameter("userdob");
		
		InsertDao d = new InsertDao();
		d.setUname(uname);
		d.setUage(uage);
		d.setUemail(uemail);
		d.setUphone(uphone);
		d.setUdob(udob);
		
		UpdateStudentDB db = new UpdateStudentDB();
		try {
			status = db.update(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(status > 0) {
			response.sendRedirect("insertionsuccess.jsp");
		}else {
			response.sendRedirect("Error.jsp");
		}
	}

}
