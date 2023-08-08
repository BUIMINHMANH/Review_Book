/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String account = req.getParameter("account");
            String pass = req.getParameter("pass");
            User u = new User(account, pass);
            boolean check = u.CheckLogin();
            if (check) {
                // lưu thông tin login vào session
                HttpSession session = req.getSession();
                session.setAttribute("account", u);
                 
                User user = u.getUserByAccountAndPass(u);
                session.setAttribute("account_name", user.getName());

//            req.getRequestDispatcher("home.jsp").forward(req, resp);
                resp.sendRedirect("HomeController");
            } else {
                resp.sendRedirect("LoginController");
            }
        } catch (Exception e) {
        }
    }

}
