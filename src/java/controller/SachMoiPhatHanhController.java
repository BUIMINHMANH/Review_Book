/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import Model.Sach;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SachMoiPhatHanhController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
//       Sach s = new Sach();
//        String theloai = req.getParameter("the_loai");
//        ArrayList<Sach> listTheloai = s.FindSachbytheloai(theloai);
//        req.setAttribute("listByTheLoai", listTheloai);
//        req.getRequestDispatcher("View/theloai.jsp").forward(req, resp);
        
        Sach s = new Sach();
        ArrayList<Sach> listSachMoiPhatHanh = s.SachMoi();
        req.setAttribute("sachmoiphathanh", listSachMoiPhatHanh);
        req.getRequestDispatcher("View/sachmoiphathanh.jsp").forward(req, resp);
    } 

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    }

}
