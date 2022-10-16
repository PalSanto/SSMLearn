
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick19" method="post" enctype="multipart/form-data">
    名称<input type="text" name="username"><br>
    文件<input type="file" name="uploadFiles"><br>
    文件<input type="file" name="uploadFiles"><br>
    <input type="submit" name="upload"><br>
</form>

<form action="${pageContext.request.contextPath}/user/quick18" method="post" enctype="multipart/form-data">
    名称<input type="text" name="username"><br>
    文件<input type="file" name="uploadFile"><br>
    <input type="submit" name="upload"><br>
</form>
</body>
</html>
