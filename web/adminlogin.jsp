<%-- 
    Document   : adminlogin
    Created on : 14 Jan, 2022, 3:38:16 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Registration Form</title>
        <link rel ="stylesheet" type="text/css" href="css/newcss.css">
    </head>

    <body>

        <div class="wrapper fadeInDown">
            <div id ="formContent">

                <h2 class="active">Sign In</h2>
                <!--&emsp;&emsp;<a href = "reg_admin.html">Sign Up </a><br>-->
                <div class ="fadeIn first"> </div>


                <form action ="LoginDisplay" method="post">
                    <input type="text" id="login" class="fadeIn second" name="id" placeholder="Enter your email">
                    <input type="password" id="password" class="fadeIn third" name="password" placeholder="password">
                    <input type="submit" class="fadeIn fourth" value="Login">
                    <!--<a href ="forget1.jsp">Forgot password?</a>-->
                    <!--                    <input type="reset" class="fadeIn fourth" value="reset/clear">-->

                    <!--                    <input type="submit" class="submit" value="login" />
                    
                                        <input type="reset" class="reset" value="reset/clear" />-->



                </form>
            </div>
        </div>







    </body>
</html>
