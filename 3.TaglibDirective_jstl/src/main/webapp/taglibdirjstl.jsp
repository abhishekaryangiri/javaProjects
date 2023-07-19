<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
 <!--    it means sarey tag hm a k help se use kr sktey h -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>taglib dir jstl</title>
</head>
<body>
<div style=" text-align: center;   background: orange ">
<h2>taglib dir(use of jstl)</h2>
<a:set var="name" value="Hello jsp"></a:set>
<a:out value="${name }"></a:out>
</div>
<hr>

<div style="background: purple; text-align: center; height: 60px">
<a:if test="${20<5 }">
<h3>True!!</h3>
</a:if>
</div>

</body>
</html>