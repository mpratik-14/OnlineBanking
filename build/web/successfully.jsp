<%-- 
    Document   : successfully
    Created on : 13 Jan, 2022, 1:00:49 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page session="true" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h1{
                margin-top:20%;
                border:1px solid black;
                width:50%;
                height:50%;
                margin-left: 25%;
                text-align: center;
            }
            a{
                background-color:lightgreen;
                padding:15px;
                color:black;
                font-size:20px;
                margin-left: 50%;
            }
        </style>
    </head>
    <body>
         <%
            String email = (String) session.getValue("email");
            String name = (String) session.getValue("name");
            String pass = (String) session.getValue("password");
            int pin = (Integer) session.getValue("pin");
//            out.print("<body>");
//            out.print("<h1>");
//            out.print("Hello: " + email);
//            out.print("Hello: " + pin);
//            out.print("Hello: " + name);
//            out.print("</h1>");
//            out.print("</body>");
        %>
        
        <h1>Your Current Transaction is successfull</h1>
        <a href ="user_dash.jsp">Back</a>
    </body>
</html>
