/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Register at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        int pin = Integer.parseInt(request.getParameter("pin"));
        String fname = request.getParameter("fname");
        String fathername = request.getParameter("fathername");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String date = request.getParameter("date");
        String number = request.getParameter("number");
        String gender = request.getParameter("gender");

//        String religion = request.getParameter("religion");
//        String catogery = request.getParameter("catogery");
//        String education = request.getParameter("education");
        long account = Long.parseLong(request.getParameter("account"));
        String account_type = request.getParameter("account_type");
        long balance = Long.parseLong(request.getParameter("balance"));

//        out.println("name " + pin + " password " + password + " email " + email + " mobno  " + mobno + " gender " + gender + "course" + course + "dob " + dob);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/banking";
            Connection con = DriverManager.getConnection(url, "root", "");

            PreparedStatement chk = con.prepareStatement("Select * from signup1 where email=?");
            chk.setString(1, email);
//            chk.setString(2, account);
            ResultSet chkacc = chk.executeQuery();
            if (chkacc.next()) {
                out.println(" <h1>Record already exist</h1>");
            } else {
                String customer = "Insert into signup1 (pin,name,fname,city,state,zip,passsword,birth,email,Phone,Gender) values (" + pin + ",'" + fname + "','" + fathername + "','" + city + "','" + state + "','" + zip + "','" + password + "','" + date + "','" + email + "','" + number + "','" + gender + "')";

                String custacc = "Insert into signup3 (pin,account_no, account_type,balance) values (" + pin + ",'" + account + "','" + account_type + "','" + balance + "')";

                out.println(customer);
                out.println(custacc);
                out.println();
                Statement inst = con.createStatement();
                int cust = inst.executeUpdate(customer);
                int custacct = inst.executeUpdate(custacc);
//            inst.executeUpdate(custacc);
                if (cust == 1 && custacct == 1) {
                    out.println("<h1>record inserted on both table</h1>");
                } else {
                    out.println("no record  inserted on both table");
                }
            }

//            inst.executeUpdate();
//            response.sendRedirect("index.jsp");
        }
          catch (ClassNotFoundException ce) {
            ce.getStackTrace();
            System.out.println(ce);
        } catch (SQLException se) {
            se.getStackTrace();
            System.out.println("Sql error" + se);
        } catch (Exception e) {
            e.getStackTrace();

            System.out.println("NO record found");
        }
        out.println("<a href = 'index.jsp'>Click Here for login</a>");
        processRequest(request, response);
    }

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            String url = "jdbc:mysql://localhost:3306/banking";
//            Connection con = DriverManager.getConnection(url, "root", "");
//
////PreparedStatement p = con.prepareStatement("insert into student(name,email,password,mobno,dob,gender,course,sem,rollno) "
//            // + "values(?,?,?,?,?,?,?,?,?)");
////p.setString(1,email);
////p.setString(2,password);
////p.setString(3,course);
////ResultSet rs = p.executeQuery();
//            PreparedStatement chkem = con.prepareStatement("select email from signup1 where email= ?");
//            chkem.setString(1, email);
//            ResultSet chk = chkem.executeQuery();
//            if (chk.next()) {
//                out.println("email already exists");
//            } else {
////                signup1
//                try {
////                    out.println("inside else");
//                    PreparedStatement pst = con.prepareStatement("insert into signup1 values (?,?,?,?,?,?,?,?,?)");
//                    pst.setInt(1, pin);
//                    pst.setString(2, fname);
//                    pst.setString(3, fathername);
//                    pst.setString(4, city);
//                    pst.setString(5, state);
//                    pst.setString(6, zip);
//                    pst.setString(7, email);
//                    pst.setString(8, password);
//                    pst.setString(9, date);
//                    int ins = pst.executeUpdate();
//                    
//                    if (ins == 1) {
//                        out.println("Record Inserted in signup1");
//                    } else {
//                        out.println("Record not Inserted");
//                    }
//                    
////                    signup3
//                    
//                    
//                    PreparedStatement pst2 = con.prepareStatement("insert into signup3 values (?,?,?,?)");
//                    pst2.setInt(1, pin);
//                    pst2.setLong(2, account);
//                    pst2.setString(3, account_type);
//                    pst2.setLong(3, balance);
//
//                    int ins2 = pst2.executeUpdate();
//                    if (ins2 == 1) {
//                        out.println("Record Inserted in signup3");
//                    } else {
//                        out.println("Record not Inserted");
//                    }
//
//                    System.out.println("Record not inserted");
////                    signup2
//                            
//                            
////                    PreparedStatement pst1 = con.prepareStatement("insert into signup2 values (?,?,?,?)");
////                    pst1.setInt(1, pin);
////                    pst1.setString(2, religion);
////                    pst1.setString(3, catogery);
////                    pst1.setString(4, education);
////
////                    int ins1 = pst1.executeUpdate();
////                    if (ins1 == 1) {
////                        out.println("Record Inserted in signup2");
////                    } else {
////                        out.println("Record not Inserted");
////                    }
//                    
//
//                    
//                    
//                    
//                } catch (Exception e) {
//        e.getStackTrace();
//
//    }

//signup2                
//                try {
////                    out.println("inside else");
//                    
//
//                } catch (Exception e) {
//                    e.getStackTrace();
//
//                    System.out.println("Record not inserted");
//                }
//                signup3
//                try {
////                    out.println("inside else");
//                    
//                } catch (Exception e) {
//                    e.getStackTrace();
//
//                    System.out.println("Record not inserted");
//                }
//}
//
//} 
      

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
