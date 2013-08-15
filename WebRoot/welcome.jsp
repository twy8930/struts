<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:fielderror/>

<%request.setAttribute("name","request的账号");%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
${name},欢迎回来
<br>
<!--   
请求参数中的帐号：<s:property value="#parameters.name"/>  
<br>  
请求属性中的帐号：<s:property value="#request.name"/>  
<br>  
会话属性中的帐号：<s:property value="#session.name"/>  
<br>  
应用属性中的帐号：<s:property value="#application.name"/>  
<br>  
attr中的帐号：<s:property value="#attr.name"/> 
--> 
</body>
</html>