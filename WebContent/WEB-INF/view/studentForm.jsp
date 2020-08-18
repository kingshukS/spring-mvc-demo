<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Page</title>
</head>
<body>
	<form:form modelAttribute="student" method="POST" action="processForm">
		First Name : <form:input path="firstName" placeholder="enter your first name"/><br><br>
		Last Name : <form:input path="lastName" placeholder="enter your last name"/><br><br>
		Country: <form:select path="country">
			<form:option value="-" label="--select country--"></form:option>
			<form:options items="${countryOptions}"/>
		</form:select><br><br>
		Favorite Language: <form:radiobuttons path="favouriteLanguage" 
			items="${languageOptions}"/><br><br>
		Operating System: <form:checkboxes items="${osOptions}" path="operatingSystems"/><br><br><br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>