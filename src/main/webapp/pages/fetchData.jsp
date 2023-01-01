<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!--This would not work BECAUSE of https-->
<!--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
// Fetching data from db
<form action="adminsData" method="post">

    // Search By Id
    <label for="id">Id</label>
    <input type="text" name="id", id="id", placeholder="Id...">
    <input type="submit" value="Submit">

</form>
<br>
<form action="fetchByName", method="post">
    // Search by Name
    <label for="name">Name</label>
    <input type="text" name="name", id="name", placeholder="Name">
    <input type="submit" value="Submit">

</form>
<br>

<form action="fetchByRoll", method="post">
    // Search by Roll
    <label for="roll">Roll in The Company</label>
    <input type="text" name="roll", id="roll", placeholder="Name">
    <input type="submit" value="Submit">

</form>
<br>
<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>