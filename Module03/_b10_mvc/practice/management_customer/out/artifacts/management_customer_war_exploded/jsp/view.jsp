<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 07/01/2021
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View information</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th >${customer.id}</th>
        <td>${customer.name}</td>
        <td>${customer.email}</td>
        <td>@${customer.address}</td>
    </tr>
    </tbody>
</table>
<a href="customers">Back to list !^^</a>
</body>
</html>
