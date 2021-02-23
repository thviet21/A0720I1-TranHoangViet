<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 07/01/2021
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="products?action=create" method="post">
        <h1 class="text-center bg-primary">Thêm mới sản phẩm</h1>
        <table class="table">
            <tr>
                <td scope="row">ID Product</td>
                <td><input type="text" name="idProduct"></td>
            </tr>
            <tr>
                <td scope="row">Name Product</td>
                <td><input type="text" name="nameProduct"></td>
            </tr>
            <tr>
                <td scope="row">Price Product</td>
                <td><input type="text" name="priceProduct"></td>
            </tr>
            <tr>
                <td scope="row">Description Product</td>
                <td><input type="text" name="descProduct"></td>
            </tr>
            <tr>
                <td scope="row">Producer</td>
                <td><input type="text" name="producer"></td>
            </tr>
        </table>
        <input type="submit" value="Thêm mới">
        <input type="reset" value="Nhập lại">
        <a href="products">Back to list</a>
        <input type="hidden" name="action" value="create">
    </form>
</div>
</body>
</html>
