<%@page language="java" pageEncoding="ISO-8859-1"
	contentType="text/html; ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">

</head>
<body>

<h1>Home Page</h1>


<h3>News List</h3>

<c:forEach items="${newsList}" var="news">

<div>
<h3>
 <c:out value="${news.title}"/>
</h3>
<c:out value="${news.newsId}"/>
<br>
<c:out value="${news.content}"/>
<br>
<c:out value="${news.description}"/>

<br>
<h3>delete link </h3>
<a href="<c:url value='/deleteNews?newsId=${news.newsId}'  />" >   Delete Link </a>

</div>

</c:forEach>






</body>
</html>