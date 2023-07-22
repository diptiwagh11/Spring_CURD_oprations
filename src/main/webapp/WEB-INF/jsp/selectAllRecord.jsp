<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,th,td{
  border:1px solid black;
}
h2{
  margin-left:200px;
  color:lightblue;
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
<h2>All Employee Details</h2>
<table>
<tr>
 <th>Id</th>
 <th>Name</th>
 <th>Email Id</th>
 <th>CountryCode</th>
 <th>Mobile</th>
 <th>Jobs</th>
 <th>Password</th>
 <th>Re_Password</th>
</tr>
<c:forEach var="data" items="${empdata }">
<tr>
    <td>${data.id}</td>
   <td>${data.name}</td>
   <td>${data.email}</td>
   <td>${data.countrycode}</td>
   <td>${data.mobile}</td>
   <td>${data.jobs}</td>
   <td>${data.password}</td>
   <td>${data.repassword}</td>
</tr>
</c:forEach>
</table>
<a href="index" class="backToHome">Back To Home</a>

</body>
</html>