<%@page import="entities.Employee"%>
<%@page import="DAO.Emp"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Employee Management - First Servlet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            String editId = request.getParameter("editId");
            String deleteId = request.getParameter("deleteId");
            
            if( editId == null && deleteId == null ){
        %>
        <form action="Employee" method="post">
            <h2>Add New Employee</h2>
            <input type="hidden" value="ADD" name="opt" />
            <table>
                <tbody>
                    <tr><td>Name</td><td> <input type="text" name="empName" /> </td></tr>
                    <tr><td>Mobile</td><td> <input type="text" name="empMobile" /> </td></tr>
                    <tr><td>Age</td><td> <input type="text" name="empAge" /> </td></tr>
                    
                    <tr><td colspan="2" style="text-align: right;" > <input type="reset" value="Reset" /> <input type="submit" value="Save" /> </td></tr>
                </tbody>
            </table>
        </form>
        
        <% }else if( editId != null && deleteId == null ){ 
            Employee e = Emp.getEmployee(editId);
        %>
        <form action="Employee" method="post">
            <h2>Edit Employee</h2>
            <input type="hidden" value="EDIT" name="opt" />
            <input type="hidden" value="<%= editId %>" name="empId" />
            <table>
                <tbody>
                    <tr><td>Name</td><td> <input type="text" value="<%= e.getName()%>" name="empName" /> </td></tr>
                    <tr><td>Mobile</td><td> <input type="text" value="<%= e.getMobile()%>" name="empMobile" /> </td></tr>
                    <tr><td>Age</td><td> <input type="text" value="<%= e.getAge()%>" name="empAge" /> </td></tr>
                    
                    <tr><td colspan="2" style="text-align: right;" > <input type="reset" value="Reset" /> <input type="submit" value="Save" /> </td></tr>
                </tbody>
            </table>
        </form>
        <% }else if( editId == null && deleteId != null ){ 
            Emp.delete(Integer.parseInt(deleteId));
            response.sendRedirect("index.jsp");
        } %>
    </body>
</html>
