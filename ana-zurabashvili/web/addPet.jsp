<%--
  Created by IntelliJ IDEA.
  User: anzu
  Date: 26.03.20
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    input{
        background: #f2f2f2;
        width: 100%;
        border: 0;
        margin: 0 0 15px;
        padding: 15px;
        box-sizing: border-box;
        font-size: 14px;

    }
</style>
    <head>
        <title>შინაური ცხოველების სარეგისტრაციო ფორმა</title>
    </head>
    <body>
        <div class="container">
            <form action="petservlet" method="post">
                <div style=" position: relative;  background: #FFFFFF;  max-width: 360px;
                margin: 10px auto 100px;  padding: 45px;  text-align: center;  box-shadow: 0 0 20px 0;">
                    <h4 style="text-align:center">შინაური ცხოველების სარეგისტრაციო ფორმა</h4>
                        <div style="width: 100%">

                            <input type="text" name="name" placeholder="სახელი" >
                            <input type="text" name="variety" placeholder="ჯიში">
                            <input type="text" name="gender" placeholder="სქესი" >
                            <input type="text" name="age" placeholder="ასაკი" >
                        <input type="submit" value="რეგისტრაცია" style="background: #43A047;width: 100%;
                            border:0;padding: 15px;color: #FFFFFF;"/>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
