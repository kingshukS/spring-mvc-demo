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
<body><h1>
		Hi, ${customer.firstName} ${customer.lastName},<br>
		Welcome to our e-mart.<br>
		You have ${customer.freePasses} free passes to enter.<br>
		Your Postal Code : ${customer.postalCode}<br>
		You're getting 10% discount for the course code :${customer.courseCode}.</h1>
</body>
</html>