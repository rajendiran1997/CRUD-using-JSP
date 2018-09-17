package insertStudent;
import java.sql.*;
public class insertDB {
	
	Connection conn = null;
	int status = 0;
	
	public int insertion(InsertDao d)throws Exception {	
		
		String sql = "insert into student(name,age,email,phone,dob) values (?,?,?,?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertstudent","root","root");
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, d.getUname());
		stmt.setString(2, d.getUage());
		stmt.setString(3, d.getUemail());
		stmt.setString(4, d.getUphone());
		stmt.setString(5, d.getUdob());
		status = stmt.executeUpdate();
		
		conn.close();
		return status;
	}
}
