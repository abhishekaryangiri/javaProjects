<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@page errorPage="errorfound.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>opr</title>
</head>
<body>
<%
	//fetch 2 num
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");
	//conv. str to int
	int a = Integer.parseInt(n1);
	int b = Integer.parseInt(n2);
	int c=a/b;
%>

<div style="background: blue; color: white; width: auto; justify-content: center; text-align: center; display: flex">
<h2 >Output: <%= c %></h2>
</div>
</body>
</html>