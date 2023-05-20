<%-- 
    Document   : hist
    Created on : 14 Jan, 2022, 11:38:03 PM
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
            String uname = (String) session.getValue("username");
            String name = (String) session.getValue("Name");
            String pass = (String) session.getValue("password");
            out.print("<body>");
            out.print("<h1>");
//            out.print("Hello: " + uname);
//            out.print("Hello: " + name);
//            out.print("Hello: " + pass);
            out.print("</h1>");
            out.print("</body>");
        %>

        <div class="">
            <nav class="navbar navbar-expand-lg navbar-light" style="background-color:#000071;">
                <div class="px-1">
                    <a class="navbar-brand" href="admin_dash.jsp" style="color:white;">Hello,<span style="color:#FFD800" ><%out.print(name);%></span></a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="regis.jsp" style="color:white">Registered Accounts</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="#" style="color:white">Transaction & History</a>
                </div>
<!--                <div class="">
                    <a class="navbar-brand" href="up_pin.jsp" style="color:white">Update Customer details</a>
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
                -->                                <div class="">
                    <a class="navbar-brand" href="adminlogin.jsp" style="color:white">LogOut</a>
                </div>
            </nav>
        </div>


        <div class="">
            <div class="container bg-dark mt-5">
                <h5 class="text-white text-center">Transactions and history</h5>        
            </div>
        </div> 


        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/banking"
                           user="root" password="" />
        <c:set var = "rn" value = "${param.rn}"/>

        <sql:query dataSource="${db}" var="rs" >
            SELECT * from tran order by date ;
        </sql:query>
        <sql:query dataSource="${db}" var="ss" >
            SELECT * from history order by id desc ;
        </sql:query>
        
        <div class="container">
            <h5> Transactions Table</h5>
            <table class="table">
                <tr class="table-dark">
                    <!--<th>Pin</th>-->
                    <th>ID</th>
                    <th>Pin</th>
                    <th>Sender Name</th>
                    <th>Sender Account Number</th>
                    <th>Receiver Name</th>
                    <th>Receiver Account Number</th>
                    <th>Amount</th>
                    <th>Operation</th>
                    <th>Date</th>
                    
                </tr>
                <c:forEach var="table" items="${rs.rows}" >
                    <tr>
                        <td><c:out value="${table.id}" /></td>
                        <td><c:out value="${table.pin}" /></td>
                        <td><c:out value="${table.s_name}" /></td>
                        <td><c:out value="${table.s_acc}" /></td>
                        <td><c:out value="${table.r_name}" /></td>
                        <td><c:out value="${table.r_acc}" /></td>
                        <td><c:out value="${table.amount}" /></td>
                        <td><c:out value="${table.operation}" /></td>
                        <td><c:out value="${table.date}" /></td>
                    </tr>


                </c:forEach>
            </table>
        </div>



        <div class="container">
            <h5>History Table</h5>
            <table class="table">
                <tr class="table-dark">
                    <!--<th>Pin</th>-->
                    <th>Id</th>
                    <th>Pin</th>
                    <th>Account Number</th>
                    <th>Operation</th>
                    <th>Money/Amount</th>
                    <th>Final Balance</th>
                    <th>Date & Time</th>

                </tr>
                <c:forEach var="tabl" items="${ss.rows}" >
                    <tr>
                        <td><c:out value="${tabl.id}" /></td>
                        <td><c:out value="${tabl.pin}" /></td>
                        <td><c:out value="${tabl.account_no}" /></td>
                        <td><c:out value="${tabl.operation}" /></td>
                        <td><c:out value="${tabl.amount_money}" /></td>
                        <td><c:out value="${tabl.final_balance}" /></td>
                        <td><c:out value="${tabl.date}" /></td>
                    </tr>


                </c:forEach>
            </table>
        </div>



        


        <footer class="pt-4">
            <div class="text-center" style="background-color:#000071;color:white">
                <h6 class="py-2">Copyright @Pratik Mhatre</h6>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    </body>
</html>
