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
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class RegisterController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.setContentType("text/html;charset=UTF-8");
                 req.getRequestDispatcher("Register.jsp").forward(req, resp);

         try ( PrintWriter out = resp.getWriter()) {
            try {
                String account = req.getParameter("account");
                String pass = req.getParameter("pass");
                String repass = req.getParameter("repass");
                String name = req.getParameter("name");
                boolean check = true;

                if (account.isEmpty()) {
                    check = false;
                    req.setAttribute("accountEr", "!!!");
                }
                if (pass.isEmpty()) {
                    check = false;
                    req.setAttribute("passEr", "!!!");
                }
                if (repass.isEmpty()) {
                    check = false;
                    req.setAttribute("repassEr", "!!!");
                } else if (!pass.equals(repass)) {
                    check = false;
                    req.setAttribute("repassEr", "mật khẩu không giống");
                }
                if (name.isEmpty()) {
                    check = false;
                    req.setAttribute("nameEr", "!!!");
                }
                if (check == true) {
                    User newaccount = new User(account, pass, name);
                    newaccount.AddUser() ;
                    req.setAttribute("createMessage", "CREATE SUCCESSFULLY !!!");
                    req.getRequestDispatcher("Login.jsp").forward(req, resp);
                } else {
                    req.setAttribute("createMessage", "CREATE FAIL !!!");
                    req.getRequestDispatcher("Register.jsp").forward(req, resp);
                }

            } catch (Exception e) {
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
