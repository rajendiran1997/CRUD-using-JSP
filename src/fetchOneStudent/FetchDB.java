package fetchOneStudent;

import java.sql.*;

import insertStudent.InsertDao;

public class FetchDB {
	Connection conn = null;
	
	public InsertDao fetch(String name)throws Exception {	
		
		String sql = "select * from student where name='"+name+"'";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertstudent","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		InsertDao d= new InsertDao();
		while(rs.next()) {
			
			d.setUname(rs.getString(1));
			d.setUage(rs.getString(2));
			d.setUemail(rs.getString(3));
			d.setUphone(rs.getString(4));
			d.setUdob(rs.getString(5));
		}
		
		conn.close();
		return d;
	}
}
