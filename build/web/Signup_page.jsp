<%-- 
    Document   : Signup_page
    Created on : 13 Jan, 2022, 8:54:03 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page contentType="text/html" language="java" import="java.sql.*,java.util.*,javax.swing.*,conn.ConnectionClass"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <!--Css Link-->
        <link rel="stylesheet" href="CSS/login.css">
        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@700&display=swap" rel="stylesheet">

        <!-- font awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />

    </head>
    <body>
        <div class="container-fluid bg-info image-parent-div">
            <div class="text-center">
                <!--<img src="images/pngegg.png" class="img-fluid image-div" alt="...">-->
            </div>
        </div>
        <div class="">
            <nav class="navbar navbar-expand-lg navbar-light " style="background-color:#000071;">
                <div class="px-2">
                    <a class="navbar-brand" href="index.jsp" style="color:white">Login</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="#"style="color:white">Signup</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="aboutpage.jsp"style="color:white">About</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="contact.jsp"style="color:white">Contact</a>
                </div>
            </nav>
        </div>
        <div class="container">
            <div class="text-center py-4">
                <h3 class="text-primary">Signup/Register</h3>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-3 col-xl-3"></div>
                <div class="col-lg-6 col-md-6 col-xl-6">
                    <!--<form class="row g-3" method="GET" action="Signup_page_data.jsp">-->
                    <form class="row g-3" method="POST" action="Register">
                        <%
                            Random ran = new Random();
                            int first3 = (ran.nextInt() % 9000) + 1000;
                            int first4 = Math.abs(first3);

                            long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
                            long first8 = Math.abs(first7);
                        %>

                        <!--<div class="col-md-4">-->
                        <label for="validationDefault03" class="form-label">Unique Pin</label>
                        <input type="text" name="pin" class="form-control" value="<%out.println(first4);%>" required readonly>
                        <!--</div>-->

                        <!--<div class="col-md-4">-->
                        <label for="validationDefault02" class="form-label">Name</label>
                        <input type="text" name="fname"class="form-control" placeholder="Pratik" required>
                        <!--</div>-->

                        <!--<div class="col-md-4">-->
                        <label for="validationDefault02" class="form-label">Surname</label>
                        <input type="text" name="fathername" class="form-control" placeholder="XYZ" required>
                        <!--</div>-->

                        <!--<div class="col-md-6">-->
                        <label for="validationDefault03" class="form-label">City</label>
                        <input type="text" name="city" class="form-control" placeholder="Bombay" required>
                        <!--</div>-->

                        <!--<div class="col-md-3">-->
                        <label for="validationDefault03" class="form-label">State</label>
                        <input type="text" name="state" class="form-control" placeholder="Maharashtra" required>
                        <!--</div>-->

                        <!--<div class="col-md-3">-->
                        <label for="validationDefault05" class="form-label">Zip</label>
                        <input type="text" name="zip" class="form-control" placeholder="400031" required>
                        <!--</div>-->

                        <!--<div class="col-md-6">-->
                        <label for="validationDefault03" class="form-label">Email</label>
                        <input type="email" name="email" class="form-control" aria-describedby="emailHelp" required>
                        <!--</div>-->

                        <!--<div class="col-md-3">-->
                        <label for="validationDefault03" class="form-label">Password</label>
                        <input type="password" name="password" class="form-control" required>
                        <!--</div>-->

                        <!--<div class="col-md-3">-->
                        <label for="validationDefault05" class="form-label">Date</label>
                        <input type="date" name="date" class="form-control" required>
                        
                        <label for="validationDefault05" class="form-label">Phone Number</label>
                        <input type="text" name="number" class="form-control" required>
                        
                        
                        <label for="validationDefault05" class="form-label">Gender:</label>
                         <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" value="Male" >
                            <label class="form-check-label" for="flexRadioDefault1">
                                Male
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" value="Female" >
                            <label class="form-check-label" for="flexRadioDefault2">
                                Female
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" value="Other" >
                            <label class="form-check-label" for="flexRadioDefault2">
                                Other
                            </label>
                        </div>
                        <hr>
                        <!--</div>-->

                        <!--<div class="col-12 text-center">-->
                        <!--                        <h5 class="text-primary">Customer Personal Details</h5>
                                                </div>
                        
                                                Customer Personal Details
                        
                                                <div class="col-md-4">
                                                <label for="validationDefault02" class="form-label">Religion</label>
                                                <input type="text" name="religion"class="form-control" placeholder="Hindu" required>
                                                </div>
                                                <div class="col-md-4">
                                                <label for="validationDefault02" class="form-label">Catogery</label>
                                                <input type="text" name="catogery" class="form-control" placeholder="General/OBC" required>
                                                </div>
                                                <div class="col-md-4">
                                                <label for="validationDefault03" class="form-label">Education</label>
                                                <input type="text" name="education" class="form-control" placeholder="Post,Under Gre." required>-->
                        <!--</div>-->
                        <!--Customer Personal Details-->
                        <!--<div class="col-12 text-center">-->
                        <h5 class="text-primary">Customer Account Details</h5>
                        <!--</div>-->
                        <!--<div class="col-md-4">-->
                        <label for="validationDefault02" class="form-label">Account No</label>
                        <input type="text" name="account" class="form-control" value="<%out.println(first8);%>" readonly placeholder="otto" required>
                        <!--</div>-->
                        <!--<div class="col-md-4">-->




                        <label for="validationDefault02" class="form-label">Account Type</label>
                        <!--                                                <input type="radio" name="account_type" class="form-control" placeholder="saving/current" placeholder="Saving" required>
                                                                        <input type="radio" name="account_type"  value="saving" required>Saving
                                                                        <input type="radio" name="account_type"  value="current" required>Current-->

                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="account_type" value="Saving" >
                            <label class="form-check-label" for="flexRadioDefault1">
                                Saving
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="account_type" value="Current" >
                            <label class="form-check-label" for="flexRadioDefault2">
                                Current
                            </label>
                        </div>


                        <!--</div>-->
                        <!--<div class="col-md-4">-->
                        <label for="validationDefault03" class="form-label">Open Balance</label>
                        <input type="number" name="balance" class="form-control" placeholder="Min 500" required>
                        <!--</div>-->
                        <div class="col-12 text-center">
                            <button class="btn btn-primary" type="submit">Register</button>
                        </div>
                    </form>
                </div>
                <div class="col-lg-3 col-md-3 col-xl-3"></div>
            </div>
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
