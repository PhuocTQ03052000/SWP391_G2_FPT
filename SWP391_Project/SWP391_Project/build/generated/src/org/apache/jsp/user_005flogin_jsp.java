package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/lgin_reg_fgpw.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.iconify.design/2/2.1.2/iconify.min.js\"></script>\n");
      out.write("        <link href=\"assets/styles/custom_box.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/fnon.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        /* Importing fonts from Google */\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap');\n");
      out.write("\n");
      out.write("        /* Reseting */\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            background: #ecf0f3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper {\n");
      out.write("            max-width: 350px;\n");
      out.write("            min-height: 500px;\n");
      out.write("            margin: 80px auto;\n");
      out.write("            padding: 40px 30px 30px 30px;\n");
      out.write("            background-color: #ecf0f3;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 13px 13px 20px #cbced1, -13px -13px 20px #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo {\n");
      out.write("            width: 80px;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 80px;\n");
      out.write("            object-fit: cover;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            box-shadow: 0px 0px 3px #5f5f5f,\n");
      out.write("                0px 0px 0px 5px #ecf0f3,\n");
      out.write("                8px 8px 15px #a7aaa7,\n");
      out.write("                -8px -8px 15px #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper .name {\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-size: 1.4rem;\n");
      out.write("            letter-spacing: 1.3px;\n");
      out.write("            padding-left: 10px;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper .form-field input {\n");
      out.write("            width: 100%;\n");
      out.write("            display: block;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            background: none;\n");
      out.write("            font-size: 1.2rem;\n");
      out.write("            color: #666;\n");
      out.write("            padding: 10px 15px 10px 10px;\n");
      out.write("            /* border: 1px solid red; */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper .form-field {\n");
      out.write("            padding-left: 10px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: inset 8px 8px 8px #cbced1, inset -8px -8px 8px #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper .form-field .fas {\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper .btn {\n");
      out.write("            box-shadow: none;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 40px;\n");
      out.write("            background-color: #03A9F4;\n");
      out.write("            color: #fff;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            box-shadow: 3px 3px 3px #b1b1b1,\n");
      out.write("                -3px -3px 3px #fff;\n");
      out.write("            letter-spacing: 1.3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper .btn:hover {\n");
      out.write("            background-color: #039BE5;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 0.8rem;\n");
      out.write("            color: #03A9F4;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper a:hover {\n");
      out.write("            color: #039BE5;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media(max-width: 380px) {\n");
      out.write("            .wrapper {\n");
      out.write("                margin: 30px 20px;\n");
      out.write("                padding: 40px 15px 15px 15px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body class=\"img js-fullHeight\" style=\"background-image: url(assets/image/bg4.webp); background-attachment: fixed;\">\n");
      out.write("     \n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            \n");
      out.write("            <div class=\"text-center mt-4 name\">\n");
      out.write("                User Login\n");
      out.write("            </div>\n");
      out.write("            <form class=\"p-3 mt-3\" method=\"POST\" action=\"login\">\n");
      out.write("                <div class=\"form-field d-flex align-items-center\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"userName\" placeholder=\"Enter username\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-field d-flex align-items-center\">\n");
      out.write("                   \n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"pwd\" placeholder=\"Enter Password\">\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn mt-3\">Login</button>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"text-center fs-6\">\n");
      out.write("                <a href=\"#\">Forget password?</a> or <a href=\"#\">Sign up</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--    <script src=\"../js/jquery.min.js\"></script>\n");
      out.write("            <script src=\"../js/popper.js\"></script>\n");
      out.write("            <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"../js/main.js\"></script>\n");
      out.write("            <script src=\"../js/fnon.min.js\"></script>\n");
      out.write("            <script src=\"../js/valdation/login_validate.js\"></script>\n");
      out.write("        -->\n");
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
