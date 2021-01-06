<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 25/12/2020
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input Information</title>
</head>
<body>
<form action="information" method="post">
    Fullname <input type="text" name="fullname" placeholder="FullName">
    Address <input type="text" name="address" placeholder="Address">
    Birthday <input type="text" name="birthday" placeholder="Birthday dd/MM/yyyy">
    <input type="submit" value="Submit">
</form>
    <%!int y = 5;%>
    <h1><%=y%></h1>
</body>
</html>
