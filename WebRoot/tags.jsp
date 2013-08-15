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
		<s:if test="age > 60">
			老年人
		</s:if>
		<s:elseif test="age > 35">
			中年人
		</s:elseif>
		<s:elseif test="age > 15">
			青年人
		</s:elseif>
		<s:else>
			少年
		</s:else>
	
		<br>
	
		<s:iterator value="names" id="name" status="st">
			<s:if test="#st.Odd"> 
			          现在的索引是奇数为:<s:property value='#st.index'/> 
			          当前元素值：<s:property value="name"/> 
			</s:if> 
			<s:if test="#st.Even"> 
			          现在的索引是偶数为:<s:property value='#st.index'/> 
			          当前元素值：<s:property value="name"/> 
			</s:if> 
			<br/> 
		</s:iterator>
		
	</body>
</html>