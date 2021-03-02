<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 02/03/2021
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Config Email</title>
</head>
<body>
<h3>Email Config</h3>
<form:form method="post" action="created" modelAttribute="configEmail">
    Language: <form:checkboxes path="language" items="${languageList}"/>
    Page Size: Show <form:select path="pageSize">
    <form:option value=""
</form:select>
</form:form>
</body>
</html>
