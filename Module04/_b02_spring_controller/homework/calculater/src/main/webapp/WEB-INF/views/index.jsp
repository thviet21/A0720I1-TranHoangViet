<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 26/02/2021
  Time: 5:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculater</title>
  </head>
  <body>
  <h2>Calculater</h2>
  <form action="caculate" method="post">
    <input type="number" name="number1" placeholder="Not null or string" required>
    <br>
    <input type="number" name="number2" placeholder="Not null or string" required>
    <br>
    <input type="submit" name="cal" value="Sum">
    <input type="submit" name="cal" value="Sub">
    <input type="submit" name="cal" value="Mul">
    <input type="submit"  name="cal" value="Div">
  </form>
  <h3>${massage}</h3>
  <h3>${}</h3>
  </body>
</html>
