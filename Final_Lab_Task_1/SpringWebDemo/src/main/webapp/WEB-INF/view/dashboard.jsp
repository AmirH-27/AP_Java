<%@ page import="jsp.Student" %>
<%@ page import="static jsp.Record.students" %><%--
  Created by IntelliJ IDEA.
  User: jubayer
  Date: 19/7/22
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<h1>Dashboard</h1>
<%
    for(Student student: students){
        out.println("<p>");
        out.println("<b>Name:</b> " + student.getName());
        out.println("<b>Student ID:</b> " + student.getStudentId());
        out.println("<b>Department:</b> " + student.getDepartment());
        out.println("<b>CGPA:</b> " + student.getCgpa());
        out.println("</p>");
    }
%>
<form action="registration">
    <input type="submit" value="Add Student">
</form>
<h>Filter by CGPA</h>
<form action="filter">
    <select name="select">
        <option value="0">lower than 3.0</option>
        <option value="3">higher than 3.0</option>
    </select>
    <input type="submit" value="Filter">
</form>
</body>
</html>
