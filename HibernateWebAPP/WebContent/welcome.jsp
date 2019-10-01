<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>
</head>
<body>
<%@include file="header.html" %>


<%
String username=request.getParameter("username");

session.setAttribute("uname", username);
session.setMaxInactiveInterval(5);
String productUrlEnc=response.encodeURL("product.jsp");

%>
<c:set var="uname" value="${param.username }" scope="session"></c:set>
<c:set var="productUrlEnc" value="product.jsp" ></c:set>

<p>Dear ${param.username} welcome to Zensar Technologies</p>
<p>Your session Timeout period is ${pageContext.session.maxInactiveInterval}</p>
<p>to view and purchase the product of Zensar<a href="${productUrlEnc }">Click here</a></p>

<%@include file="footer.html" %>
</body>
</html>