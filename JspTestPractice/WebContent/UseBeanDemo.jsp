<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <jsp:directive.page import="com.beans.test.BeanDemo" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="c" class="com.beans.test.BeanDemo1" scope="session">
    <jsp:setProperty name="c" property="*" ></jsp:setProperty>
   </jsp:useBean>
   
Name:<h1><jsp:getProperty name="c" property="name"/><br>
Age:<h1><jsp:getProperty name="c" property="age"/><br>
Mail:<h1><jsp:getProperty name="c" property="email"/><br>
</h1>
</body>
</html>