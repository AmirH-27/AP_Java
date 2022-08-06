
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir Habib
  Date: 02-08-2022
  Time: 00:31
  To change this template use File | Settings | File Templates.
--%>
<html>
    <head>
        <title>Dashboard</title>
    </head>
    <body>
        <h1>Dashboard</h1>
        <table>
            <tr>
                <th>User ID</th>
                <th>User Name</th>
                <th>Student ID</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td><c:out value="${user.user_id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.id}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
