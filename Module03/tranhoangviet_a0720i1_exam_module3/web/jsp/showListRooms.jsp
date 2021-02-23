<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 01/02/2021
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách phong trọ</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<div class="container">
    <form action="rooms" method="post">
        <h1 class="text-center bg-primary">Danh sách Phòng</h1>
        <div class="row">
            <div class="col-md-4 col-md-offset-3">
                <form action="rooms?action=search" method="post">
                    <div class="form-group form-inline has-feedback">
                        <label for="search" class="sr-only">Search</label>
                        <input type="text" class="form-control" name="search" id="search"
                               placeholder="Tìm kiếm">
                        <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        <button type="submit" class="btn button-inline btn-outline-primary">Search</button>
                        <input type="hidden" name="action" value="search">
                    </div>
                </form>
            </div>
        </div>
        <p>
            <button class="btn btn-info">
                <a href="rooms?action=create" class="text-dark">Thêm mới phòng trọ</a>
            </button>
        </p>
        <table class="table table-light table-striped table-hover">
            <tr>
                <th scope="col"></th>
                <th scope="col">Tên người thuê</th>
                <th scope="col">Số điện thoại</th>
                <th scope="col">Kiểu thanh toán</th>
                <th scope="col">Ghi chú</th>
                <th scope="col"></th>
            </tr>
            <c:forEach items="${roomLists}" var="room">
                <tr>
                    <td>
                        <button class="btn btn-primary">
                            <a href="rooms?action=view&idRoom=${room.idRoom}" class="text-dark">                            Xem thông tin
                            </a>
                        </button>
                    </td>
                    <td>
                            ${room.nameCustomer}
                    </td>
                    <td>
                            ${room.telephoneNumberCustomer}
                    </td>
                    <td>
                            ${room.typePay}
                    </td>
                    <td>
                            ${room.description}
                    </td>
                    <td>
                        <a class="btn btn-warning" href="rooms?action=edit&idRoom=${room.idRoom}">Sửa</a>
                        <a class="btn btn-danger" id="delete" href="rooms?action=delete&idRoom=${room.idRoom}">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>

</body>
</html>
