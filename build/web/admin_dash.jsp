<%-- 
    Document   : admin_dash
    Created on : 14 Jan, 2022, 3:45:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <a class="navbar-brand" href="#" style="color:white">Hello,&nbsp<span style="color:#FFD800"><%out.print(name);%></span></a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="regis.jsp" style="color:white">Registered Accounts</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="hist.jsp" style="color:white">Transactions & History</a>
                </div>
                
<!--                <div class="">
                    <a class="navbar-brand" href="up_pin.jsp" style="color:white">Update Customer details</a>
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
-->                <div class="">
                    <a class="navbar-brand" href="adminlogin.jsp" style="color:white">Logout</a>
                </div>
            </nav>
        </div>
                
                <div style="margin-top:0%;margin-left:0%;">
<!--                    <b>Architecture</b>-->
                    <a href ="Arch.jsp">Click here to view Architecture</a>
                </div>
                <div>
                    <img src ='images/icici.jpg' style='width:100%;'>
                </div>
        <footer class="pt-4" style="position:absolute;bottom:0;" >
            <div class="text-center" style="background-color:#000071;color:white;">
                <h6 class="py-2">Copyright @Pratik Mhatre</h6>
            </div>
        </footer>


        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    </body>
</html>
