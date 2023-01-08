<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
<form action="/save_expenses" method="post">

    <label for="type">Expense Type</label>
    <input type="text" name="expense_type", id="type">

    <label for="name">Expense Description</label>
    <input type="text" name="expense_des" id="name">


    <label for="amount">Amount</label>
    <input type="text" name="amount" id="amount">

    <button type="submit">Add to Expense List</button>
</form>

<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>