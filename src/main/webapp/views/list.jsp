<%--
  Created by IntelliJ IDEA.
  User: tatar
  Date: 13.03.17
  Time: 1:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Список пользователей</h1>
<a href="/add/">Добавить пользователя</a>
<table border="1" cellpadding="5" cellspacing="0">
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td><c:out value="${user.id}"></c:out></td>
            <td><c:out value="${user.login}"></c:out></td>
            <td><c:out value="${user.password}"></c:out></td>
            <td><a href="/students/del/?id=<c:out value="${user.id}"></c:out>">удалить</a></td>
            <td><a href="/students/edit/?id=<c:out value="${user.id}"></c:out>">редактировать</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
