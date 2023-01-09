<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>P</title>
</head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<body bgcolor="#ffe4c4">
<form action="/save_expenses" method="post">

    <label for="id" >Your Id</label>
    <input type="hidden" name="id" id="id" value="${expense.id}">

    <label for="type">Expense Type</label>
    <input type="text" name="expense_type", id="type" value="${expense.expense_type}">

    <label for="name">Expense Description</label>
    <input type="text" name="expense_des" id="name" value="${expense.expense_des}">

    <label for="amount">Amount</label>
    <input type="text" name="amount" id="amount" value="${expense.amount}">

    <button type="submit">Update List</button>
</form>


</body>

</html>
