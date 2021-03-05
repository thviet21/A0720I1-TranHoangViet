<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Login Practice</title>
</head>
<body>
<h2>Home</h2>
<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <legend>
            Login
        </legend>
        <table>
            <tr>
                <td>
                    <form:label path="account">
                        Account:
                    </form:label>
                </td>
                <td>
                    <form:input path="account"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="password">
                        Password:
                    </form:label>
                </td>
                <td>
                    <form:input path="password"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Login</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>