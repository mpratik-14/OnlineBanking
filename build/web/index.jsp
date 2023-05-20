<%-- 
    Document   : index
    Created on : 13 Jan, 2022, 8:52:46 AM
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
        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@700&display=swap" rel="stylesheet">

        <!-- font awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />
        <style>
/*            *{
                background: url("images/icici.jpg");
            }*/
        </style>
    </head>
    <body style='background-image:url(images/icici.png);background-size:50%;  background-repeat: no-repeat; background-attachment: fixed;background-color: #FFB851 '>
        <!--        <div class="container-fluid bg-primary image-parent-div" >
                    <div class="text-center">
                        <img src="images/pngegg.png" class="img-fluid image-div" alt="...">
                    </div>
                </div>-->
        <div class="">
            <!--<nav class="navbar navbar-expand-lg navbar-light bg-primary" style="background-color:#000071;color:white">-->
            <nav class="navbar navbar-expand-lg navbar-light " style="background-color:#000071;">
                <div class="px-2">
                    <a class="navbar-brand" href="Login_page.jsp" style="color:white">Login</a>
                </div>
                <div class="">
                    <a class="navbar-brand" href="Signup_page.jsp" style="color:white">Signup</a>
                </div>
                <!--                <div class="">
                                    <a class="navbar-brand" href="aboutpage.jsp">About</a>
                                </div>-->
                <div class="">
                    <a class="navbar-brand" href="contact.jsp" style="color:white">Contact</a>
                </div>
                
                
                <div class="collapse navbar-collapse" style="float:right;">
                    <a class="navbar-brand ml-auto" href="adminlogin.jsp" style="color:white">Admin</a>
                </div>
                
                


            </nav>
        </div>
        
        
        <div class="container" style="margin-top: 10%;">
            <div class="text-center py-4">
                <h3 class="" style="color:#000071;">Login</h3>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-3 col-xl-3"></div>
                <div class="col-lg-6 col-md-6 col-xl-6">
                    <!--<form action="Login_page_data.jsp" method="GET">-->
                    <form action="Login_page_data" method="post">
                        <!--                            <div class="mb-3">
                                                        <label for="pin" class="form-label">PIN</label>
                                                        <input type="text" class="form-control" id="exampleInputEmail1" name="pin" aria-describedby="emailHelp">
                                                        <div id="emailHelp" class="form-text"></div>
                                                    </div>-->
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Password</label>
                            <input type="password" class="form-control" name="password" id="exampleInputPassword1">
                        </div>
                        <div class="text-center">
                            <!--<button type="submit" name="button" class="btn btn-primary">Submit</button>-->
                            <input type="submit" value="login" />
                        </div>
                        
                        <div class="text-center">
                            <!--<button type="submit" name="button" class="btn btn-primary">Submit</button>-->
                            <a href="forget.jsp">Forget Password?</a>
                        </div>
                    </form>
                </div>
                <div class="col-lg-3 col-md-3 col-xl-3"></div>
            </div>
        </div>
<!--        <div>
                    <img src ='images/icici.jpg' style='width:100%;'>
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
