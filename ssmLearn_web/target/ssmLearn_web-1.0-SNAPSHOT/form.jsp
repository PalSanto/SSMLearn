
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/user/quick11" method="post">
<%--表面是第几个User对象的实例--%>
    <input type="text" name="userList[0].username"></br>
    <input type="text" name="userList[0].password"></br>
    <input type="text" name="userList[1].username"></br>
    <input type="text" name="userList[1].password"></br>
    <input type="submit">
</form>
</body>
</html>
