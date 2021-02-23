<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 26/01/2021
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách dịch vụ</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
    <form action="customers" method="post">
        <h1 class="text-center bg-primary">Danh sách Dịch vụ</h1>
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
                <a href="services?action=create" class="text-dark">Thêm mới dịch vụ</a>
            </button>
        </p>
        <table class="table table-light table-striped table-hover">
            <tr>
                <th scope="col"></th>
                <th scope="col">Tên dịch vụ</th>
                <th scope="col">Diện tích</th>
                <th scope="col">Số tầng</th>
                <th scope="col">Số lượng <br> tối đa</th>
                <th scope="col">Giá thuê</th>
                <th scope="col"></th>
            </tr>
            <c:forEach items="${serviceList}" var="service">
                <tr>
                    <td>
                        <button class="btn btn-primary">
                            <a href="services?action=view&idService=${service.idService}" class="text-dark">                            Xem thông tin
                            </a>
                        </button>
                    </td>
                    <td>
                            ${service.nameService}
                    </td>
                    <td>
                            ${service.areaUse}
                    </td>
                    <td>
                            ${service.floorTotal}
                    </td>
                    <td>
                            ${service.maximumGuest}
                    </td>
                    <td>
                            ${service.priceRent}
                    </td>
                    <td>

                        <a class="btn btn-warning" href="services?action=edit&idService=${service.idService}">Sửa</a>
                        <a class="btn btn-danger" href="services?action=delete&idService=${service.idService}">Xóa</a>

                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
</body>
</html>
