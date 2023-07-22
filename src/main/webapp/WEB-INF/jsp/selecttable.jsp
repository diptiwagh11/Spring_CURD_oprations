<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
 table,th,td{
 border:1px solid black;
 }
 .backToHome {
	border: 1px solid black;
	background:lightblue;
	
}
</style>
</head>
<body>
<h1>Emplyee Record</h1>
<table>
 <tr>
   <th>Id</th>
   <th>EmpName</th>
   <th>Email</th>
   <th>CountryCode</th>
   <th>Mobile</th>
   <th>Jobs</th>
   <th>Password</th> 
   <th>Re_Password</th> 
 </tr>
 <tr>
    <td>${empdata.id}</td>
    <td>${empdata.name}</td>
    <td>${empdata.email}</td>
    <td>${empdata.countrycode}</td>
    <td>${empdata.mobile}</td>
    <td>${empdata.jobs}</td>
    <td>${empdata.password}</td>
    <td>${empdata.repassword}</td>
 </tr>

 
</table>
<a href="index" class="backToHome">Back To Home</a>

</body>
</html>