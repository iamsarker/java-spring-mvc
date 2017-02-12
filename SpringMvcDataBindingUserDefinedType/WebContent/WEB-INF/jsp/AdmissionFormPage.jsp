<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:errors path="student.*" />
	<form action="/SpringMvcDataBindingUserDefinedType/submitAdmissionForm.html" method="post">
		<h1>${cmsg}</h1>
		<h2>Form Admission Sample</h2>
		<table>
			<tr> <td>Name</td> <td> <input type="text" name="name" /> </td> </tr>
			<tr> <td>Age</td> <td> <input type="text" name="age" /> </td> </tr>
			<tr> <td>NID</td> <td> <input type="text" name="nid" /> </td> </tr>
			<tr> <td>Student DoB</td> <td> <input type="text" name="studentDoB" /> </td> </tr>
			<tr> <td>Skills</td> <td> <select name="skillList" multiple="multiple">
				<option value="Spring MVC">Spring MVC</option>
				<option value="Core Java">Core Java</option>
			</select> </td> </tr>
			
			<tr> <td colspan="2">&nbsp;</td> </tr>
			
			<tr> <td>Country</td> <td> <input type="text" name="studentAddress.country" /> </td> </tr>
			<tr> <td>City</td> <td> <input type="text" name="studentAddress.city" /> </td> </tr>
			<tr> <td>Street</td> <td> <input type="text" name="studentAddress.street" /> </td> </tr>
			<tr> <td>ZipCode</td> <td> <input type="text" name="studentAddress.zincode" /> </td> </tr>
			
			<tr> <td colspan="2">&nbsp;</td> </tr>
			
			<tr> <td></td> <td> <input type="submit" value="Submit" /> </td> </tr>
		</table>
	</form>
</body>
</html>