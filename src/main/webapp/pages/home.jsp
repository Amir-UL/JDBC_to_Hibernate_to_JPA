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
<form action="submit" method="post">
<%--    ${allNames.firstName}--%>
    <label for="fname">First Name</label>
    <input type="text" name="firstName" id="fname" placeholder="Your Name ...">

    <label for="mname">Middle Name</label>
    <input type="text", name="middleName", id="mname", placeholder="Your Middle Name ...">

    <label for="lname">Last Name</label>
    <input type="text", name="lastName", id="lname", placeholder="Your Last Name ...">
    <input type="submit" value="Submit">

</form>

<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>