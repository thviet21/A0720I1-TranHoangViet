<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 04/01/2021
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="output" method="post">
    <label for="name">Họ tên:</label>
    <input type="text" name="name" id="name">
    <label for="birthday"> Ngày sinh:</label>
    <input type="text" name="birthday" id="birthday">
    <label for="address"> Địa chỉ: </label>
    <input type="text" name="address" id="address">
    <label for="image"> Ảnh: </label>
    <input type="file" name="image_src" id="image">
    <input type="submit">
</form>
</body>
</html>
