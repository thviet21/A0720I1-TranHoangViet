<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 07/01/2021
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail Product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 class="text-center bg-info">Detail Product</h1>
    <table class="table table-striped table-center table-hover table-bordered">
        <tr>
            <th scope="col">ID Product</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Description Product</th>
            <th scope="col">Producer</th>
        </tr>
        <tr>
            <td>${product.idProduct}</td>
            <td>${product.nameProduct}</td>
            <td>${product.priceProduct}</td>
            <td>${product.descProduct}</td>
            <td>${product.producer}</td>
        </tr>
    </table>
    <%--    <input type="hidden" name="${product}">--%>
    <a href="products">Back to list products!</a>
</div>
</body>
</html>
