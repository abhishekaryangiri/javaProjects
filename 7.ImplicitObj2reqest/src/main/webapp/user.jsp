<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User details</title>
</head>
<body>
<%
String usrName = request.getParameter("usrName");
/* String  usrPass = request.getParameter("usrPass"); */
if( usrName.equals("allu")){
	out.print("welcome "+ usrName);
}else{
	out.print("unothorized user");
}

%>
</body>
</html>