<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
	<form action="add">
		Book title: <input type="text" name="t1"><br> Author
		first name: <input type="text" name="t2"><br> Author last
		name: <input type="text" name="t3"><br> Year of
		publishment: <input type="text" name="t4"><br> Publishing
		house: <input type="text" name="t5"><br> Book price: <input
			type="text" name="t6"><br> <input type="submit"
			value="Add"><br>
		<br>
	</form>
	
	<%
		if (request.getAttribute("message") != null) {
		out.print(request.getAttribute("message"));
	}
	%>
	
	<form action="index.jsp">
		<input type="submit" value="Return to main page"><br>
	</form>
</body>
</html>