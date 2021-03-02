<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Upload Multi File</title>

</head>

<body>

    <jsp:include page="_menu.jsp"/>
    <h3>Upload One File: </h3>
    <form:form modelAttribute="myUploadForm" method="post" action="uploadOneFile" enctype="multipart/form-data">
        Description:
        <br>
        <form:input path="description" cssStyle="width: 300px"/>
        <br>
        File to upload (1): <form:input path="fileDatas" type="file"/>
        <input type="submit" value="Upload">
    </form:form>
</body>

</html>