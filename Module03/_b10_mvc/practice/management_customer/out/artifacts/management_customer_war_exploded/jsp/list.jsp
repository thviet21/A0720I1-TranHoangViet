<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 06/01/2021
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customer</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
    <h1>Customers</h1>
    <p>
        <a href="customers?action=create">Creat a new customer</a>
    </p>
    <table class="table">
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>
                    <a href="customers?action=view&id=${customer.id}">${ customer.name}</a>
                </td>
                <td>
                        ${ customer.email }
                </td>
                <td>
                        ${ customer.address }
                </td>
                <td>
                    <a href="customers?action=edit&id=${customer.id}">Edit</a>
                </td>
                <td>
                    <a href="customers?action=delete&id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
