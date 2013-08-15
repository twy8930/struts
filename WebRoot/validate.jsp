<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>验证数据</title>
	</head>
	<body>
		<s:actionerror />
		<s:actionmessage />
		<s:form action="validate">
                                       输入内容：<s:textfield name="msg" />
			<s:fielderror key="field.error" />
			<br />
			<s:submit />
		</s:form>
	</body>
</html>
