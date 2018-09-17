<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>

<form action="UpdateStudents" method="post">
	<table>
		<tr>
			<td>
				<label>Name:</label>
			</td>
			<td>
				<input type="text" name="username" value="${d.uname}">
			</td>
		</tr>
		<tr>
			<td>
				<label>Age:</label>
			</td>
			<td>
				<input type="text" name="userage" value="${d.uage}">
			</td>
		</tr>
		<tr>
			<td>
				<label>Email:</label>
			</td>
			<td>
				<input type="text" name="useremail" value="${d.uemail}">
			</td>
		</tr>
		<tr>
			<td>
				<label>Phonenumber:</label>
			</td>
			<td>
				<input type="text" name="userphone" value="${d.uphone}">
			</td>
		</tr>
		<tr>
			<td>
				<label>Date of join(format:'01-JAN-12'):</label>
			</td>
			<td>
				<input type="text" name="userdob" value="${d.udob}">
			</td>
		</tr>
		<tr colspan=2>
			<td align="center">
				<input type="submit" value="Update Student">
			</td>
		</tr>
	</table>
	
</form>

</body>
</html>