<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 07/01/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%--    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>--%>
</head>
<body>
<div class="container">

    <form action="products" method="post">
        <h1 class="text-center bg-success">List product</h1>
        <div class="row">
            <div class="col-md-4 col-md-offset-3">
                <form action="products?action=search" method="post">
                    <div class="form-group form-inline has-feedback">
                        <label for="search" class="sr-only">Search</label>
                        <input type="text" class="form-control" name="search" id="search" placeholder="search by name">
                        <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        <button type="submit" class="btn button-inline btn-outline-primary">Primary</button>
                        <input type="hidden" name="action" value="search">
                    </div>
                </form>
            </div>
        </div>
        <p>
            <a href="products?action=create">Create a new product</a>
        </p>
        <table class="table">
            <tr>
                <th scope="col">ID Product</th>
                <th scope="col">Name Product</th>
                <th scope="col">Price Product</th>
                <th scope="col">Description Product</th>
                <th scope="col">Producer</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
            <c:forEach items="${ products }" var="product">
                <tr>
                    <td>
                        <a href="products?action=view&id=${product.idProduct}"> ${product.idProduct}</a>
                    </td>
                    <td>
                            ${product.nameProduct}
                    </td>
                    <td>
                            ${product.priceProduct}
                    </td>
                    <td>
                            ${product.descProduct}
                    </td>
                    <td>
                            ${product.producer}
                    </td>
                    <td>
                        <a href="products?action=edit&id=${product.idProduct}"> Edit</a>
                    </td>
                    <td>
                        <a href="products?action=delete&id=${product.idProduct}"> Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
</body>
</html>
