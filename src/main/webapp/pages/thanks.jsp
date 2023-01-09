<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h1>Thank Your</h1>
<h3> We will Connect You Soon</h3>
<strong>Current Time is</strong>: <%=new Date() %>
<br>
<a href="http://localhost:8082/admins"> Add More Data</a><br>
<a href="http://localhost:8082/fetchData">Fetch Data</a>
<a href="http://localhost:8082/deleteData"> Delete Data</a>
</body>
</html>