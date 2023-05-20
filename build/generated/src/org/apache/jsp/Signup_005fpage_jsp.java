package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import conn.ConnectionClass;

public final class Signup_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <!--Css Link-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/login.css\">\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=\" crossorigin=\"anonymous\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid bg-info image-parent-div\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <!--<img src=\"images/pngegg.png\" class=\"img-fluid image-div\" alt=\"...\">-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light \" style=\"background-color:#000071;\">\n");
      out.write("                <div class=\"px-2\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\" style=\"color:white\">Login</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"style=\"color:white\">Signup</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"aboutpage.jsp\"style=\"color:white\">About</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"contact.jsp\"style=\"color:white\">Contact</a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center py-4\">\n");
      out.write("                <h3 class=\"text-primary\">Signup/Register</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-xl-3\"></div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-xl-6\">\n");
      out.write("                    <!--<form class=\"row g-3\" method=\"GET\" action=\"Signup_page_data.jsp\">-->\n");
      out.write("                    <form class=\"row g-3\" method=\"POST\" action=\"Register\">\n");
      out.write("                        ");

                            Random ran = new Random();
                            int first3 = (ran.nextInt() % 9000) + 1000;
                            int first4 = Math.abs(first3);

                            long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
                            long first8 = Math.abs(first7);
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-4\">-->\n");
      out.write("                        <label for=\"validationDefault03\" class=\"form-label\">Unique Pin</label>\n");
      out.write("                        <input type=\"text\" name=\"pin\" class=\"form-control\" value=\"");
out.println(first4);
      out.write("\" required readonly>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-4\">-->\n");
      out.write("                        <label for=\"validationDefault02\" class=\"form-label\">Name</label>\n");
      out.write("                        <input type=\"text\" name=\"fname\"class=\"form-control\" placeholder=\"Pratik\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-4\">-->\n");
      out.write("                        <label for=\"validationDefault02\" class=\"form-label\">Surname</label>\n");
      out.write("                        <input type=\"text\" name=\"fathername\" class=\"form-control\" placeholder=\"XYZ\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-6\">-->\n");
      out.write("                        <label for=\"validationDefault03\" class=\"form-label\">City</label>\n");
      out.write("                        <input type=\"text\" name=\"city\" class=\"form-control\" placeholder=\"Bombay\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-3\">-->\n");
      out.write("                        <label for=\"validationDefault03\" class=\"form-label\">State</label>\n");
      out.write("                        <input type=\"text\" name=\"state\" class=\"form-control\" placeholder=\"Maharashtra\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-3\">-->\n");
      out.write("                        <label for=\"validationDefault05\" class=\"form-label\">Zip</label>\n");
      out.write("                        <input type=\"text\" name=\"zip\" class=\"form-control\" placeholder=\"400031\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-6\">-->\n");
      out.write("                        <label for=\"validationDefault03\" class=\"form-label\">Email</label>\n");
      out.write("                        <input type=\"email\" name=\"email\" class=\"form-control\" aria-describedby=\"emailHelp\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-3\">-->\n");
      out.write("                        <label for=\"validationDefault03\" class=\"form-label\">Password</label>\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form-control\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-md-3\">-->\n");
      out.write("                        <label for=\"validationDefault05\" class=\"form-label\">Date</label>\n");
      out.write("                        <input type=\"date\" name=\"date\" class=\"form-control\" required>\n");
      out.write("                        \n");
      out.write("                        <label for=\"validationDefault05\" class=\"form-label\">Phone Number</label>\n");
      out.write("                        <input type=\"text\" name=\"number\" class=\"form-control\" required>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <label for=\"validationDefault05\" class=\"form-label\">Gender:</label>\n");
      out.write("                         <div class=\"form-check\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"Male\" >\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDefault1\">\n");
      out.write("                                Male\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"Female\" >\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDefault2\">\n");
      out.write("                                Female\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"Other\" >\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDefault2\">\n");
      out.write("                                Other\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                        <!--<div class=\"col-12 text-center\">-->\n");
      out.write("                        <!--                        <h5 class=\"text-primary\">Customer Personal Details</h5>\n");
      out.write("                                                </div>\n");
      out.write("                        \n");
      out.write("                                                Customer Personal Details\n");
      out.write("                        \n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                <label for=\"validationDefault02\" class=\"form-label\">Religion</label>\n");
      out.write("                                                <input type=\"text\" name=\"religion\"class=\"form-control\" placeholder=\"Hindu\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                <label for=\"validationDefault02\" class=\"form-label\">Catogery</label>\n");
      out.write("                                                <input type=\"text\" name=\"catogery\" class=\"form-control\" placeholder=\"General/OBC\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                <label for=\"validationDefault03\" class=\"form-label\">Education</label>\n");
      out.write("                                                <input type=\"text\" name=\"education\" class=\"form-control\" placeholder=\"Post,Under Gre.\" required>-->\n");
      out.write("                        <!--</div>-->\n");
      out.write("                        <!--Customer Personal Details-->\n");
      out.write("                        <!--<div class=\"col-12 text-center\">-->\n");
      out.write("                        <h5 class=\"text-primary\">Customer Account Details</h5>\n");
      out.write("                        <!--</div>-->\n");
      out.write("                        <!--<div class=\"col-md-4\">-->\n");
      out.write("                        <label for=\"validationDefault02\" class=\"form-label\">Account No</label>\n");
      out.write("                        <input type=\"text\" name=\"account\" class=\"form-control\" value=\"");
out.println(first8);
      out.write("\" readonly placeholder=\"otto\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("                        <!--<div class=\"col-md-4\">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <label for=\"validationDefault02\" class=\"form-label\">Account Type</label>\n");
      out.write("                        <!--                                                <input type=\"radio\" name=\"account_type\" class=\"form-control\" placeholder=\"saving/current\" placeholder=\"Saving\" required>\n");
      out.write("                                                                        <input type=\"radio\" name=\"account_type\"  value=\"saving\" required>Saving\n");
      out.write("                                                                        <input type=\"radio\" name=\"account_type\"  value=\"current\" required>Current-->\n");
      out.write("\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"account_type\" value=\"Saving\" >\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDefault1\">\n");
      out.write("                                Saving\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"account_type\" value=\"Current\" >\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDefault2\">\n");
      out.write("                                Current\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!--</div>-->\n");
      out.write("                        <!--<div class=\"col-md-4\">-->\n");
      out.write("                        <label for=\"validationDefault03\" class=\"form-label\">Open Balance</label>\n");
      out.write("                        <input type=\"number\" name=\"balance\" class=\"form-control\" placeholder=\"Min 500\" required>\n");
      out.write("                        <!--</div>-->\n");
      out.write("                        <div class=\"col-12 text-center\">\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"submit\">Register</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-xl-3\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"pt-4\">\n");
      out.write("            <div class=\"text-center\" style=\"background-color:#000071;color:white\">\n");
      out.write("                <h6 class=\"py-2\">Copyright @Pratik Mhatre</h6>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
