<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://tomcat.apache.org/example-taglib" prefix="t"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>tag</title>
</head>
<body>
<div class="progress mt-3">
  <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
</div>
<div class="container d-flex justify-content-center mt-3 mb-3">
<div class="card  bg-primary text-white">
  <div class="card-body">
    <h2 class="card-title">Custom Tags</h2>
    <p class="card-text">Custom tags are user-defined tags. They eliminates the possibility of scriptlet tag and separates the business logic from the JSP page. The same business logic can be used many times by the use of custom tag.</p>
  </div>
</div>
</div>

<t:mytag></t:mytag>
<hr>
<div class="mr-3">
<t:printTable number="20"></t:printTable>
</div>
</body>
</html>