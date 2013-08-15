<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>验证数据</title>
	</head>
	<body>
		<s:form action="new_validate">
			<s:textfield name="msg" label="姓名" />
			<s:textfield name="age" label="年龄" />
			<s:submit />
		</s:form>
	</body>
</html>
