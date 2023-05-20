package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=\" crossorigin=\"anonymous\" />\n");
      out.write("        <style>\n");
      out.write("/*            *{\n");
      out.write("                background: url(\"images/icici.jpg\");\n");
      out.write("            }*/\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style='background-image:url(images/icici.png);background-size:50%;  background-repeat: no-repeat; background-attachment: fixed;background-color: #FFB851 '>\n");
      out.write("        <!--        <div class=\"container-fluid bg-primary image-parent-div\" >\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <img src=\"images/pngegg.png\" class=\"img-fluid image-div\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("        <div class=\"\">\n");
      out.write("            <!--<nav class=\"navbar navbar-expand-lg navbar-light bg-primary\" style=\"background-color:#000071;color:white\">-->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light \" style=\"background-color:#000071;\">\n");
      out.write("                <div class=\"px-2\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Login_page.jsp\" style=\"color:white\">Login</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Signup_page.jsp\" style=\"color:white\">Signup</a>\n");
      out.write("                </div>\n");
      out.write("                <!--                <div class=\"\">\n");
      out.write("                                    <a class=\"navbar-brand\" href=\"aboutpage.jsp\">About</a>\n");
      out.write("                                </div>-->\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"contact.jsp\" style=\"color:white\">Contact</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse\" style=\"float:right;\">\n");
      out.write("                    <a class=\"navbar-brand ml-auto\" href=\"adminlogin.jsp\" style=\"color:white\">Admin</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"margin-top: 10%;\">\n");
      out.write("            <div class=\"text-center py-4\">\n");
      out.write("                <h3 class=\"\" style=\"color:#000071;\">Login</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-xl-3\"></div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-xl-6\">\n");
      out.write("                    <!--<form action=\"Login_page_data.jsp\" method=\"GET\">-->\n");
      out.write("                    <form action=\"Login_page_data\" method=\"post\">\n");
      out.write("                        <!--                            <div class=\"mb-3\">\n");
      out.write("                                                        <label for=\"pin\" class=\"form-label\">PIN</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" name=\"pin\" aria-describedby=\"emailHelp\">\n");
      out.write("                                                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                                                    </div>-->\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" name=\"email\" aria-describedby=\"emailHelp\">\n");
      out.write("                            <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" id=\"exampleInputPassword1\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <!--<button type=\"submit\" name=\"button\" class=\"btn btn-primary\">Submit</button>-->\n");
      out.write("                            <input type=\"submit\" value=\"login\" />\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <!--<button type=\"submit\" name=\"button\" class=\"btn btn-primary\">Submit</button>-->\n");
      out.write("                            <a href=\"forget.jsp\">Forget Password?</a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-xl-3\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <div>\n");
      out.write("                    <img src ='images/icici.jpg' style='width:100%;'>\n");
      out.write("                </div>-->\n");
      out.write("        <footer class=\"pt-4\" style=\"position:absolute;bottom:0;\" >\n");
      out.write("            <div class=\"text-center\" style=\"background-color:#000071;color:white;\">\n");
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
