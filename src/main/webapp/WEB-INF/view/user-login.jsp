<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
	.error{color: red;}
	</style>
<style type="text/css">
	.form{color:maroon;}
</style>	
	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${testing}
${testing2}

<h2 align="center" style="color: purple;">Please provide valid username/password!!</h2>

<p>
<form:form action="${pageContext.request.contextPath}/authenticateUser" method="POST">
		
	<p class="error">	<c:if test="${param.error!=null}">
				<i>Invalid UserName/Password.</i>
		</c:if>
	</p>	
	
	
		<br>
	
	<h2 align="center" style="color: fuchsia;"></h2>
		<br>
		<p class="form" align="center">UserName:<input type="text" name="username"></p>
		<br>
		<p class="form" align="center">Password:<input type="password" name="password"></p>
		<br>
		<p class="form" align="center"><input type="submit" value="Login"></p>	
		<br>

</form:form>
</p>

</body>
</html>