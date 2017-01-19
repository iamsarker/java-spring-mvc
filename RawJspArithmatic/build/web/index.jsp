<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Raw JSP Arithmetic</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Raw JSP Arithmetic</h2>
        <%
            int a = 7, b = 5;
            String str1="Author: ", str2="Md. Shahadat Sarker";
            out.write("output: " + a + " + " + b + " : " + (a+b));
            out.write("<br>output: " + a + " - " + b + " : " + (a-b));
            out.write("<br>" + str1 + str2);
        %>
    </body>
</html>
