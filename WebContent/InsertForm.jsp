<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert New Student</title>
</head>
<body>

<h2>Insert New Student</h2><br>
<h2>Student Form</h2><br>

<form action="InsertStudent" method="post">
	<table>
		<tr>
			<td>
				<label>Name:</label>
			</td>
			<td>
				<input type="text" name="username" onkeypress=" return validateName(event)" required="required">
			</td>
		</tr>
		<tr>
			<td>
				<label>Age:</label>
			</td>
			<td>
				<input type="text" name="userage">
			</td>
		</tr>
		<tr>
			<td>
				<label>Email:</label>
			</td>
			<td>
				<input type="text" name="useremail">
			</td>
		</tr>
		<tr>
			<td>
				<label>Phonenumber:</label>
			</td>
			<td>
				<input type="text" name="userphone" onkeypress="return validatePhone(event, this)" required="required">
			</td>
			<span id="phone"></span>
		</tr>
		<tr>
			<td>
				<label>Date of join(format:'01-JAN-12'):</label>
			</td>
			<td>
				<input type="text" name="userdob" required="required">
			</td>
		</tr>
		<tr colspan=2>
			<td align="center">
				<input type="submit" value="Add Student">
			</td>
		</tr>
	</table>
	
</form>

<style>
	input[type="input"]{
		border-radius: 0px;
	}
</style>
<script>
	function validateName(event, a){
		var keycode = (event.which) ? event.which : event.keyCode;
		if(!(keycode>31 && (keycode<48 || keycode>57))){
			return false;
		}
		return true;
	}
	
	function validatePhone(event, a){
		var keycode = (event.which) ? event.which : event.keyCode;
		if(keycode>31 && (keycode<48 || keycode>57)){
			return false;
		}
		if(a.value.length()<10 && a.value.length()>10){
			document.getElementById("phone").value ="Enter the 10 digit number";
			return false;
		}
		return true;
	}
	
</script>
</body>
</html>