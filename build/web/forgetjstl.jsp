<%-- 
    Document   : forgetjstl
    Created on : 14 Jan, 2022, 3:21:47 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <h1>your details</h1>
        <!--<div style ="border-style:solid;width:90%;height:250px;padding:20px">--> 
            <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                               url="jdbc:mysql://localhost:3306/banking"
                               user="root" password="" />
            <c:set var = "id" value = "${param.id}"/>
            <sql:query dataSource="${db}" var="rs" >
                SELECT * from signup1 where email = ?;
                <sql:param value = "${id}" />
            </sql:query>

                <div class="container">
            <table class="table">
                <tr class="table-dark">
                    
                    <th>Name</th>
                    <th>Pin</th>
                    <th>Password</th>
                    <th>Email</th>
                    
                    

                </tr>
                

                <c:forEach var="table" items="${rs.rows}" >
                    <tr class="table-warning">
                        
                        <td><c:out value="${table.name}" /></td>
                        <td><c:out value="${table.pin}" /></td>
                        <td><c:out value="${table.passsword}" /></td>
                        <td><c:out value="${table.email}" /></td>
                        
                        
                    </tr>
                </c:forEach>



            </table>
        </div>
    </body>
</html>
