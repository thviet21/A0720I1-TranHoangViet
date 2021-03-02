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
    <title>Sandwich Condiments</title>
  </head>
  <body>
  <h2>Add Sandwich Condiments</h2>
  <form action="save" method="post">
    <input type="checkbox" name="condiments" value="Lettuce"> Lettuce
    <input type="checkbox" name="condiments" value="Tomato"> Tomato
    <input type="checkbox" name="condiments" value="Mustard"> Mustard
    <input type="checkbox" name="condiments" value="Sprouts"> Sprouts
    <hr>
    <input type="submit" value="Submit">
  </form>
  <c:forEach items="${condiments}" var="condiment">
    ${condiment}
  </c:forEach>
  </body>
</html>
