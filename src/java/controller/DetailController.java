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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class DetailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DanhGia dg = new DanhGia();
        String id_sach = req.getParameter("id_sach");
        Sach s = new Sach();
        s.getSach(id_sach);
        ArrayList<DanhGia> listDanhGia = dg.Comment(Integer.parseInt(id_sach));
        req.setAttribute("s", s);
        req.getSession().setAttribute("id_sach_danh_gia", s.getId_sach());
        req.setAttribute("list_danh_gia", listDanhGia);
        req.getRequestDispatcher("View/reviewsach.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
