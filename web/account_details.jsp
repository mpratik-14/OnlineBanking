<%-- 
    Document   : account_details
    Created on : 13 Jan, 2022, 9:51:15 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page contentType="text/html" language="java" import="java.sql.*,java.util.*,javax.swing.*,conn.ConnectionClass"%>
<%@page session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
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
        <div class="">
            <nav class="navbar navbar-expand-lg navbar-light " style="background-color:#000071;">
                <div class="px-1">
                    <a class="navbar-brand" href="index.jsp" style="color:white">Hello,&nbsp<span style="color:#FFD800"><%out.print(session.getAttribute("name"));%></span></a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="account_details.jsp" style="color:white">Account Details</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="deposit.jsp" style="color:white">Deposit</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="withdrow.jsp" style="color:white">Withdraw</a>
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
                    <a class="navbar-brand" href="logout.jsp">LogOut</a>
                </div>
            </nav>
        </div>
        <div class="">
            <div class="container my-5" >
                <h5 class=" text-center pb-1" style="color:#000071;"> Your Account Details</h5>        
            </div>
        </div>
        <!--        <div class="row ">
                    <div class="col-lg-3 col-md-3 col-xl-3 col-sm-3 col-2"></div>
                    <div class="col-lg-6 col-md-6 col-xl-6 col-sm-6 col-8">-->

        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/banking"
                           user="root" password="" />
        <c:set var = "rn" value = "${param.rn}"/>

        <sql:query dataSource="${db}" var="rs" >
            SELECT * from signup1 where pin =<%=pin%> ;
        </sql:query>
        <div style="border:2px solid black;width:90%;margin:auto;padding:20px;background-color:#ABFFF5">
            <div class="container">
                <h5> Personal Details</h5>
                <table class="table">
                    <tr class="table-dark">
                        <!--<th>Pin</th>-->
                        <th>Name</th>
                        <th>FName</th>
                        <th>City</th>
                        <th>State</th>
                        <th>ZIP</th>
                        <th>Password</th>
                        <th>Birth</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Gender</th>
                    </tr>
                    <c:forEach var="table" items="${rs.rows}" >
                        <tr>
                            <td><c:out value="${table.name}" /></td>
                            <td><c:out value="${table.fname}" /></td>
                            <td><c:out value="${table.city}" /></td>
                            <td><c:out value="${table.state}" /></td>
                            <td><c:out value="${table.zip}" /></td>
                            <td><c:out value="${table.passsword}" /></td>
                            <td><c:out value="${table.birth}" /></td>
                            <td><c:out value="${table.email}" /></td>
                            <td><c:out value="${table.Phone}" /></td>
                            <td><c:out value="${table.Gender}" /></td>
                        </tr>


                    </c:forEach>
                </table>
            </div>
            <hr><br><br>





            <sql:query dataSource="${db}" var="rs" >
                SELECT * from signup3 where pin =<%=pin%> ;
            </sql:query>
            <div class="container">
                <h5> Bank Details</h5>
                <table class="table">
                    <tr class="table-dark">
                        <!--<th>Pin</th>-->
                        <th>Pin</th>
                        <th>Account Number</th>
                        <th>Account Type</th>
                        <th>Account Balance</th>

                    </tr>
                    <c:forEach var="table" items="${rs.rows}" >
                        <tr>
                            <td><c:out value="${table.pin}" /></td>
                            <td><c:out value="${table.account_no}" /></td>
                            <td><c:out value="${table.account_type}" /></td>
                            <td><c:out value="${table.balance}" /></td>
                        </tr>


                    </c:forEach>
                </table>
            </div>
        </div>

        <!--            <div class="col-lg-3 col-md-3 col-xl-3 col-sm-3 col-2"></div>
                </div>-->


        <footer class="pt-4" style="position:absolute;bottom:0;" >
            <div class="text-center" style="background-color:#000071;color:white;">
                <h6 class="py-2">Copyright @Pratik Mhatre</h6>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    </body>
</html>
