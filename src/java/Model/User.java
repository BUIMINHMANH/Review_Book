/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class User {

    private int user_id;
    private String account;
    private String pass;
    private String name;

    public User() {
        connect();
    }

    public User(String account, String pass, String name) {
        this.account = account;
        this.pass = pass;
        this.name = name;
        connect();
    }

    public User(String account, String pass) {
        this.account = account;
        this.pass = pass;
        connect();
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean CheckLogin() {
        try {
            String query = "select * from Users where account like ? and pass like ?";

            // dòng dưới tự thêm
            conn = (new DBContext()).connection;

            ps = conn.prepareStatement(query);
            ps.setString(1, account);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("CheckLogin: " + e.getMessage());

        }
        return false;
    }

    private void connect() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        try {
            conn = (new DBContext()).connection;
            if (conn != null) {
                System.out.println("Connect Success!");
            } else {
                System.out.println("Connect Fail!");
            }
        } catch (Exception e) {

        }

    }

    public boolean AddUser() {
        try {

            String strSelect = "insert into Users values(?,?,?)";
            ps = conn.prepareStatement(strSelect);
            ps.setString(1, account);
            ps.setString(2, pass);
            ps.setString(3, name);

            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("AddUser: " + e.getMessage());
        }
        return false;
    }

    public User getUserByAccountAndPass(User u) {
        try {
            String query = "select * from Users where account like ? and pass like ?";

            // dòng dưới tự thêm
            conn = (new DBContext()).connection;
            ps = conn.prepareStatement(query);
            ps.setString(1, u.account);
            ps.setString(2, u.pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setName(rs.getString("name"));
                return user;
            }

        } catch (Exception e) {
            System.out.println("CheckLogin: " + e.getMessage());

        }
        return null;
    }

    public User getUserByAccountName(String account_name) {
        try {
            String query = "SELECT [id_user]\n"
                    + "      ,[name]\n"
                    + "  FROM [Users] where name like ?";

            // dòng dưới tự thêm
            conn = (new DBContext()).connection;
            ps = conn.prepareStatement(query);
            ps.setString(1, account_name);
            rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt("id_user"));
                user.setName(rs.getString("name"));
                return user;
            }

        } catch (Exception e) {
            System.out.println("CheckLogin: " + e.getMessage());

        }
        return null;
    }

}
