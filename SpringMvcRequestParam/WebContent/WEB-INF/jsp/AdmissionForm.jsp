<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>

	<form action="/SpringMvcRequestParam/submitAdmissionForm.html" method="post">
		<h2>Form 1 Sample</h2>
		<table>
			<tr> <td>Name</td> <td> <input type="text" name="name" /> </td> </tr>
			<tr> <td>Age</td> <td> <input type="text" name="age" /> </td> </tr>
			<tr> <td>NID</td> <td> <input type="text" name="nid" /> </td> </tr>
			
			<tr> <td></td> <td> <input type="submit" value="Submit" /> </td> </tr>
		</table>
	</form>
	
	<form action="/SpringMvcRequestParam/submitAdmissionForm2.html" method="post">
		<h2>Form 2 Sample with Default Value</h2>
		<table>
			<tr> <td>Name</td> <td> <input type="text" name="name" /> </td> </tr>
			<tr> <td>Age</td> <td> <input type="text" name="age" /> </td> </tr>
			<tr> <td>NID</td> <td> <input type="text" name="nid" /> </td> </tr>
			
			<tr> <td></td> <td> <input type="submit" value="Submit" /> </td> </tr>
		</table>
	</form>
	
	<form action="/SpringMvcRequestParam/submitAdmissionForm3.html" method="post">
		<h2>Form 3 Sample with Map Param</h2>
		<table>
			<tr> <td>Name</td> <td> <input type="text" name="name" /> </td> </tr>
			<tr> <td>Age</td> <td> <input type="text" name="age" /> </td> </tr>
			<tr> <td>NID</td> <td> <input type="text" name="nid" /> </td> </tr>
			
			<tr> <td></td> <td> <input type="submit" value="Submit" /> </td> </tr>
		</table>
	</form>
	
</body>
</html>