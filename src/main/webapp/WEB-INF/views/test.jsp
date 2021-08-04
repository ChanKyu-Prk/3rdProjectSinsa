<%@page import="org.springframework.context.annotation.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <% Import %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
// UserVO user = session.getAttribute("user");
System.out.println();
%>
</head>
<body>

<div>
	${user.CUS_ID }
	<c:forEach var="q" items="${User}">
	<p>
	${user }<br>
	</p>
	</c:forEach>
	

</div>

</body>
</html>