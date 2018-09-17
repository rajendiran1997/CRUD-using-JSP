import java.sql.*;
import java.util.ArrayList;

import insertStudent.InsertDao;

public class FetchAll {
	
	Connection conn = null;
	public ArrayList<InsertDao> fetch()throws Exception {	
		
		String sql = "select * from student";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertstudent","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		InsertDao d = null; 
		ArrayList<InsertDao> list = new ArrayList<InsertDao>();
		while(rs.next()) {
			d =new InsertDao();
			d.setUname(rs.getString(1));
			d.setUage(rs.getString(2));
			d.setUemail(rs.getString(3));
			d.setUphone(rs.getString(4));
			d.setUdob(rs.getString(5));
			list.add(d);
		}
		
		conn.close();
		return list;
	}
}
