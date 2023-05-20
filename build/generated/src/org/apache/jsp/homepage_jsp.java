package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("    <!--Css Link-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/login.css\">\n");
      out.write("    \n");
      out.write("    <!--<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@600&display=swap\" rel=\"stylesheet\">-->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Anton&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <!-- font cdn-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=\" crossorigin=\"anonymous\" />\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(session.getAttribute("user")!=null)
            {
                
      out.write("\n");
      out.write("                    <div class=\"container-fluid bg-info image-parent-div\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <img src=\"images/pngegg.png\" class=\"img-fluid image-div\" alt=\"...\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"\">\n");
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
      out.write("                ");

            }
            else
            {
                response.sendRedirect("error.jsp");
            }
        
      out.write(" \n");
      out.write("        <marquee>\n");
      out.write("            <h1 class=\"mt-5 text-center\">\n");
      out.write("            Welcome &nbsp ");
out.print(session.getAttribute("user"));
      out.write("\n");
      out.write("            </h1>\n");
      out.write("            <P class=\"text-center pt-2\">How May I help you Plese Check Blow.</p>\n");
      out.write("        </marquee>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h2 class=\"text-uppercase pt-5 pb-3\">Our Bank Catogery</h2>\n");
      out.write("                <p class=\"small pb-4\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Sequi, sit?</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <img src=\"images/bank1.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <h5 class=\"card-title text-uppercase\">Bank Security</h5>\n");
      out.write("                                <p class=\"card-text\">A security is a financial instrument, typically any financial asset that can be traded. The nature of what can and can't be called a security generally depends on the jurisdiction in which the assets are being traded.</p>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <small class=\"text-muted\">\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-facebook px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-instagram px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-twitter px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </small>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <img src=\"images/bank3.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <h5 class=\"card-title text-uppercase\">Money Transfer</h5>\n");
      out.write("                            <p class=\"card-text\">When money is used to intermediate the exchange of goods and services, it is performing a function as a medium of exchange. It thereby avoids the inefficiencies of a barter system, such as the \"coincidence of wants\" problem. Money's most important usage is as a method for comparing the values of dissimilar objects.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <small class=\"text-muted\">\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-facebook px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-instagram px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-twitter px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </small>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <img src=\"images/bank5.png\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <h5 class=\"card-title text-uppercase\">Bank Loan</h5>\n");
      out.write("                            <p class=\"card-text\">Common personal loans include mortgage loans, car loans, home equity lines of credit, credit cards, installment loans, and payday loans. The credit score of the borrower is a major component in and underwriting and interest rates (APR) of these loans.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <small class=\"text-muted\">\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-facebook px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-instagram px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"icon-style\">\n");
      out.write("                                        <i class=\"fa fa-twitter px-4\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </small>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("         <!--tea facility start--> \n");
      out.write("\n");
      out.write("        <section class=\"facelity\" id=\"facelity-id\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h2 class=\"text-uppercase pt-5 pb-3\">Bank Department</h2>\n");
      out.write("                <p class=\"small pb-4\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Sequi, sit?</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                        <img src=\"images/bank5.png\" class=\"img-fluid rounded\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                        <h4 class=\"text-center text-capitalize mt-2\">Travel time</h4>\n");
      out.write("                        <p class=\"text-center text-capitalize mt-1\">\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus mollitia iste fuga similique \n");
      out.write("                            porro sequi hic nisi minus, tempora, ipsa explicabo possimus eveniet, harum quaerat accusantium et \n");
      out.write("                            velit ut soluta? <br><br>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus mollitia iste fuga \n");
      out.write("                            similique porro sequi hic nisi minus, tempora, ipsa explicabo possimus eveniet, harum quaerat accusantium \n");
      out.write("                            et velit ut soluta?\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row pt-4\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                            <h4 class=\"text-center text-capitalize mt-2\">Travel time</h4>\n");
      out.write("                            <p class=\"text-center text-capitalize mt-1\">\n");
      out.write("                                Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus mollitia iste fuga similique \n");
      out.write("                                porro sequi hic nisi minus, tempora, ipsa explicabo possimus eveniet, harum quaerat accusantium et \n");
      out.write("                                velit ut soluta? <br><br>\n");
      out.write("                                Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus mollitia iste fuga \n");
      out.write("                                similique porro sequi hic nisi minus, tempora, ipsa explicabo possimus eveniet, harum quaerat accusantium \n");
      out.write("                                et velit ut soluta?\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                        <img src=\"images/bank4.jpg\" class=\"img-fluid rounded\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row pt-4\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                        <img src=\"images/bank2.png\" class=\"img-fluid rounded\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                        <h4 class=\"text-center text-capitalize mt-2\">Travel time</h4>\n");
      out.write("                        <p class=\"text-center text-capitalize mt-1\">\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus mollitia iste fuga similique \n");
      out.write("                            porro sequi hic nisi minus, tempora, ipsa explicabo possimus eveniet, harum quaerat accusantium et \n");
      out.write("                            velit ut soluta? <br><br>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus mollitia iste fuga \n");
      out.write("                            similique porro sequi hic nisi minus, tempora, ipsa explicabo possimus eveniet, harum quaerat accusantium \n");
      out.write("                            et velit ut soluta?\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("<!--     tea facility end -->\n");
      out.write("        <footer class=\"pt-4\">\n");
      out.write("            <div class=\"text-center bg-info\">\n");
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
