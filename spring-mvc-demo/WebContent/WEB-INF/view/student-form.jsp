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
		<form:option value="US" label="American"/>
		<form:option value="Germany" label="Germany"/>
		<form:option value="France" label="France"/>
		<form:option value="Italy" label="Italy"/>
	</form:select>
	
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>