<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="jquery-3.1.1.js"></script>
<script src="script/fetch.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<jsp:useBean id="dad" class="mypack.DataAcessDemo"></jsp:useBean>
<jsp:setProperty property="limit" name="dad" value="${param.limit}"/>
<jsp:setProperty property="offse" name="dad" value="${param.offse}"/>
<%-- <jsp:getProperty property="al" name="dad"/><br> --%>
<c:set var="result" value="${dad.al}" scope="request" ></c:set>
<%-- <c:out value="${result}" /> --%>
<jsp:useBean id="emp" class="mypack.Employee"></jsp:useBean>
<table align="center" border="1" cellspacing="10" >
<tr>
<th>ENAME</th>
<th>EADDR</th>
<th>ETYPE</th>
<th>EDOMAIN</th>
</tr>
<c:forEach items="${result}" var="emp" >
<tr>
<td>${emp.ename}</td>
<td>${emp.eaddr}</td>
<td>${emp.etype}</td>
<td>${emp.edomain}</td>
</tr>
</c:forEach> 
</table><br>
</body>
</html>