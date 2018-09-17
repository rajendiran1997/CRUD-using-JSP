<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="insertStudent.InsertDao" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fetch All Students</title>
</head>
<body>

	<%!
	ArrayList<InsertDao> list = null;
	Connection conn = null;
	public void fetch()throws Exception {	
		
		String sql = "select * from student";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertstudent","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		InsertDao d = null; 
		list =  new ArrayList<InsertDao>();
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
	}
	
	%>


	
	<table border="9" style="border:none;">
		<tr><th>NAME</th><th>AGE</th><th>EMAIL</th><th>PH.NO</th><th>DOB</th></tr>	
	<%
		fetch();
		Iterator<InsertDao> ll = null;		
		ll = list.iterator();
		InsertDao d = null;
		while(ll.hasNext()){
			d = (InsertDao)ll.next();
	%>
	<tr>
		<td><%= d.getUname() %></td>
		<td><%=  d.getUage() %></td>
		<td><%=  d.getUemail() %></td>
		<td><%=  d.getUphone() %></td>
		<td><%= d.getUdob() %></td>
	</tr>  
	<%	
	}   
		
	%>
	</table>
</body>
</html>