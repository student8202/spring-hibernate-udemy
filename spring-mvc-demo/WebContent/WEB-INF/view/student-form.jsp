<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student register form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br/><br/>
		Last name: <form:input path="lastName" />
		<br/><br/>
		
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br/><br/>
		
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
		<br/><br/>
		
		Operation Systems: <br/>
		Linux <form:checkbox path="operationSystems" value="Linux"/>
		Mac OS <form:checkbox path="operationSystems" value="Mac Os"/>
		Window <form:checkbox path="operationSystems" value="Window"/>
		<br/><br/>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>