<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="location" value="pageContext.request.contextPath"/>
<body>

<c:forEach var="expense" items="${expenses}">
            <h2><span>&#2547;${expense.amount}</span></h2>
            <p><b>${expense.expense_type}</b></p>
            <h4>${expense.expense_des}</h4> <span> Id: ${expense.id}</span>
            <button><a href="add_expenses/${expense.id}">Edit</a></button>
        <br>
</c:forEach>

</body>
</html>
