<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 22/01/2021
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
    <form action="customers?action=create" method="post">
        <h1 class="text-center bg-primary">Thêm mới Khách hàng</h1>
        <table class="table">
            <tr>
                <td scope="row">Loại khách</td>
                <td>
                    <select name="idTypeCus" class="custom-select custom-select-sm">
                        <option value="1">Diamond</option>
                        <option value="2">Platinium</option>
                        <option value="3">Gold</option>
                        <option value="4">Silver</option>
                        <option value="5">Member</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td scope="row">Họ và Tên Khách hàng</td>
                <td><input type="text" name="nameCus"></td>
            </tr>
            <tr>
                <td scope="row">Ngày sinh</td>
                <td><input type="date" placeholder="Pattern" name="birthdayCus"></td>
            </tr>
            <tr>
                <td scope="row">Giới tính</td>
                <td>
                    <select name="gender" class="custom-select custom-select-sm">
                        <option value="Nam">Nam</option>
                        <option value="Nữ">Nữ</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td scope="row">Số chứng minh nhân dân/ Passport</td>
                <td><input type="text" name="passport"></td>
            </tr>
            <tr>
                <td scope="row">Số điện thoại</td>
                <td><input type="text" name="telephoneNumber"></td>
            </tr>
            <tr>
                <td scope="row">Email</td>
                <td><input type="text" name="emailCus"></td>
            </tr>
            <tr>
                <td scope="row">Địa chỉ</td>
                <td><input type="text" name="addressCus"></td>
            </tr>
        </table>
        <input class="btn btn-primary" type="submit" value="Thêm mới">
        <input class="btn btn-warning" type="reset" value="Nhập lại">
        <button type="button" class="btn btn-dark">
            Quay lại trang danh sách khách hàng
            <a class="glyphicon glyphicon-log-out text-dark" href="customers"></a>
        </button>

        <input type="hidden" name="action" value="create">
    </form>
</div>
</body>
</html>
