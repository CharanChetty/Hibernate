<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" buffer="16kb" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="yellow">
<%@include file="header.html" %>
<form action="checkuser" method="post">
<p><input type="text" name="username" placeholder="user name"></p>
<p><input type="password" name="password" placeholder="enter password"></p>
<p><input type="submit" value="sign_in_plzz"></p>
</form>
<%@include file="footer.html" %>
</body>
</html>