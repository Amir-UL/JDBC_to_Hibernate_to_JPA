<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
<h1>Control Pannel</h1>
<button><a href="/save_expenses">Add Expenses</a></button>
<button><a href="/expenses">View Expenses</a></button>
<button><a href="/editable_expenses">Edit Expense</a></button>
<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>
