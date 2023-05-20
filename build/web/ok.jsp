<%-- 
    Document   : ok
    Created on : 13 Jan, 2022, 9:13:04 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String uname = (String) session.getValue("username");
            out.print("<body>");
            out.print("<h1>");
            out.print("Hello: " + uname);
            out.print("</h1>");
            out.print("</body>");
        %>
    </body>
</html>
