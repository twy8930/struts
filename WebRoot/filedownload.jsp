<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title>下载单个文件</title>
    </head>

    <body>
       ${uploadFileName}上传成功
       <br/>
       <s:a action="download?fileName=%{uploadFileName}">下载文件</s:a>
    </body>
</html>