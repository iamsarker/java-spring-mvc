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
        
        <%
            String isLogout = request.getParameter("logout");
            if( isLogout != null ){
                session.invalidate();
                response.sendRedirect("index.jsp");
            }
        %>
        
        <form action="dashboard.jsp" method="post" >
            <input type="submit" name="logout" value="Logout" />
        </form>
    </body>
</html>
