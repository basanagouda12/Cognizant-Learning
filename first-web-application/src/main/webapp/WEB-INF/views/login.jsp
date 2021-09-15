
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!! from jsp</title>
</head>
<body>
<form action="/first-web-application/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>

Name: <input type="text" name="name"/>
<br/>
password: <input type="password" name="password"/><br/>
<input type="submit" value="login" />

</form>
</body>
</html>