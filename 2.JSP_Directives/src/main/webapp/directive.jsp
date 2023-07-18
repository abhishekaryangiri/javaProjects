<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!--    page directive: -->
 <%@page import="java.util.Random,java.util.ArrayList,java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Directive Use</title>
<style type="text/css">
*{
margin: 0px;
padding: 0px;
}
</style>
</head>
<body>
<%@include file="header.jsp" %>
<h1>Explanation: How to use page directive? </h1>

<h1>Random Number: 
<% Random r= new Random();
int  x = r.nextInt(8);
%>
<%=x %></h1>
</body>
</html>