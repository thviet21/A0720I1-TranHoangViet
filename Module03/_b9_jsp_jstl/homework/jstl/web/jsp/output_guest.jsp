<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 04/01/2021
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width: 70%; margin: auto;">
    <h1 style="display: flex; align-items: center">Danh sách khách hàng</h1>
    <table style=" display: flex;justify-content: center; text-align: center;"  >
        <tr>
            <th style="width: 200px">Tên</th>
            <th>Ngày sinh</th>
            <th style="width: 500px">Địa chỉ</th>
            <th>Ảnh</th>
        </tr>

        <c:forEach items="${guestList}" var="guest">
            <tr>
                <td>${guest.name}</td>
                <td>${guest.birthday}</td>
                <td>${guest.address}</td>
                <td>Ảnh nè</td>
            </tr>
        </c:forEach>
    </table>


</div>
</body>
</html>
