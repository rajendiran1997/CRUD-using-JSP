<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${d.uname} Details </title>
</head>
<body>

<h2>Student Details</h2><br>

<ul>
	<li>Name:${d.uname}</li>
	<li>Age:${d.uage}</li>
	<li>Email:${d.uemail}</li>
	<li>Phone Number:${d.uphone}</li>
	<li>Date of Join:${d.udob}</li>
</ul>
 <hr>
 <a href="index.jsp">Home</a>
</body>
</html>