<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="mine"  uri="/WEB-INF/mytld5.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <mine:mytag>
     This is from first inner tag
             <mine:mytag>
             This is from second inner tag
                     <mine:mytag>
                      This is from third inner tag
                     </mine:mytag>
             </mine:mytag>
    </mine:mytag> 
 
    <mine:mytag>
        <h2>This is inside tag body</h2>
    </mine:mytag>
    <h2>This is after body</h2>
</body>
</html>