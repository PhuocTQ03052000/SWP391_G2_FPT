/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SettingDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Setting;

/**
 *
 * @author phant
 */
public class EditSettingDetailController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditSettingDetailController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditSettingDetailController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sid=request.getParameter("id");
//        String sid = "2";
        SettingDAO sdb = new SettingDAO();
        Setting s = sdb.getSettingByID(sid);
        request.setAttribute("setting", s);
        request.setAttribute("sid", sid);
        request.getRequestDispatcher("setting_detail.jsp").
                forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        SettingDAO sdb = new SettingDAO();
        String sid = request.getParameter("sid");
       
        int type_id = Integer.parseInt(request.getParameter("type"));
        String name = request.getParameter("name");
        String value = request.getParameter("value");
        int order = Integer.parseInt(request.getParameter("order"));
        String note = request.getParameter("note");
        int status;
        if (request.getParameter("status").equals("Active")) {
            status = 1;
        } else {
            status = 0;
        }

        Setting s = new Setting( name, value ,type_id, order,note, status);
        sdb.update(s, Integer.parseInt(sid));
//        PrintWriter writer = response.getWriter();
//
//        // build HTML code
//        String htmlRespone = "<html>";
//        htmlRespone += "<h2>Your setting_id is: " + sid + "<br/>";
//        htmlRespone += "Your type is: " + type_id + "<br/>";
//        htmlRespone += "Your title is: " + name + "<br/>";
//        htmlRespone += "Your value is: " + value + "<br/>";
//        htmlRespone += "Your order is: " + order + "<br/>";
//        htmlRespone += "Your status is: " + status + "</h2>";
//        htmlRespone += "</html>";
//
//        // return response
//        writer.println(htmlRespone);
                ArrayList<Setting> listSetting = sdb.getAllSetting();
               
                request.setAttribute("listSetting", listSetting);
                request.getRequestDispatcher("SPM_setting_list.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
