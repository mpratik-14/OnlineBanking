<%-- 
    Document   : transfer_amnt1
    Created on : 13 Jan, 2022, 2:03:11 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page contentType="text/html" language="java" import="java.sql.*,java.util.*,javax.swing.*,conn.ConnectionClass"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

        <%
            String holder_name = request.getParameter("account_holder");
            long account_number = Long.parseLong(request.getParameter("account_number"));

            long toaccount_number = Long.parseLong(request.getParameter("to_account_number"));
            String toaccount_holder = request.getParameter("to_account_holder");

            long amount_money = Long.parseLong(request.getParameter("money"));
            int otp = Integer.parseInt(request.getParameter("otp"));

            String message = request.getParameter("message");
            if (otp == pin) {
                if (amount_money <= 0) {
                    response.sendRedirect("error.jsp");
                } else {
                    String date = new java.util.Date().toString();
                    int nm3 = (Integer) session.getAttribute("pin");
//                int nm4 = Integer.parseInt(nm3);
                    String operation = "Transfer";
                    try {
                        ConnectionClass obj = new ConnectionClass();

                        String q3 = "select balance from signup3 where pin='" + nm3 + "'";
                        ResultSet rest = obj.stm.executeQuery(q3);
                        if (rest.next()) {
                            long balance = Long.parseLong(rest.getString("balance"));
                            long final_balance = balance - amount_money;
                            out.println("balance" + balance);
                            out.println("final balance" + final_balance);
//                        out.println("amount_money");

                            String q = "update signup3 SET balance='" + final_balance + "' where pin='" + nm3 + "'";
                            String q1 = "insert into history(pin,account_no,operation,amount_money,final_balance,date)values('" + nm3 + "','" + account_number + "','" + operation + "','" + amount_money + "','" + final_balance + "','" + date + "')";
                            String tns="insert into tran(pin,s_name,s_acc,r_name,r_acc,amount,operation,date)values('" + pin + "','" + name + "','" + account_number + "','" + toaccount_holder + "','" + toaccount_number + "','" + amount_money + "', '"+ operation+"' ,'"+ date+"')";
                            obj.stm.executeUpdate(q);
                            obj.stm.executeUpdate(q1);
                            obj.stm.executeUpdate(tns);
                            response.sendRedirect("successfully.jsp");
                        } else {
                            response.sendRedirect("error3.jsp");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                out.println("<h1>Wrong Pin Entered</h1>");
                out.println("<a href ='trans.jsp'>Your Pin was wrong. Please Try again</a>");
            }
        %>

       
    </body>
</html>
