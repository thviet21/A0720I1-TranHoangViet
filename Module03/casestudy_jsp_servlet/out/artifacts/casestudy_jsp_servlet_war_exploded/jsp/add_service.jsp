<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 29/01/2021
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới dịch vụ</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<div class="container">
    <form action="services?action=create" method="post">
        <h1 class="text-center bg-primary">Thêm mới Dịch vụ</h1>
        <table class="table">
            <tr>
                <td scope="row">Tên dịch vụ</td>
                <td><input type="text" name="nameService"></td>
            </tr>
            <tr>
                <td scope="row">Diện tích</td>
                <td><input placeholder=">30m2" type="text" name="areaUse"></td>
            </tr>
            <tr>
                <td scope="row">Số tầng</td>
                <td><input type="text" placeholder=">1" name="floorTotal"></td>
            </tr>
            <tr>
                <td scope="row">Giới hạn khách</td>
                <td>
                    <input type="text" name="maximumGuest">
                </td>
            </tr>
            <tr>
                <td scope="row">Giá thuê</td>
                <td><input type="text" name="priceRent"></td>
            </tr>
            <tr>
                <td scope="row">Kiểu thuê</td>
                <td>
                    <select name="typeRent">
                        <option value="1">Ngày</option>
                        <option value="2">Tuần</option>
                        <option value="3">Tháng</option>
                        <option value="4">Năm</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td scope="row">Kiểu dịch vụ</td>
                <td>
                    <select name="typeService">
                        <option value="1">Villa</option>
                        <option value="2">House</option>
                        <option value="3">Room</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td scope="row">Trạng thái</td>
                <td>
                    <select name="statusService">
                        <option value="Sẵn sàng">Sẵn sàng</option>
                        <option value="Đã thuê">Đã thuê</option>
                        <option value="Đang sửa">Đang sửa</option>
                    </select>
                </td>
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
