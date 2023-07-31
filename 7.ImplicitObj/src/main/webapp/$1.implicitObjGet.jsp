<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>9 Implicit Obj</title>

</head>
<body>

<% out.println(" Implicit Obj: dre r 9 impl Obj/these obj r created by webcontainer, that r avail for all jsp pages avilable imp obj. r --> "+"1. "+"out "+"2. "+  "request "+" 3. "+"config "+" 4. "+"session"+5.  +"application");%>

<%out.println("hello coder, today is "+ Calendar.getInstance().getTime()); %>

<!-- 1. jsp out implicit obj: -->

<!-- For writing any data to the buffer, JSP provides an implicit object named out. It is the object of JspWriter. In case of servlet you need to write:

PrintWriter out=response.getWriter();  
But in JSP, you don't need to write this code -->

</body>
</html>