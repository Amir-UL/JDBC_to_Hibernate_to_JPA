<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>

<c:forEach var="expense" items="${expenses}">
            <h4>&#2547;${expense.amount}</h4>
            <h2>${expense.expense_type}</h2>
            <h2>${expense.expense_des}</h2>
            <h2>${expense.created_at}</h2>
        <br>
</c:forEach>

<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>
