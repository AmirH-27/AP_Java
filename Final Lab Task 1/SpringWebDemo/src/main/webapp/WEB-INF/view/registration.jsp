<%--
  Created by IntelliJ IDEA.
  User: jubayer
  Date: 19/7/22
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="register" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Student ID:</td>
            <td><input type="text" name="id"/></td>
        </tr>
        <tr>
            <td>Department</td>
            <td><input type="text" name="department"/></td>
        </tr>
        <tr>
            <td>CGPA</td>
            <td><input type="number" step="any" name="cgpa"/></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Register"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
