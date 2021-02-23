<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 01/02/2021
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chức năng thêm mới phòng trọ</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
    <form action="rooms?action=create" method="post">
        <h1 class="text-center bg-primary">Thêm mới Phòng</h1>
        <table class="table">
            <tr>
                <td scope="row">Tên người thuê</td>
                <td><input class="required" type="text" name="nameCustomer" required></td>
                <c:if test="${messageName!=null}">
                    <c:out value="${messageName}"></c:out>
                </c:if>
            </tr>
            <tr>
                <td scope="row">Số điện thoại</td>
                <td><input class="required" type="text" name="telephoneNumberCustomer" required></td>
                <c:if test="${messageTelephone!=null}">
                    <c:out value="${messageTelephone}"></c:out>
                </c:if>
            </tr>
            <tr>
                <td scope="row">Ngày bắt đầu thuê</td>
                <td><input class="required" type="date"  name="startDayRent" required></td>
            </tr>
            <tr>
                <td scope="row">Kiểu thanh toán</td>
                <td>
                    <select class="required" name="typePay" required>
                        <option value="1">Tháng</option>
                        <option value="2">Quý</option>
                        <option value="3">Năm</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td scope="row">Ghi chú</td>
                <td><input type="text" name="description"></td>
            </tr>
        </table>
        <input class="btn btn-primary" type="submit" value="Thêm mới">
        <button type="button" class="btn btn-danger">
            <a class="text-dark" href="rooms">Hủy</a>
        </button>
        <button type="button" class="btn btn-dark">
            Quay lại trang danh sách khách hàng
            <a class="glyphicon glyphicon-log-out text-dark" href="rooms"></a>
        </button>
        <input type="hidden" name="action" value="create">
    </form>
</div>

</body>
</html>
