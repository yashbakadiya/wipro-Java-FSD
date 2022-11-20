<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
</head>
<body>
<h2>List Users</h2>


<c:forEach items="${users}" var="user">
<div>
    <c:out value="${user.id}"/>
    <c:out value="${user.name}"/>
    <c:out value="${user.age}"/>
    </div>
</c:forEach>


<h3>Table format</h3>
<table border="1px">
    <th>Id</th>
    <th>Name</th>
    <th>Age</th>
    <c:forEach items="${users}" var="user" >
 <tr>

        <td >
        <c:out value="${user.id}"/>
        </td>
        <td >
        <c:out value="${user.name}"/>
        </td>
        <td >
        <c:out value="${user.age}"/>
        </td>
    </tr>
        </c:forEach>
</table>

</table>

</body>
</html>