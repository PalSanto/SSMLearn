
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="<%=request.getContextPath()%>/js/jquery-3.6.1.js"></script>
    <script>
        var userList = new Array();
        userList.push({username:"zx",password:123123});
        userList.push({username:"wcy",password:159753});
        $.ajax({
            type:"POST",
            url:"<%=request.getContextPath()%>/user/quick12",
            data:JSON.stringify(userList),
            contentType:"application/json;charset:utf-8"
        })
    </script>
</head>
<body>

</body>
</html>
