package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fdash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
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
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\" style=\"background-color:#000071;\">\n");
      out.write("                <div class=\"px-1\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" style=\"color:white\">Hello,&nbsp<span style=\"color:#FFD800\">");
out.print(name);
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"regis.jsp\" style=\"color:white\">Registered Accounts</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"hist.jsp\" style=\"color:white\">Transactions & History</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("<!--                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"up_pin.jsp\" style=\"color:white\">Update Customer details</a>\n");
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
      out.write("-->                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"adminlogin.jsp\" style=\"color:white\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"pt-4\" style=\"position:absolute;bottom:0;\" >\n");
      out.write("            <div class=\"text-center\" style=\"background-color:#000071;color:white;\">\n");
      out.write("                <h6 class=\"py-2\">Copyright @Pratik Mhatre</h6>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\" integrity=\"sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js\" integrity=\"sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj\" crossorigin=\"anonymous\"></script>\n");
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
