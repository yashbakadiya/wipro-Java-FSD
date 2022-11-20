<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Get user</title>
</head>
<body>
<h2>Get User by id</h2>

<form method="get" action="/processAddUser">

    <div>
    <label>Name</label>
    <input name="name">
    </div>

    <div>
        <label>Age</label>
        <input name="age" type="number">
    </div>


    <button type="submit">Add User</button>

</form>

</body>
</html>