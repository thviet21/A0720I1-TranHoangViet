<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 25/01/2021
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông tin khách hàng</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
    <form action="customers?action=create" method="post">
        <h1 class="text-center bg-success">Thông tin Khách hàng</h1>
        <table class="table">
            <tr>
                <th scope="col">ID Khách hàng</th>
                <th scope="col">ID Loại khách</th>
                <th scope="col">Tên khách hàng</th>
                <th scope="col">Giới tính</th>
                <th scope="col">Ngày sinh</th>
                <th scope="col">Số cmnd/Passport</th>
                <th scope="col">Số điện thoại</th>
                <th scope="col">Email</th>
                <th scope="col">Địa chỉ</th>
            </tr>
            <tr>
                <td>${customer.idCus}</td>
                <td>${customer.typeCus}</td>
                <td>${customer.nameCus}</td>
                <td>${customer.gender}</td>
                <td>${customer.birthDay}</td>
                <td>${customer.passPort}</td>
                <td>${customer.telephoneNumber}</td>
                <td>${customer.emailCus}</td>
                <td>${customer.addressCus}</td>
            </tr>
        </table>
    </form>
    <button class="btn btn-warning">
    <a class="text-dark" href="customers">Quay lại trang danh sách khách hàng</a>
    </button>
</div>
</body>
</html>
