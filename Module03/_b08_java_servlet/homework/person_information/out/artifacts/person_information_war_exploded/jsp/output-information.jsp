<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 25/12/2020
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Information</title>
</head>
<body>
<h2>Information</h2>
<table border="solid 1px black" style="border-collapse: collapse">
    <tr>
        <th>Fullname</th>
        <th>Address</th>
        <th>Age</th>
        <th>Full information</th>
    </tr>
    <tr>
        <td>${person.fullName}</td>
        <td>${person.address}</td>
        <td>${person.age}</td>
        <td>${person.toString()}</td>
    </tr>
</table>
</body>
</html>
