<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%= "Welcome To Our Website" %>
<% 
   String param=request.getParameter("uname");
   String url=config.getInitParameter("url"); 
   String user_name=config.getInitParameter("user");
   String user_pwd=config.getInitParameter("pwd");
   Connection con=DriverManager.getConnection(url, user_name, user_pwd);
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from Student where sname=param");
%>
<table>
<tr>
    <th>Student ID</th>
    <th>Student Name</th>
    <th>Student Class</th>
</tr>
<tr>
<% while(rs.next())
   { 
     out.println("<td>"+rs.getInt(0)+"</td><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td>");
   }
   %>
   </tr>
   </table>
</body>
</html>










