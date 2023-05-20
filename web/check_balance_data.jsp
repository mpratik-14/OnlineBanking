<%-- 
    Document   : check_balance_data
    Created on : 13 Jan, 2022, 1:50:49 PM
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
            <nav class="navbar navbar-expand-lg navbar-light " style="background-color:#000071;">
                <div class="px-1">
                    <a class="navbar-brand" href="user_dash.jsp" style="color:white">Hello,<span style="color:#FFD800"><%out.print(session.getAttribute("name"));%></span></a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="account_details.jsp" style="color:white">Account Details</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="check_balance.jsp" style="color:white">Get Balance</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="history.jsp" style="color:white"> View Report</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="logout.jsp" style="color:white">LogOut</a>
                </div>
            </nav>
        </div>

        <div class="">
            <div class="container bg-dark mt-5">
                <h5 class="text-white text-center">Your Current Balance is as Follows</h5>        
            </div>
        </div>

                <div class="row pt-3" style='border:2px solid black; margin:auto;width:90%;margin-top:5%;padding:20px;background-color:#ABFFF5'>
                    <div class="col-lg-4 col-md-4 col-xl-4 col-sm-3 col-2"></div>
                    <div class="col-lg-4 col-md-4 col-xl-4 col-sm-6 col-8">
                        <form action="check_balance_data.jsp" method="POST">
                            <div class="mb-3">
                                <h5 class="">Account Holder name : 
                                    <b>
                                        <span>
                                            <%
                                                out.print(session.getAttribute("name"));
                                            %>
                                        </span>
                                    </b>
                                </h5>
                            </div>
                            <div class="mb-3">
                                <h5 class="">Account Number :
                                    <b>
                                        <span>
                                            <%
                                                int nm3=(Integer)session.getAttribute("pin");
//                                                int nm4=Integer.parseInt(nm3);
                                                try
                                                {
                                                    ConnectionClass obj=new ConnectionClass();
                                                    String q="select account_no from signup3 where pin='"+nm3+"'";
                                                    ResultSet rest=obj.stm.executeQuery(q);
                                                    if(rest.next())
                                                    {
                                                        String account=rest.getString("account_no");
                                                        out.print(account);
                                                    }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                            %>
                                        </span>
                                    </b>
                                </h5>
                            </div>
                            <div class="mb-3">
                                <h5 class="">Current Balance :
                                    <b>
                                        <span class="text-danger">
                                            <%
                                                try
                                                {
                                                    ConnectionClass obj=new ConnectionClass();
                                                    String q="select balance from signup3 where pin='"+nm3+"'";
                                                    ResultSet rest=obj.stm.executeQuery(q);
                                                    if(rest.next())
                                                    {
                                                        long balance=Long.parseLong(rest.getString("balance"));
                                                        out.print(balance);
                                                    }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                            %>
                                        Rs.</span>
                                    </b>
                                </h5>
                            </div>
                            <div class="mb-2">
                                <p class="">If you want to Deposit then <a href="deposit.jsp">Click here</a></p>
                            </div>
                            <div class="mb-2">
                                <p class="">To Withdraw the Amount from your Account <a href="withdraw.jsp">Click here</a></p>
                            </div>
                        </form>
                    </div>
                    <div class="col-lg-4 col-md-4 col-xl-4 col-sm-3 col-2"></div>
                </div>
                                        
                                        
        <footer class="pt-4" style="position:absolute;bottom:0;" >
            <div class="text-center" style="background-color:#000071;color:white;">
                <h6 class="py-2">Copyright @Pratik Mhatre</h6>
            </div>
        </footer>
    </body>
</html>
