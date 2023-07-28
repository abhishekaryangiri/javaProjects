<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %></h2>
    <a href="LogoutServlet">Logout</a>
</body>
</html>
