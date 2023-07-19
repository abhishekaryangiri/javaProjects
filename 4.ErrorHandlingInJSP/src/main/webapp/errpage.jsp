<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sorry !! something goes wrong</title>
</head>
<body>
<div style="background: red; text-align: center; height: 100px">
<h1>Sorry !! something goes wrong</h1>
<br>
<!-- print which exc is occu -->
<h4>Error type: <%= exception %></h4>
</div>
</body>
</html>