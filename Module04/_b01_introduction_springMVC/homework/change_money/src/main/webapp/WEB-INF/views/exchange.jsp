<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Đổi tiền</title>
        <link href="../css/exchange.css" type="text/css" >
    </head>
    <body>
        <h2>Chuyển đổi tiền tệ</h2>
        <form action="exchange" method="post">
            <label for="USD">USD: </label>
            <input type="text" name="USD" id="USD">
            <br>
            <br>
<%--            <label for="VND">VND: </label>--%>
<%--            <input type="text" name="VND" id="VND">--%>
<%--            <br>--%>
<%--            <br>--%>
            <input type="submit" value="Exchange">
        </form>
    </body>
</html>
