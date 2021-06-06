<%-- 
    Document   : HddenForm
    Created on : 6 Jun, 2021, 1:15:20 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Filter_servlet1" method="post">
            <input type="text" placeholder="Enter Name" name="name"/><br>
            <input type="mail" placeholder="Enter mail id" name="mail"/><br>
            <input type="submit" value="Login"/><br>
        </form>
    </body>
</html>
