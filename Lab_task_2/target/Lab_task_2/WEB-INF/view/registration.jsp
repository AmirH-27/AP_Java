<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir Habib
  Date: 02-08-2022
  Time: 00:18
  To change this template use File | Settings | File Templates.
--%>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration</h1>
        <form:form action="register" method="post" modelAttribute="user">
            Student ID: <form:input path="id"/>
            <form:errors path="id"/><br/><br/>
            Student Name: <form:input path="name"/>
            <form:errors path="name"/><br/><br/>
            Password: <form:input path="password" type="password"/>
            <form:errors path="password"/><br/><br/>
            <input type="submit" value="Registration"/>
        </form:form>
    </body>
</html>
