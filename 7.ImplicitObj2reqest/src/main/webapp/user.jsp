<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User details</title>
</head>
<body>
<!-- JSP request Object is the instance of 
javax.servlet.http.HttpServletRequest -->

<!-- this objh is used to get HTTP Header info, 
data entered  on prev page etc -->
<!-- ex1 -->
<%
String usrName = request.getParameter("usrName");
if( usrName.equals("allu")){
	out.print("welcome "+ usrName);
}else{
	out.println("unothorized user");
}
%>

<!-- ex2 -->
<h4> <%= request.getRequestURL() %></h4>
<h4> <%= request.getContentLength()%></h4>
<h4> <%= request.getServerName()%></h4>
<h4> <%= request.getServerPort()%></h4>
</body>
</html>