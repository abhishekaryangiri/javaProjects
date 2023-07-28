<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
<h2>Welcome <%= session.getAttribute("username") %>!</h2>
<a href="logoutServlet"></a>
</body>
</html>