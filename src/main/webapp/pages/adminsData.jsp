<!--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
${admins}
<br>
${adminsByNames}
<br>
${adminsByRoll}
<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>
