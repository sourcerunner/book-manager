<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Deleted</title>
</head>
<body>
	<h3>This book record has been removed.</h3>
	<p>The information of the deleted book: <s:property value="isbn" /> </p>
	
	<p><a href="<s:url action='index' />" >Return to home page</a>.</p>
	<hr />
	<s:text name="contact" />
</body>
</html>