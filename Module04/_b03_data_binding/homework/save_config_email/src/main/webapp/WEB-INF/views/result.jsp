<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Information</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <th>Language :</th>
        <td>${language}</td>
    </tr>
    <tr>
        <th>Page Size :</th>
        <td>${pageSize}</td>
    </tr>
    <tr>
        <th>Spammer:</th>
        <td>${spamFilter}</td>
    </tr>
    <tr>
        <th>Signature:</th>
        <td>${signature}</td>
    </tr>
</table>
</body>
</html>