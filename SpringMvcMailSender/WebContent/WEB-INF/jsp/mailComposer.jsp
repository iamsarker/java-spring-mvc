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
	
	<form:errors path="student.*" />
	<form action="/SpringMvcMailSender/MailSender/sendMail.html" method="post" enctype="multipart/form-data">
		<h2>Form Admission Sample</h2>
		<table>
			<tr> <td>Attachment File</td> <td> <input type="file" name="imgFile" /> </td> </tr>
			
			<tr> <td></td> <td> <input type="submit" value="Send" /> </td> </tr>
		</table>
	</form>
</body>
</html>