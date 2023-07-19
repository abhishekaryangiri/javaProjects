<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="b"%>
<%@page errorPage="errpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error handling</title>
</head>
<body>
<h3>error handling</h3>
<%!
int a1=20, a2=0;
%>
<% int div=a1/a2;%>
<h3>Div: <%= div %></h3>
</body>
</html>