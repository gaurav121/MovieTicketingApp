<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1 align="center" style="color: maroon;">Hello !! welcome to BookMyShow</h1>

<p align="justify" style=" border:dotted; border-bottom: thick;">
<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<p align="right" style="color: fuchsia;"><input type="submit" value="Logout"></p>
</form:form>
</p>

</body>
</html>