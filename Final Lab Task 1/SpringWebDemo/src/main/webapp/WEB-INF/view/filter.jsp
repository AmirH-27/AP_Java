<%@ page import="jsp.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jubayer
  Date: 19/7/22
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Filtered Record</title>
</head>
<body>
<h1>Filtered Record</h1>
<%
    for (Student student : (ArrayList<Student>) request.getAttribute("students")) {
        out.println("<p>");
        out.println("<b>Name:</b> " + student.getName());
        out.println("<b>Student ID:</b> " + student.getStudentId());
        out.println("<b>Department:</b> " + student.getDepartment());
        out.println("<b>CGPA:</b> " + student.getCgpa());
        out.println("</p>");
    }
%>
<form action="dashboard" method="post">
    <input type="submit" value="Back">
</form>
</body>
</html>
