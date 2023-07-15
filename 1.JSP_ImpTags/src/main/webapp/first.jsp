<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first jsp</title>
</head>
<!-- <body style="background: yellow"> -->
<body>
<%@include file="header.jsp"  %>
<h1>First JSP</h1>

<!-- declaration tag -->
<%!
int a=2;
int b=450;
String  name = "Hello JSP";

public int add(){
	return a+b;
}
public int multy(){
	return a*b;
}
public String reverse(){
	StringBuffer sb = new StringBuffer(name);
	return sb.reverse().toString();
}

%>

<%
//scripting tag
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");
out.println("sum: "+ add());
out.println("<br>");
out.println(reverse());
%>


<!-- expression tag -->
<h2 style="color: red">Multiplication: <%= multy() %></h2>
<h2 style="color: grey">Reverse: <%= reverse() %></h2>
<h2 style="color: green">Sum is: <%= add() %></h2>

</body>
</html>