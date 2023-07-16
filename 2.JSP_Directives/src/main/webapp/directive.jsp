<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!--    page directive: -->
 <%@page import="java.util.Random,java.util.ArrayList,java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Directive Use</title>
</head>
<body>
<h1>Explanation: How to use page directive? </h1>

<h1>Random Number: 
<% Random r= new Random();
int  x = r.nextInt(8);
%>
<%=out.println(x) %></h1>
</body>
</html>