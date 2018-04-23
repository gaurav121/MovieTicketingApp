<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
	.form{color:maroon;}
</style>	

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

<h2 class="form" align="justify">WelcomeUser</h2>



<!-- <a href="${pageContext.request.contextPath}/movie/showMovieList">Book Movie jsp</a> -->
<a href="${pageContext.request.contextPath}/movie/movieslist">Book Movie</a>

</body>
</html>