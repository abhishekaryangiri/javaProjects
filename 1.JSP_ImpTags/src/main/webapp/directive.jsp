<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Random, java.util.ArrayList, java.io.*" %>
    <%@page isErrorPage="true" %>
    <%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page directive</title>
</head>
<body>
<%@include file="header.jsp"  %>
<h1>
Random num: 
<%
Random r = new Random();
int n = r.nextInt(10);
//out.println(n);
%>
<%=n %>
</h1>



</body>
</html>