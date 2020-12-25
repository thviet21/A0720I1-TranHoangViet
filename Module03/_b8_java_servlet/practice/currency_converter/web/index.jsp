<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 25/12/2020
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h2> Currency Converter</h2>
  <form method="post" action="/currency_converter_war_exploded/convert">
    <label for="rate">Rate: </label>
    <input type="text" name="rate" id="rate" placeholder="Rate current" value="23000"><br>
    <label for="USD">USD: </label>
    <input type="text" name="usd" id="USD" value="0"><br>
    <input type="submit">
  </form>
  </body>
</html>
