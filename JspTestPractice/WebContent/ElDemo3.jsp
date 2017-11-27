<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>hello   :<c:out value="${param.uname}" default="sai" />
  <c:set var="x" value="10" scope="request"></c:set>
  <c:set var="y" value="20" scope="request"></c:set>
  <c:set var="sum" value="${x+y}" scope="request"></c:set>
  The result is:<c:out value="${sum}"></c:out>
  <c:set target="pack1.BeanDemo" property="name" scope="request" value="appstek" var="a" ></c:set>
  <c:out value="${a}" /></h1>
    <h1>
     UserName:${param.uname}<br>
     <c:catch var="e"> 
     <%
     int age=Integer.parseInt(request.getParameter("uage"));
     %>
     Age:${param.uage}<br>
    </c:catch>
    <c:if test="${e!=null}">
    An exception raised:${e}<br>
    </c:if>
    UserHeight:${param.uheight}</h1>
</body>
</html>