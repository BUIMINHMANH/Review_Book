/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DanhGia;
import Model.Sach;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DanhGiaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String id_sach = req.getParameter("id_sach");
//        DanhGia dg = new DanhGia();
//        dg.Comment(id_sach);
//        req.setAttribute("dg", dg);
    }
//        Sach s = new Sach();
//        String theloai = req.getParameter("the_loai");
//        ArrayList<Sach> listTheloai = s.FindSachbytheloai(theloai);
//        req.setAttribute("listByTheLoai", listTheloai);
//        req.getRequestDispatcher("View/theloai.jsp").forward(req, resp);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DanhGia dg = new DanhGia();
        int id_sach = Integer.parseInt(req.getParameter("sach_danh_gia"));
        String nguoi_danh_gia = req.getParameter("nguoi_danh_gia");
        String danh_gia = req.getParameter("danh_gia");
        String nhan_xet_cua_user = req.getParameter("nhan_xet_cua_user");
        User u = new User();
        u = u.getUserByAccountName(nguoi_danh_gia);
        dg.DanhGiaSach(u.getUser_id(), id_sach, u.getName(), danh_gia, nhan_xet_cua_user);
        resp.sendRedirect("DetailController?id_sach="+id_sach);
    }

}
