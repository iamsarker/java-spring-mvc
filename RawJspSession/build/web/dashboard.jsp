<%-- 
    Document   : dashboard
    Created on : Jan 30, 2017, 10:20:02 AM
    Author     : SHAHADAT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Raw Jsp Session Management</title>
    </head>
    <body>
        <h1>Your Typed Username: <%= session.getAttribute("username") %> </h1>
    </body>
</html>
