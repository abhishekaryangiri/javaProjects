<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user</title>
</head>
<body>
	<%
	String usrName = request.getParameter("usrName");
	if(usrName.equals("dada"))
	{
		response.sendRedirect("userWindow.jsp");
	}else{
		out.println("unauthorized user");
	}
	
	%>
</body>
</html>