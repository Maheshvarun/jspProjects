<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details Are.....</h1>
<jsp:useBean id="emp1" class="com.beans.test.Employee" scope="session"></jsp:useBean>
<h2>Employee Id        :<jsp:getProperty property="empid"  name="emp1"/></h2>  
<h2>Employee Name      :<jsp:getProperty property="ename"  name="emp1"/></h2>
<h2>Employee Salary    :<jsp:getProperty property="salary" name="emp1" /></h2>  
<h2>Employee Address   :<jsp:getProperty property="addr"   name="emp1" /></h2>
</body>
</html>