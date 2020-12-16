<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="index.jsp">
		<input type="submit" value="Return to main page"><br>
	</form>

	<c:forEach items="${result}" var="i">
		<c:forEach items="${i}" var="x">
			${x}
		</c:forEach>
		<br>
	</c:forEach>
</body>
</html>