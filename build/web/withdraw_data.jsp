<%-- 
    Document   : withdraw_data
    Created on : 13 Jan, 2022, 1:20:55 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page contentType="text/html" language="java" import="java.sql.*,java.util.*,javax.swing.*,conn.ConnectionClass"%>
<!DOCTYPE html>
<%@page session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <!--Css Link-->
        <link rel="stylesheet" href="CSS/login.css">

        <!--<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@600&display=swap" rel="stylesheet">-->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Anton&display=swap" rel="stylesheet">
        <!-- font cdn-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />
    </head>
    <body>
        <%
            String email = (String) session.getValue("email");
            String name = (String) session.getValue("name");
            String pass = (String) session.getValue("password");
            int pin = (Integer) session.getValue("pin");
            out.print("<body>");
            out.print("<h1>");
//            out.print("Hello: " + email);
//            out.print("Hello: " + pin);
//            out.print("Hello: " + name);
            out.print("</h1>");
            out.print("</body>");
        %>
        <%
            String holder_name = request.getParameter("account_holder");
            int otp = Integer.parseInt(request.getParameter("otp"));
            long account_number = Long.parseLong(request.getParameter("account_number"));
            long amount_money = Long.parseLong(request.getParameter("money"));
            String message = request.getParameter("message");
            if(otp==pin){
                if (amount_money <= 0) {
                response.sendRedirect("error.jsp");
            } else {
                String date = new java.util.Date().toString();
                int nm3 = (Integer) session.getAttribute("pin");
//                int nm4 = Integer.parseInt(nm3);
                String operation = "Withdraw";
                try {
                    ConnectionClass obj = new ConnectionClass();

                    String q3 = "select balance from signup3 where pin='" + nm3 + "'";
                    ResultSet rest = obj.stm.executeQuery(q3);
                    if (rest.next()) {
                        long balance = Long.parseLong(rest.getString("balance"));
                        long final_balance = balance - amount_money;
//                        out.println("balance" + balance);
//                        out.println("final balance" + final_balance);
//                        out.println("amount_money");

                        String q = "update signup3 SET balance='" + final_balance + "' where pin='" + nm3 + "'";
                        String q1 = "insert into history(pin,account_no,operation,amount_money,final_balance,date)values('" + nm3 + "','" + account_number + "','" + operation + "','" + amount_money + "','" + final_balance + "','" + date + "')";
                        obj.stm.executeUpdate(q);
                        obj.stm.executeUpdate(q1);
                        response.sendRedirect("success.jsp");
                    } else {
                        response.sendRedirect("error3.jsp");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            }
            else{
                out.println("<h1>Wrong Pin Entered</h1>");
                out.println("<a href ='withdraw.jsp'>Your Pin was wrong. Please Try again</a>");
            }
            

        %>

       
    </body>
</html>
