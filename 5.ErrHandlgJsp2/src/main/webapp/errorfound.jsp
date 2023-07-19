<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Error found!!!!</title>
</head>
<body>
<div class="container p-3 text-center ">
<img style="width: 600px; height: 400px" class="img-fluid " alt="Responsive image"  src="img/err-not.png">
<h3 class="text-danger text-center">Opps!!! something Wrong!!!</h3>
 <p><%=exception %></p>
 <a class="btn btn-outline-primary" href="index.html">Home pge</a>
</div>
</body>
</html>