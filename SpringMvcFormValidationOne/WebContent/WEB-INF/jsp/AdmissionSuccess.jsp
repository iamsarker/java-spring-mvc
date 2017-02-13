<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${cmsg}</h1>
	<h2>${msgHeader}</h2>
	<h5>Details Submitted by you using model attribute:</h5>
	
	name: ${student.name} <br />
	age: ${student.age} <br />
	NID: ${student.nid} <br />
	DOB: ${student.studentDoB} <br />
	Skill: ${student.skillList} <br />
	
	<br /> <br />
	Student Address <br />
	${student.studentAddress.country} ${student.studentAddress.city} ${student.studentAddress.street} ${student.studentAddress.zincode}
</body>
</html>