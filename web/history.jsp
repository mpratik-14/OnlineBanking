<%-- 
    Document   : history
    Created on : 13 Jan, 2022, 2:11:51 PM
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

        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@600&display=swap" rel="stylesheet">
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

        <div class="">
            <nav class="navbar navbar-expand-lg navbar-light" style="background-color:#000071;">
                <div class="px-1">
                    <a class="navbar-brand" href="user_dash.jsp" style="color:white">Hello,<span style="color:#FFD800"><%out.print(session.getAttribute("name"));%></span></a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="account_details.jsp" style="color:white">Account Details</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="deposit.jsp" style="color:white">Deposit</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="withdraw.jsp" style="color:white">Withdraw</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="check_balance.jsp" style="color:white">Get Balance</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="transfer_amount.jsp" style="color:white">Transfer Amount</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="history.jsp" style="color:white">View Report</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="logout.jsp" style="color:white">LogOut</a>
                </div>
            </nav>
        </div>

        <div class="">
            <div class="container bg-dark my-5">
                <h5 class="text-white text-center pb-1">your Account History Details</h5>        
            </div>
        </div>

        <div class="row " style='border:2px solid black; margin:auto;width:90%;margin-top:5%;padding:20px;background-color:#C2FFF8'>
            <div class="col-lg-2 col-md-1 col-xl-2 col-sm-0 col-0"></div>
            <div class="col-lg-8 col-md-10 col-xl-8 col-sm-12 col-12">
                <table class="table table-dark table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Account no</th>
                            <th scope="col">Operation</th>
                            <th scope="col">Amount</th>
                            <th scope="col">Balance</th>
                            <th scope="col">Date-Time</th>
                        </tr>
                    </thead>
                    <tbody>

                        <%
                            int count = 0;
                            try {
                                ConnectionClass obj = new ConnectionClass();
                                String q = "select count(pin) from history where pin='" + pin + "'";
                                ResultSet rest = obj.stm.executeQuery(q);
                                rest.next();
                                count = rest.getInt(1);
                                String q1 = "select * from history where pin='" + pin + "'order by id desc";
                                ResultSet rest1 = obj.stm.executeQuery(q1);
                                for (int i = 0; i < count; i++) {
                                    while (rest1.next()) {
                        %><tr class="table">
                            <td><%out.print(rest1.getString("account_no"));%></td>
                            <td><%out.print(rest1.getString("operation"));%></td>
                            <td><%out.print(rest1.getString("amount_money"));%></td>
                            <td><%out.print(rest1.getString("final_balance"));%></td>
                            <td><%out.print(rest1.getString("date"));%></td>
                        </tr>
                        <%
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-2 col-md-1 col-xl-2 col-sm-0 col-0"></div>
        </div>

        <footer class="pt-4">
            <div class="text-center" style="background-color:#000071;color:white">
                <h6 class="py-2">Copyright @Pratik Mhatre</h6>
            </div>
        </footer>
    </body>
</html>
