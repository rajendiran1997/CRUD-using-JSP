<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>

	<h2 align="center">Student Information System</h2>
	
	<table align="center" border="2" width="230px" >
		<tr><td align="center"><a href="InsertForm.jsp">Add Student</a></td></tr>
		<tr><td align="center"><a href="Update.jsp">Update Details</a></td></tr>
		<tr><td align="center"><a href="FetchStudent.jsp">Fetch Student</a></td></tr>
		<tr><td align="center"><a href="FetchAllStudents.jsp">Fetch All Students</a></td></tr>
	</table>
	
	<style>
		table{
			border: none;
		}
		td{
			height: 30px;
		}
		tr{
			width: 230px;
		}
		a{
			height: 35px;
			color: #000;
			text-decoration: none;
		}
	</style>
</body>
</html>