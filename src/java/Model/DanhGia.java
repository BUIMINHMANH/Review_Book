/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class DanhGia {

    String id_cmt, id_user, id_sach, name, danh_gia, nhan_xet_cua_user, ten_sach, ngay,gio;

    public String getTen_sach() {
        return ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        this.ten_sach = ten_sach;
    }

    public DanhGia() {
        connect();
    }

    public DanhGia(String id_cmt, String id_user, String id_sach, String name, String danh_gia, String nhan_xet_cua_user, String ngay, String gio) {
        this.id_cmt = id_cmt;
        this.id_user = id_user;
        this.id_sach = id_sach;
        this.name = name;
        this.danh_gia = danh_gia;
        this.nhan_xet_cua_user = nhan_xet_cua_user;
        this.ngay = ngay;
        this.gio = gio;
        connect();
    }

    public DanhGia(String id_cmt, String id_user, String id_sach, String name, String danh_gia, String nhan_xet_cua_user, String ten_sach, String ngay, String gio) {
        this.id_cmt = id_cmt;
        this.id_user = id_user;
        this.id_sach = id_sach;
        this.name = name;
        this.danh_gia = danh_gia;
        this.nhan_xet_cua_user = nhan_xet_cua_user;
        this.ten_sach = ten_sach;
        this.ngay = ngay;
        this.gio = gio;
        connect();
    }

    public String getId_cmt() {
        return id_cmt;
    }

    public void setId_cmt(String id_cmt) {
        this.id_cmt = id_cmt;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_sach() {
        return id_sach;
    }

    public void setId_sach(String id_sach) {
        this.id_sach = id_sach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDanh_gia() {
        return danh_gia;
    }

    public void setDanh_gia(String danh_gia) {
        this.danh_gia = danh_gia;
    }

    public String getNhan_xet_cua_user() {
        return nhan_xet_cua_user;
    }

    public void setNhan_xet_cua_user(String nhan_xet_cua_user) {
        this.nhan_xet_cua_user = nhan_xet_cua_user;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    
    
    

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<DanhGia> Comment(int id_sach) {
        ArrayList<DanhGia> data = new ArrayList<DanhGia>();
        try {
            String query = "select * from Danh_gia where id_sach = ? and xac_thuc = 1";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id_sach);
            rs = ps.executeQuery();

            while (rs.next()) {
                String idcmt = String.valueOf(rs.getInt(1));
                String idsach = String.valueOf(rs.getInt(3));
                String iduser = String.valueOf(rs.getInt(2));
                String name = rs.getString(4);
                String danhgia = String.valueOf(rs.getInt(5));
                String cmt = rs.getString(6);
                String ngay = String.valueOf(rs.getDate(8));
                String gio = String.valueOf(rs.getTime(9));
                data.add(new DanhGia(idcmt, iduser, idsach, name, danhgia, cmt, ngay,gio));
            }
        } catch (Exception e) {
            System.out.println("comment " + e);
        }
        return data;
    }

    public ArrayList<DanhGia> DuyetComment() {
        ArrayList<DanhGia> data = new ArrayList<DanhGia>();
        try {
            String query = "select dg.*,s.ten_sach from Danh_gia dg inner join Sach s \n"
                    + "on dg.id_sach = s.id_sach\n"
                    + "where xac_thuc = 0";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                String idcmt = String.valueOf(rs.getInt(1));
                String idsach = String.valueOf(rs.getInt(3));
                String iduser = String.valueOf(rs.getInt(2));
                String name = rs.getString(4);
                String danhgia = String.valueOf(rs.getInt(5));
                String ngay = String.valueOf(rs.getDate(8));
                String gio = String.valueOf(rs.getTime(9));
                String cmt = rs.getString(6);
                String ten_sach = rs.getString(10);
                data.add(new DanhGia(idcmt, iduser, idsach, name, danhgia, cmt, ten_sach, ngay,gio));
            }
        } catch (Exception e) {
            System.out.println("DuyetComment:  " + e);
        }
        return data;
    }

    public void DanhGiaSach(int id_user, int id_sach, String name, String danh_gia, String nhan_xet_cua_user) {
        try {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            Date date =new Date();
            
            String ngay = f.format(date);
            String gio = java.time.LocalTime.now().toString();
            gio =gio.substring(0, 8);
            String strSelect = "insert into Danh_gia values(?,?,?,?,?,0,?,?)";
            ps = conn.prepareStatement(strSelect);
            ps.setInt(1, id_user);
            ps.setInt(2, id_sach);
            ps.setString(3, name);
            ps.setString(4, danh_gia);
            ps.setString(5, nhan_xet_cua_user);
            ps.setDate(6, java.sql.Date.valueOf(ngay));
            
            ps.setTime(7,Time.valueOf(gio));
            ps.execute();
            System.out.println("runnable");

        } catch (Exception e) {
            System.out.println("DanhGiaSach: " + e.getMessage());
        }

    }

    private void connect() {
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

    public void XetDuyetComment(int cmt) {
        try {
            String strSelect = "UPDATE [Danh_gia]\n"
                    + "   SET \n"
                    + "      [xac_thuc] = 1\n"
                    + " WHERE id_cmt = ? ";
            ps = conn.prepareStatement(strSelect);
            ps.setInt(1, cmt);
            ps.execute();

        } catch (Exception e) {
            System.out.println("XetDuyetComment: " + e.getMessage());
        }
    }
}
