<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title>上传单个文件</title>
    </head>
    <body>
        <s:form action="upload" enctype="multipart/form-data">
            <s:file name="upload" label="输入要上传的文件名" />
            <s:submit value="上传"/>
        </s:form>

    </body>
</html>
