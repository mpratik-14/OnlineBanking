package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fdash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String email = (String) session.getValue("username");
            String pass = (String) session.getValue("username");
            String pin = (String) session.getValue("username");
            out.print("<body>");
            out.print("<h1>");
            out.print("Hello: " + email);
            out.print("</h1>");
            out.print("</body>");
        
      out.write("\n");
      out.write("        <div class=\"\">\n");
      out.write("                        <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("                            <div class=\"px-1\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"homepage.jsp\">Hello,&nbsp<span class=\"text-white\">");
out.print(session.getAttribute("user"));
      out.write("</span></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"account_details.jsp\">Account Details</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"deposit.jsp\">Deposite</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"withdrow.jsp\">Withdraw</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"check_balance.jsp\">Get Balance</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"transfer_amount.jsp\">Transfer Amount</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"history.jsp\">View Report</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"logout.jsp\">LogOut</a>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
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
