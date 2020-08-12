<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Confirmation</title>
</head>
<body>
	<h1>
		Hi, ${student.firstName} ${student.lastName}, <br> Your are from
		: ${student.country}.<br> Your favorite language is :
		${student.favouriteLanguage}<br>
	You have exposure on :</h1>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li><h3>${temp}</h3></li>
		</c:forEach>
	</ul>
</body>
</html>