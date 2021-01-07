<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 07/01/2021
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Searching Product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 class="text-center">Result of search product</h1>
    <table class="table table-striped">
        <tr>
            <th scope="col">ID Product</th>
            <th scope="col">Name Product</th>
            <th scope="col">Price Product</th>
            <th scope="col">Description Product</th>
            <th scope="col">Producer</th>
        </tr>
        <c:forEach items="${productLists}" var="product">
            <tr>
                <td>${product.idProduct}</td>
                <td>${product.nameProduct}</td>
                <td>${product.priceProduct}</td>
                <td>${product.descProduct}</td>
                <td>${product.producer}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="products">Back to list products</a>
</div>
</body>
</html>
