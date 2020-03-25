<%--
  Created by IntelliJ IDEA.
  User: anzu
  Date: 25.03.20
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>შინაური ცხოველების სარეგისტრაციო ფორმა</title>
</head>
<body>

<form action="userservlet" method="post">
    <tr>
        <td>სახელი</td>
        <td><input name="name"/></td>
    </tr>
    <tr>
        <td>ჯიში</td>
        <td><input name="variety"/></td>
    </tr>
    <tr>
        <td>სქესი</td>
        <td><input name="gender"/></td>
    </tr>
    <tr>
        <td>ასაკი</td>
        <td><input name="age"/></td>
    </tr>
    </table>
    <input type="submit"/>
</form>


</body>
</html>
