/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Sach;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SachController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Sach s = new Sach();
        ArrayList<Sach> data = new ArrayList<>();
        data = s.getListSach();
        ArrayList<Sach> list = new ArrayList<>();
        list = s.getListSach();
        //
        req.setAttribute("data", data);
        req.setAttribute("list", list);
        req.getRequestDispatcher("ListSach.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String id_sach = req.getParameter("id_sach");
//        String ten_sach = req.getParameter("ten_sach");
//        String the_loai = req.getParameter("the_loai");
//        String tac_gia = req.getParameter("tac_gia");
//        String nha_xuat_ban = req.getParameter("nha_xuat_ban");
//        String nam_xuat_ban = req.getParameter("nam_xuat_ban");
//        String mo_ta = req.getParameter("mo_ta");

//        Sach s = new Sach(id_sach, ten_sach, the_loai, tac_gia, nha_xuat_ban, nam_xuat_ban, mo_ta);
        Sach s = new Sach();
        ArrayList<Sach> list1 = new ArrayList<>();
        list1 = s.getListSach();
        //
        String search_sach = req.getParameter("search_sach");
        String the_loai = req.getParameter("theloai");

        ArrayList<Sach> list = s.FindSachbyName(search_sach);
        ArrayList<Sach> type = s.FindSachbytheloai(the_loai);
        //req.setAttribute("data", list);
        req.setAttribute("data", type);
        req.setAttribute("list", list1);
    
        req.getRequestDispatcher("ListSach.jsp").forward(req, resp);
    }

}
