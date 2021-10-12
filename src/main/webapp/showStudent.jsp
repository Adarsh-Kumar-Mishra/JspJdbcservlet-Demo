<%@page import="com.adarsh.web.model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
   <%
    Student s =  (Student)request.getAttribute("showStudent");
    out.print(s);
   
   %>
</body>
</html>