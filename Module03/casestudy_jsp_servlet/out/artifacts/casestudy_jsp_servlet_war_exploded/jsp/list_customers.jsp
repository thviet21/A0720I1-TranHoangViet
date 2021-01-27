<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 22/01/2021
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">

    <form action="customers" method="post">
        <h1 class="text-center bg-success">Danh sách khách hàng</h1>
        <div class="row">
            <div class="col-md-4 col-md-offset-3">
                <form action="customers?action=search" method="post">
                    <div class="form-group form-inline has-feedback">
                        <label for="search" class="sr-only">Search</label>
                        <input type="text" class="form-control" name="search" id="search"
                               placeholder="Tìm kiếm khách hàng theo tên">
                        <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        <button type="submit" class="btn button-inline btn-outline-primary">Search</button>
                        <input type="hidden" name="action" value="search">
                    </div>
                </form>
            </div>
        </div>
        <p>
            <button class="btn btn-info">
                <a href="customers?action=create" class="text-dark">Thêm mới khách hàng</a>
            </button>
        </p>
        <table class="table table-dark table-striped">
            <tr>
                <th scope="col">Mã Khách hàng</th>
                <th scope="col">Tên khách hàng</th>
                <th scope="col">Giới tính</th>
                <th scope="col">Ngày sinh</th>
                <th scope="col">Email</th>
                <th scope="col">Sửa</th>
                <th scope="col">Xóa</th>
            </tr>
            <c:forEach items="${ customersList }" var="customer">
                <tr>
                    <td>
                        <button class="btn btn-primary">
                            <a href="customers?action=view&idCus=${customer.idCus}" class="text-dark"> Xem thông tin</a>
                        </button>
                    </td>
                    <td>
                            ${customer.nameCus}
                    </td>
                    <td>
                            ${customer.gender}
                    </td>
                    <td>
                            ${customer.birthDay}
                    </td>
                    <td>
                            ${customer.emailCus}
                    </td>
                    <td>
                        <button class="btn btn-warning">
                            <a href="customers?action=edit&idCus=${customer.idCus}" class="text-dark"> Edit</a>
                        </button>
                    </td>
                    <td>
                        <button class="btn btn-danger">
                            <a href="customers?action=delete&idCus=${customer.idCus}" class="text-dark"> Delete</a>
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
</body>
</html>
