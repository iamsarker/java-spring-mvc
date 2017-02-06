<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<spring:url value="/resources/bootstrap.css" var="bootstrapCSS" />
		<spring:url value="/resources/bootstrap.js" var="bootstrapJS" />
		<spring:url value="/resources/custom.css" var="customCSS" />
		<spring:url value="/resources/custom.js" var="customJS" />
		<spring:url value="/resources/jquery.js" var="jqueryJS" />
		
		
		<script src="${jqueryJS}"></script>
		<link href="${bootstrapCSS}" rel="stylesheet" />
		<script src="${bootstrapJS}"></script>
		
		<link href="${customCSS}" rel="stylesheet" />
		<script src="${customJS}"></script>
		
	</head>
	<body>
		<input class="btn btn-primary" type="submit" value="Primary" />
		<input class="btn btn-warning" type="submit" value="Warning" />
		<input class="btn btn-info" type="submit" value="Info" />
		<input class="btn btn-danger" type="submit" value="Danger" />
	</body>
</html>