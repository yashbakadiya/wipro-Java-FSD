<%@page language="java" pageEncoding="ISO-8859-1"
	contentType="text/html; ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">

</head>
<body>

	<!-- Create a form which will have text boxes for News ID, title, author,description, content
		 along with a Send button. Handle errors like empty fields -->


	<!-- display all existing news in a tabular structure with News ID, title, author,description,content
		publishedAt and Action(delete button) -->


<form:form method="post" action="/saveData" modelAttribute="news">

<div>
<label>news id </label>

<form:input path="newsId" />

</div>


<div>
<label>title </label>

<form:input  path="title" />

</div>


<div>
<label>author </label>

<form:input  path="author" />

</div>


<div>
<label>Description </label>

<form:input  path="description" />

</div>



<div>
<label>Content </label>

<form:input  path="content" />





</div>

<button type="submit">Add</button>

</form:form>

</body>
</html>