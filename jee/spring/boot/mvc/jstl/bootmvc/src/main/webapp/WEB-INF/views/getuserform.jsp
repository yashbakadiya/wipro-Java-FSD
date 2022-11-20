<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Get user</title>
</head>
<body>
<h2>Get User by id</h2>

<form method="get" action="/displayuser">

    <div>
    <label>Id</label>
    <input name="id">
    </div>

    <button type="submit">Find User</button>

</form>

</body>
</html>