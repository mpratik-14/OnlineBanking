package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import conn.ConnectionClass;

public final class withdraw_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@600&display=swap\" rel=\"stylesheet\">-->\n");
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
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("                <div class=\"px-1\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">Hello,<span class=\"text-white\">");
out.print(session.getAttribute("email"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"account_details.jsp\">Account Details</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"deposit.jsp\">Deposit</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"withdraw.jsp\">Withdraw</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"check_balance.jsp\">Get Balance</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"transfer_amount.jsp\">Transfer Amount</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"history.jsp\">View Report</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"logout.jsp\">LogOut</a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"\">\n");
      out.write("            <div class=\"container bg-dark mt-5\">\n");
      out.write("                <h5 class=\"text-white text-center\">Withdraw Amount in Bank Account</h5>        \n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("                <div class=\"row pt-3\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-4 col-xl-4 col-sm-3 col-2\"></div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-4 col-xl-4 col-sm-6 col-8\">\n");
      out.write("                            <form action=\"withdraw_data.jsp\" method=\"POST\">\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <h5 class=\"text-center\">Your name</h5>\n");
      out.write("                                    <input type=\"text\" name=\"account_holder\" class=\"form-control\" readonly value=\"");
out.print(session.getAttribute("user"));
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <h5 class=\"text-center\">Your Account Number</h5>\n");
      out.write("                                    <input type=\"text\" name=\"account_number\" class=\"form-control\" readonly value=\"");

                                        String nm3=(String)session.getAttribute("pin");
                                        int nm4=Integer.parseInt(nm3);
                                        try
                                        {
                                            ConnectionClass obj=new ConnectionClass();
                                            String q="select account_no from signup3 where pin='"+nm4+"'";
                                            ResultSet rest=obj.stm.executeQuery(q);
                                            if(rest.next())
                                            {
                                                String account=rest.getString("account_no");
                                                out.print(account);
                                            }
                                        }
                                        catch(Exception e)
                                        {

                                        }
                                        
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <h5 class=\"text-center\">How much Amount want to withdraw</h5>\n");
      out.write("                                    <input type=\"text\" name=\"money\" class=\"form-control\" placeholder=\"1000 Rs.\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button type=\"submit\" name=\"button\" class=\"btn btn-primary\">Withdraw</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-4 col-xl-4 col-sm-3 col-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"pt-4\" style=\"position:absolute;bottom:0;\">\n");
      out.write("            <div class=\"text-center bg-info\">\n");
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
