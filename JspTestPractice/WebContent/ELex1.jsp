<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("name1", "SessionScopeAttribute"); %>
<% request.setAttribute("name2", "RequestScopeAttribute"); %>
<% application.setAttribute("name3", "ApplicationScopeAttribute"); %>
<% Cookie c=new Cookie("name4","CookieAdded by sairam");
   response.addCookie(c);
%>
<jsp:forward page="/ELex2.jsp" />

</body>
</html>