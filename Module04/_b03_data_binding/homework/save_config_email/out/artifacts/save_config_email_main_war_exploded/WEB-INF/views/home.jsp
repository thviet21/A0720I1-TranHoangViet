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
    Language: <form:select path="language">
        <form:options items="${languageList}" />
    </form:select>
    <br>
    Page Size: Show <form:select path="pageSize">
        <form:options items="${pageSizeList}" />
    </form:select> email per page
    <br>
    Spam filter: <form:checkbox path="spamFilter" value="${configEmail.spamFilter}"/>
    <br>
    Signature: <form:textarea path="signature" title="${configEmail.signature}"/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
