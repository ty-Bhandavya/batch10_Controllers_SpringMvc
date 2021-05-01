<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String name =(String) request.getAttribute("name");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Controller</title>
</head>
<body>
<h1>Welcome to TechnoElevate</h1>
<% if(name!=null && !name.isEmpty()){ %>
<h3>Name:<%= name %></h3>
<%} %>
</body>
</html>