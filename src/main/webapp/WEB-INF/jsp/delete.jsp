<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
div{
  border:1px solid black;
  margin-left:300px;
  padding:10px;
  width:30%;
 text-align:center;
 background:lightpink;
 border-radius:20px;
  
}
h1{
 text-align:center;
 color:blue;
}
#btn{
  background:lightblue;
  width:50%;
}
h2 {
    margin-left:100px;
	text-align: center;
	color: green;
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
<div >
  <h1>Delete Record Form</h1>
	<form action="deleteRecord" method="post">

		<lable>Id:</lable>
		<input type="text" name="id"><br>
		<br> <input type="submit" value="submit" id="btn" >
   
	</form>

 </div>
  <a href="index" class="backToHome">Back To Home</a>
  
  
  
</body>
</html>