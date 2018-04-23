<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<h2>Welcome to Movie Ticketing</h2>
	<br>

	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>Movie list</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Movie Name</th>
				<th>Cast</th>
				<th>Length</th>
				<th>Language</th>
				<th>Book Tickets</th>
			</tr>
			<c:forEach var="movie" items="${movielist}">
				<tr>
					<td><c:out value="${movie.movieID}" /></td>
					<td><c:out value="${movie.moviename}" /></td>
					<td><c:out value="${movie.cast}" /></td>
					<td><c:out value="${movie.movieLength}" /></td>
					<td><c:out value="${movie.language}" /></td>
					<td><form:form
							action="${pageContext.request.contextPath}\movie\bookMovie"
							method="post">
							<input type="hidden" name="movieID" value=${movie.movieID}>
							<input type="submit" name="Book Tickets">
						</form:form></td>

				</tr>
			</c:forEach>
		</table>
	</div>

<form:form action="${pageContext.request.contextPath}\movie\testform" method="get">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" value="submit">
</form:form>



</body>
</html>