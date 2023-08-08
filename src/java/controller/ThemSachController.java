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

/**
 *
 * @author ADMIN
 */
public class ThemSachController extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("View/ad/themsach.jsp").forward(req, resp);
    }

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String ten_sach = req.getParameter("ten_sach");
        String the_loai = req.getParameter("the_loai");
        String tac_gia = req.getParameter("tac_gia");
        String nha_xuat_ban = req.getParameter("nha_xuat_ban");
        String nam_xuat_ban = req.getParameter("nam_xuat_ban");
        String mo_ta = req.getParameter("mo_ta");
        String review_sach = req.getParameter("review_sach");
//        String hinh_anh = req.getParameter("hinh_anh");
        Sach s = new Sach();
        boolean check = s.themSach(ten_sach, the_loai, tac_gia, nha_xuat_ban, nam_xuat_ban, mo_ta, review_sach) ;
        if (check) {
            req.getSession().setAttribute("message", "Thêm thành công");
            req.getRequestDispatcher("View/ad/themsach.jsp").forward(req, resp);
        }else{
            req.getSession().setAttribute("message", "Thêm thất bại");
             req.getRequestDispatcher("View/ad/themsach.jsp").forward(req, resp);
        }
 }

}
