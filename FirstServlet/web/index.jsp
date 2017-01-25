<%@page import="entities.Employee"%>
<%@page import="java.util.List"%>
<%@page import="DAO.Emp"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Simple JSP CRUD Example</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Employee List</h2>
        <table border="1">
            <thead>
                <tr><th>ID</th> <th>NAME</th> <th>MOBILE</th> <th>AGE</th> <th>ACTION</th> </tr>
            </thead>
            <tbody>
            <%
                List<Employee> empList = Emp.getAll();
                for(Employee e:empList){
            %>

            <tr>
                <td><%= e.getId() %></td>
                <td><%= e.getName() %></td>
                <td><%= e.getMobile() %></td>
                <td><%= e.getAge() %></td>
                <td> <a href="Employee?editId=<%=e.getId()%>" >Edit</a> <a href="Employee?deleteId=<%=e.getId()%>">Delete</a> </td>
            </tr>

            <% } %>
            </tbody>
        </table>
        <br/>
        <a href="Employee">Add Employee</a>
    </body>
</html>
