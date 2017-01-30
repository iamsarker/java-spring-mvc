<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Raw Jsp Session Management</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Type any username</div>
        <%
            String username = request.getParameter("username");
            
            if( username != null && username.length() > 0 ){
                session.setAttribute("username", username);
                response.sendRedirect("dashboard.jsp");
            } else{
                out.println("");
            }
        %>
        
        <form action="index.jsp" method="post">
            <input name="username" type="text" />
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
