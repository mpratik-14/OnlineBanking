<%-- 
    Document   : Login_page_data
    Created on : 13 Jan, 2022, 9:04:22 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page contentType="text/html" language="java" import="java.sql.*,java.util.*,javax.swing.*,conn.ConnectionClass"%>
<%--<%@page include="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String em=request.getParameter("email");
            String password=request.getParameter("password");
        %>
        <%
            try
            {
                ConnectionClass obj=new ConnectionClass();
                String q="select pin,name,email,password from signup1 where email='"+em+"' and password='"+password+"'";
                ResultSet rest=obj.stm.executeQuery(q);
                
                
                if(rest.next())
                {
//                    session.setAttribute("user",rest.getString("name"));
//                    session.setAttribute("email",rest.getString("email"));
//                    session.setAttribute("pin",rest.getString("pin"));
                    
                    session.setAttribute("user",rest.getString("name"));
                    session.setAttribute("email",rest.getString("email"));
                    session.setAttribute("pin",rest.getString("pin"));
//                    response.sendRedirect(request.getContextPath()+"homepage.jsp");
                    response.sendRedirect("ok.jsp");
                }
                else
                {
                    response.sendRedirect("error2.jsp");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        %>
        <h1>This is login page</h1>
    </body>
</html>
