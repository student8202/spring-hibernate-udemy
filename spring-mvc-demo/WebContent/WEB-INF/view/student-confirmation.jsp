<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student confirmation form</title>
</head>
<body>
	Student is confirmed: ${student.firstName} ${student.lastName}
	<br/>
	Country: ${student.country }  
	
	<br/>
	Favourite Language: ${student.favoriteLanguage}
	
	<br/>
	Operation Systems:
	<ul>
		<c:forEach var="temp" items="${student.operationSystems} ">
			<li> ${temp} </li>
		</c:forEach>
	</ul>  
</body>
</html>