<%-- 
    Document   : regis
    Created on : 14 Jan, 2022, 11:22:41 PM
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
                    <a class="navbar-brand" href="#" style="color:white">Registered Accounts</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="hist.jsp" style="color:white">Transaction & History</a>
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
                <h5 class="text-white text-center">All registered Accounts</h5>        
            </div>
        </div>  
                
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/banking"
                           user="root" password="" />
        <c:set var = "rn" value = "${param.rn}"/>

        <sql:query dataSource="${db}" var="rs" >
            SELECT * from signup1;
        </sql:query>
        
        <sql:query dataSource="${db}" var="ts" >
            SELECT * from signup3 ;
        </sql:query>
        <div class="container">
            <h5> Personal Details</h5>
            <table class="table">
                <tr class="table-dark">
                    <th>ID</th>
                    <th>Pin</th>
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
                        <td><c:out value="${table.id}" /></td>
                        <td><c:out value="${table.pin}" /></td>
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
                <c:forEach var="tab" items="${ts.rows}" >
                    <tr>
                        <td><c:out value="${tab.id}" /></td>
                        <td><c:out value="${tab.pin}" /></td>
                        <td><c:out value="${tab.account_no}" /></td>
                        <td><c:out value="${tab.account_type}" /></td>
                        <td><c:out value="${tab.balance}" /></td>
                    </tr>


                </c:forEach>
            </table>
        </div>

        <!--        <div class="row pt-3">
                    <div class="col-lg-4 col-md-4 col-xl-4 col-sm-3 col-2"></div>
                    <div class="col-lg-4 col-md-4 col-xl-4 col-sm-6 col-8">
                        <form action="deposit_data.jsp" method="POST">
                            <div class="mb-3">
                                <h5 class="text-center">Account Holder name</h5>
                                <input type="text" name="account_holder" class="form-control" readonly value="<%out.print(session.getAttribute("name"));%>">
                            </div>
                            <div class="mb-3">
                                <h5 class="text-center">Account Number</h5>
                                <input type="text" name="account_number" class="form-control" readonly value="<%
                                    //                            int nm3 = (Integer) session.getAttribute("pin");
                                    ////                            int nm4 = Integer.parseInt(nm3);
                                    //                            try {
                                    //                                ConnectionClass obj = new ConnectionClass();
                                    ////                                String q = "select account_no from signup3 where pin='" + nm4 + "'";
                                    //                                String q = "select account_no from signup3 where pin='" + nm3 + "'";
                                    //                                ResultSet rest = obj.stm.executeQuery(q);
                                    //                                if (rest.next()) {
                                    //                                    String account = rest.getString("account_no");
                                    //                                    out.print(account);
                                    //                                }
                                    //                            } catch (Exception e) {
                                    //                            }
        %>">
                                    </div>
                                    <div class="mb-3">
                                        <h5 class="text-center">Deposit Amount</h5>
                                        <input type="text" name="money" class="form-control" placeholder="1000 Rs.">
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" name="button" class="btn btn-primary">Submit</button>
                                    </div>
                                </form>
                            </div>
                            <div class="col-lg-4 col-md-4 col-xl-4 col-sm-3 col-2"></div>
                        </div>-->


        <footer class="pt-4">
                    <div class="text-center" style="background-color:#000071;color:white">
                        <h6 class="py-2">Copyright @Pratik Mhatre</h6>
                    </div>
                </footer>
    </body>
</html>
