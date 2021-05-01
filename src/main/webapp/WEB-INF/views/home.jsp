<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String name = (String) request.getAttribute("user");
    String pwd = (String) request.getAttribute("pwd");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 >Name :<%= name %></h1>
<h2>Password:<%=pwd %></h2>
</body>
</html>