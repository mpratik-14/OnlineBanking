package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import conn.ConnectionClass;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <!--Css Link-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/login.css\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Anton&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- font cdn-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=\" crossorigin=\"anonymous\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\" style=\"background-color:#000071;\">\n");
      out.write("                <div class=\"px-1\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"user_dash.jsp\" style=\"color:white\">Hello,<span style=\"color:#FFD800\">");
out.print(session.getAttribute("name"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"account_details.jsp\" style=\"color:white\">Account Details</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"deposit.jsp\" style=\"color:white\">Deposit</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"withdraw.jsp\" style=\"color:white\">Withdraw</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"check_balance.jsp\" style=\"color:white\">Get Balance</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"transfer_amount.jsp\" style=\"color:white\">Transfer Amount</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"history.jsp\" style=\"color:white\">View Report</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"logout.jsp\" style=\"color:white\">LogOut</a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"\">\n");
      out.write("            <div class=\"container bg-dark my-5\">\n");
      out.write("                <h5 class=\"text-white text-center pb-1\">your Account History Details</h5>        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row \" style='border:2px solid black; margin:auto;width:90%;margin-top:5%;padding:20px;background-color:#C2FFF8'>\n");
      out.write("            <div class=\"col-lg-2 col-md-1 col-xl-2 col-sm-0 col-0\"></div>\n");
      out.write("            <div class=\"col-lg-8 col-md-10 col-xl-8 col-sm-12 col-12\">\n");
      out.write("                <table class=\"table table-dark table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">Account no</th>\n");
      out.write("                            <th scope=\"col\">Operation</th>\n");
      out.write("                            <th scope=\"col\">Amount</th>\n");
      out.write("                            <th scope=\"col\">Balance</th>\n");
      out.write("                            <th scope=\"col\">Date-Time</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        ");

                            int count = 0;
                            try {
                                ConnectionClass obj = new ConnectionClass();
                                String q = "select count(pin) from history where pin='" + pin + "'";
                                ResultSet rest = obj.stm.executeQuery(q);
                                rest.next();
                                count = rest.getInt(1);
                                String q1 = "select * from history where pin='" + pin + "'order by id desc";
                                ResultSet rest1 = obj.stm.executeQuery(q1);
                                for (int i = 0; i < count; i++) {
                                    while (rest1.next()) {
                        
      out.write("<tr class=\"table\">\n");
      out.write("                            <td>");
out.print(rest1.getString("account_no"));
      out.write("</td>\n");
      out.write("                            <td>");
out.print(rest1.getString("operation"));
      out.write("</td>\n");
      out.write("                            <td>");
out.print(rest1.getString("amount_money"));
      out.write("</td>\n");
      out.write("                            <td>");
out.print(rest1.getString("final_balance"));
      out.write("</td>\n");
      out.write("                            <td>");
out.print(rest1.getString("date"));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-2 col-md-1 col-xl-2 col-sm-0 col-0\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"pt-4\">\n");
      out.write("            <div class=\"text-center\" style=\"background-color:#000071;color:white\">\n");
      out.write("                <h6 class=\"py-2\">Copyright @Pratik Mhatre</h6>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
