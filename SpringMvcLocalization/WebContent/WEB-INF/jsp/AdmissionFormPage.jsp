<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<a href="/SpringMvcLocalization/admissionForm.html?locale=en">ENGLISH</a> | 
	<a href="/SpringMvcLocalization/admissionForm.html?locale=bn">BANGLA</a>
	
	<form:errors path="student.*" />
	<form action="/SpringMvcLocalization/submitAdmissionForm.html" method="post">
		<h1>${cmsg}</h1>
		<h2>Form Admission Sample</h2>
		<table>
			<tr> <td><spring:message code="label.Name"/> </td> <td> <input type="text" name="name" /> </td> </tr>
			<tr> <td><spring:message code="label.Age"/></td> <td> <input type="text" name="age" /> </td> </tr>
			<tr> <td><spring:message code="label.NID"/></td> <td> <input type="text" name="nid" />  </td> </tr>
			<tr> <td><spring:message code="label.StudentDoB"/></td> <td> <input type="text" name="studentDoB" /> </td> </tr>
			<tr> <td><spring:message code="label.Skills"/></td> <td> <select name="skillList" multiple="multiple">
				<option value="Spring MVC">Spring MVC</option>
				<option value="Core Java">Core Java</option>
			</select> </td> </tr>
			<tr> <td>DEPT</td> <td> <input type="text" name="dept" />  </td> </tr>
			
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