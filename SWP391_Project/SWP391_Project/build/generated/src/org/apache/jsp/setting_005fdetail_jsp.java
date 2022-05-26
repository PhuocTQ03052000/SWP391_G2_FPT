package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>SettingDetail</title>\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template -->\n");
      out.write("    <link href=\"../vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/styles/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/styles/slider_status.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom styles for this page -->\n");
      out.write("    <link href=\"vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/my_account.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/fnon.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/styles/custom_box.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("    <!-- Page Wrapper -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("            <div include-html=\"../components/sidebar.html\" id=\"sidebar\" style=\"display: contents;\"></div>\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("            </div>\n");
      out.write("        </ul>\n");
      out.write("        <!-- End of Sidebar -->\n");
      out.write("        <!-- Content Wrapper -->\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <!-- Topbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <!-- Topbar Navbar -->\n");
      out.write("                    <div include-html=\"../components/topnavbar_admin.html\" id=\"topnavbar\" class=\"ml-auto\"></div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                <!-- Begin Page Content -->\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-8 col-sm-12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-8 col-sm-8\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"provider-name\" class=\"col-form-label\">Group*:</label>\n");
      out.write("                                        <select name=\"provider-name\" id=\"provider-name\"\n");
      out.write("                                            class=\"border border-secondary w-100 label_box rounded\">\n");
      out.write("                                            <option value=\"status-1\">Lesson type</option>\n");
      out.write("                                            <option value=\"status-1\">Role 2</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <div class=\"fail\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-8 col-sm-4\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"staff-phone\" class=\"col-form-label\">Order*:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"staff-phone\" />\n");
      out.write("                                        <div class=\"fail\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"staff-phone\" class=\"col-form-label\">Name*:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"staff-phone\" />\n");
      out.write("                            <div class=\"fail\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-sm-12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-8 col-sm-8\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"provider-name\" class=\"col-form-label\">Value:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"staff-phone\" />\n");
      out.write("                                        <div class=\"fail\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-8 col-sm-4\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"staff-name\" class=\"col-form-label\">Status:</label><br>\n");
      out.write("                                        <input type=\"radio\" id=\"age1\" name=\"age\" value=\"30\">\n");
      out.write("                                        <label for=\"age1\" style=\"margin-right: 30%;\">Active</label>\n");
      out.write("                                        <input type=\"radio\" id=\"age2\" name=\"age\" value=\"60\">\n");
      out.write("                                        <label for=\"age1\" style=\"margin-right: 10%;\">Deactive</label>\n");
      out.write("                                        <div class=\"fail\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"order-note\" class=\"col-form-label\">Description:</label>\n");
      out.write("                            <textarea class=\"border border-secondary w-100 p-2 rounded\" readonly\n");
      out.write("                                id=\"order-note\" style=\"resize: none; overflow: auto;\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary\" value=\"Add/Save\"></input>\n");
      out.write("                        <!-- <button type=\"button\" class=\"btn btn-secondary\"\n");
      out.write("                                                            data-dismiss=\"modal\">Cancel</button> -->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Main Content -->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal fade\" id=\"changePassModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"changePassLabel\"\n");
      out.write("            aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Đổi mật khẩu</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"\" id=\"form1\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-8 col-sm-12 \">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"old-password\">Mật khẩu cũ:</label>\n");
      out.write("                                                <input type=\"text\" id=\"old-password\" name=\"old-password\"\n");
      out.write("                                                    class=\"form-control\" />\n");
      out.write("                                                <div class=\"fail\"></div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"new-password\" class=\"col-form-label\">Mặt khẩu mới:</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"new-password\"\n");
      out.write("                                                    name=\"new-password\" />\n");
      out.write("                                                <div class=\"fail\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"re-password\" class=\"col-form-label\">Xác nhận mặt khẩu\n");
      out.write("                                                    mới:</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"re-password\"\n");
      out.write("                                                    name=\"re-password\" />\n");
      out.write("                                                <div class=\"fail\"></div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <!-- <br> -->\n");
      out.write("                                            <div class=\"modal-footer\">\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-primary\" value=\"Nhập\"></input>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\"\n");
      out.write("                                                    data-dismiss=\"modal\">Hủy</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Content Wrapper -->\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js \"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js \"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin-2.min.js \"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level plugins -->\n");
      out.write("    <script src=\"vendor/datatables/jquery.dataTables.min.js \"></script>\n");
      out.write("    <script src=\"vendor/datatables/dataTables.bootstrap4.min.js \"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level custom scripts -->\n");
      out.write("    <script src=\"js/demo/datatables-demo.js \"></script>\n");
      out.write("    <script src=\"js/include-html.min.js \"></script>\n");
      out.write("    <script src=\"js/fnon.min.js\"></script>\n");
      out.write("</body>\n");
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
