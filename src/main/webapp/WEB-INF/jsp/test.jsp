<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	HelloWorld<br>
	<c:forEach items="${test }" var="tests">
		id是#${tests.id }<br>
		名字是：${tests.name }<br>
		年龄是：${tests.age }<br>
		性别是：${tests.sex }<br>
	</c:forEach>
</body>
</html>