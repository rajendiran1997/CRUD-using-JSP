package updateStudent;

import java.sql.*;
import insertStudent.InsertDao;

public class UpdateStudentDB {
	Connection conn = null;
	int status = 0;
	
	public int update(InsertDao d)throws Exception {	
		
		String sql = "update student set age='"+d.getUage()+"', email='"+d.getUemail()+"', phone='"+d.getUphone()+"', dob='"+d.getUdob()+"' where name='"+d.getUname()+"'";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertstudent","root","root");
		Statement stmt = conn.createStatement();
		
		status = stmt.executeUpdate(sql);
		
		conn.close();
		return status;
	}
}
