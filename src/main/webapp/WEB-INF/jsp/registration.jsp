<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
<style type="text/css">
div {
	border: 1px solid black;
	margin-left: 300px;
	padding: 10px;
	width: 30%;
	text-align: center;
	background: lightpink;
	border-radius: 20px;
}

h1 {
	text-align: center;
	color: blue;
}

h2 {
	text-align: center;
	color: green;
}

#btn {
	background: lightblue;
	width: 50%;
}

.backToHome {
	border: 1px solid black;
	margin-left: 450px;
	margin-top: 550px;
	background:lightblue;
	
}
</style>
</head>
<body>
		<h2>${successMsg}</h2>
		<h2>${errMsg}</h2>
		<div>
		<h1>Sign Up Form</h1>
		<form action="register" method="post">

			<lable>Full Name:</lable>
			<input type="text" name="name"><br> <br>
			<lable>email:</lable>
			<input type="email" name="email"><br> <br> <label>Mobile:</label>
			<select style="max-width: 120px" name="countrycode">
				<option selected="">+91</option>
				<option value="1">+972</option>
				<option value="2">+198</option>
				<option value="3">+701</option>
				<br>
			<br>
				<input type="text" name="mobile">
			<br />
			<br />
				<lable>Select Job Type:</lable>
				<select name="jobs">
					<option selected="">Select job type:</option>
					<option>Designer</option>
					<option>Manager</option>
					<option>Accaunting</option>
			</select>
			<br>
			<br>
				<lable>password:</lable>
				<input type="password" name="password">
			<br>
				<br>
				<lable>Re_password:</lable>
				<input type="password" name="repassword">
			<br>
				<br>
				<input type="submit" value="submit" id="btn">
		</form>

	</div>
	<a href="index" class="backToHome">Back To Home</a>

</body>
</html>