package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Register</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/lgin_reg_fgpw.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <script src=\"https://code.iconify.design/2/2.1.2/iconify.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body class=\"img js-fullHeight\" style=\"background-image: url(/assets/image/bg4.webp);background-attachment: fixed;\">\n");
      out.write("    <section class=\"ftco-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-6 text-center\">\n");
      out.write("                    <a href=\"home.html\">\n");
      out.write("                       <img src=\"assets/image/logophuoc-01.PNG\" width=\"170\" height=\"200\" style=\"padding-bottom: 5%;\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-6 col-lg-4\" style=\"background-color: rgba(28, 100, 168, 0.521); border: 5px solid rgb(117, 105, 105);\">\n");
      out.write("                    <div class=\"login-wrap p-0\">\n");
      out.write("                        <h3 class=\"mb-4 text-center\">Đăng Ký</h3>\n");
      out.write("                        <form id=\"form\" action=\"register\" method=\"post\">\n");
      out.write("                            <!-- Nhập username -->\n");
      out.write("                            <div class=\"input-control\">\n");
      out.write("                                <input id=\"account\" name=\"username\" type=\"text\" class=\"form-control\" placeholder=\"Tên tài khoản\" required>\n");
      out.write("                                <div class=\"error\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Nhập email -->\n");
      out.write("                            <div class=\"input-control\">\n");
      out.write("                                <input id=\"email\" name=\"email\" type=\"text\" class=\"form-control\" placeholder=\"Tài khoản email\" required>\n");
      out.write("                                <div class=\"error\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"input-control\">\n");
      out.write("                                <input id=\"number\" name=\"phone\" type=\"text\" class=\"form-control\" placeholder=\"Số điện thoại\" required>\n");
      out.write("                                <div class=\"error\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"input-control\">\n");
      out.write("                                <label for=\"staff-name\" class=\"col-form-label\" style=\"margin-left: 5%;\">Gender:</label><br>\n");
      out.write("                                <input type=\"radio\" id=\"age1\" name=\"gender\" value=\"Male\" style=\"margin-left: 10%;\" checked=\"true\">\n");
      out.write("                                <label for=\"age1\" style=\"margin-right: 20%;\">Nam</label>\n");
      out.write("                                <input type=\"radio\" id=\"age2\" name=\"gender\" value=\"Female\">\n");
      out.write("                                <label for=\"age1\" style=\"margin-right: 10%;\">Nữ</label>\n");
      out.write("                                <div class=\"fail\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Đăng nhập btn -->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" class=\"form-control btn btn-primary submit px-3\" value=\"Đăng ký\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <!-- URL tạo tài khoản -->\n");
      out.write("                        <div class=\"w-100 text-center\">\n");
      out.write("                            <p>Bạn đã có tài khoản? <a href=\"login.jsp\" style=\"color: #fff; text-decoration: underline;\"><b>Đăng nhập ngay!</b></a>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <!--    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/valdation/register_validate.js\"></script>-->\n");
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
