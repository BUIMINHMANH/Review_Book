/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Context.DBContext;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Sach {

    String id_sach, ten_sach, the_loai, tac_gia, nha_xuat_ban, nam_xuat_ban, mo_ta, luot_danh_gia, trung_binh_danh_gia, review_sach, hinh_anh;

    public Sach() {
        connect();
    }

    public Sach (String id_sach, String ten_sach, String the_loai, String tac_gia, String nha_xuat_ban, String nam_xuat_ban, String mo_ta, String review_sach, String hinh_anh) {
        this.id_sach = id_sach;
        this.ten_sach = ten_sach;
        this.the_loai = the_loai;
        this.tac_gia = tac_gia;
        this.nha_xuat_ban = nha_xuat_ban;
        this.nam_xuat_ban = nam_xuat_ban;
        this.mo_ta = mo_ta;
        this.review_sach = review_sach;
        this.hinh_anh = hinh_anh;
//        this.hinh_anh = hinh_anh;
        connect();
    }

    public String getId_sach() {
        return id_sach;
    }

    public void setId_sach(String id_sach) {
        this.id_sach = id_sach;
    }

    public String getTen_sach() {
        return ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        this.ten_sach = ten_sach;
    }

    public String getThe_loai() {
        return the_loai;
    }

    public void setThe_loai(String the_loai) {
        this.the_loai = the_loai;
    }

    public String getTac_gia() {
        return tac_gia;
    }

    public void setTac_gia(String tac_gia) {
        this.tac_gia = tac_gia;
    }

    public String getNha_xuat_ban() {
        return nha_xuat_ban;
    }

    public void setNha_xuat_ban(String nha_xuat_ban) {
        this.nha_xuat_ban = nha_xuat_ban;
    }

    public String getNam_xuat_ban() {
        return nam_xuat_ban;
    }

    public void setNam_xuat_ban(String nam_xuat_ban) {
        this.nam_xuat_ban = nam_xuat_ban;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public String getLuot_danh_gia() {
        return luot_danh_gia;
    }

    public void setLuot_danh_gia(String luot_danh_gia) {
        this.luot_danh_gia = luot_danh_gia;
    }

    public String getTrung_binh_danh_gia() {
        return trung_binh_danh_gia;
    }

    public void setTrung_binh_danh_gia(String trung_binh_danh_gia) {
        this.trung_binh_danh_gia = trung_binh_danh_gia;
    }

    public String getReview_sach() {
        return review_sach;
    }

    public void setReview_sach(String review_sach) {
        this.review_sach = review_sach;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }
    
    

//    public String getHinh_anh() {
//        return hinh_anh;
//    }
//
//    public void setHinh_anh(String hinh_anh) {
//        this.hinh_anh = hinh_anh;
//    }
    // Khai bao cac thanh phan xu ly DB
    Connection conn; // Ket noi DB
    PreparedStatement ps; // Thuc thi cac cau lenh SQL
    ResultSet rs; // Luu tru du lieu va xu ly

    public ArrayList<Sach> getListSach() {
        ArrayList<Sach> data = new ArrayList<Sach>();
        try {
            String query = "select * from Sach";

            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id_sach = String.valueOf(rs.getInt(1));
                String ten_sach = rs.getString(2);
                String the_loai = rs.getString(3);
                String tac_gia = rs.getString(4);
                String nha_xuat_ban = rs.getString(5);
                String nam_xuat_ban = rs.getString(6);
                String mo_ta = rs.getString(7);
                String review_sach = rs.getString(8);
                String hinh_anh = rs.getString(9);
                
//                String hinh_anh = rs.getString(9);

                data.add(new Sach(id_sach, ten_sach, the_loai, tac_gia, nha_xuat_ban, nam_xuat_ban, mo_ta, review_sach, hinh_anh));
            }

        } catch (Exception e) {
            System.out.println("getListSach " + e);
        }
        return data;
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

    public void getSach(String id_sach) {
        try {
            String query = "select * from Sach where id_sach = ?";
//            stm = cnt.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            pstm.setInt(1, Integer.parseInt(id));
//            rs = stm.executeQuery(strSelect);
            ps = conn.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(id_sach));
            rs = ps.executeQuery();
            while (rs.next()) {
                this.id_sach = String.valueOf(rs.getInt(1));
                this.ten_sach = rs.getString(2);
                this.the_loai = rs.getString(3);
                this.tac_gia = rs.getString(4);
                this.nha_xuat_ban = rs.getString(5);
                this.nam_xuat_ban = rs.getString(6);
                this.mo_ta = rs.getString(7);
                this.review_sach = rs.getString(8);
//                this.hinh_anh = rs.getString(9);

            }
        } catch (Exception e) {
            System.out.println("getListProducts: " + e.getMessage());
        }
    }

    public ArrayList<Sach> FindSachbyName(String sach) {
        ArrayList<Sach> data = new ArrayList<Sach>();
        try {
            if (sach == null || sach.equals("")) {
                String query = "select * from Sach";
                ps = conn.prepareStatement(query);
                rs = ps.executeQuery();
            } else {
                String query = "select * from Sach where ten_sach like ?";
                ps = conn.prepareStatement(query);
                ps.setString(1, '%' + sach + '%');
                rs = ps.executeQuery();
            }

            while (rs.next()) {
                String id_sach = String.valueOf(rs.getInt(1));
                String ten_sach = rs.getString(2);
                String the_loai = rs.getString(3);
                String tac_gia = rs.getString(4);
                String nha_xuat_ban = rs.getString(5);
                String nam_xuat_ban = rs.getString(6);
                String mo_ta = rs.getString(7);
                String review_sach = rs.getString(8);
                String hinh_anh = rs.getString(9);

                data.add(new Sach(id_sach, ten_sach, the_loai, tac_gia, nha_xuat_ban, nam_xuat_ban, mo_ta, review_sach, hinh_anh));
            }

        } catch (Exception e) {
            System.out.println("getListSach " + e);
        }
        return data;
    }
    
    

    public ArrayList<Sach> FindSachbytheloai(String sach) {
        ArrayList<Sach> data = new ArrayList<Sach>();
        try {
            String query = "select * from Sach where the_loai like ?";

            ps = conn.prepareStatement(query);
            ps.setString(1, '%' + sach + '%');
            rs = ps.executeQuery();
            while (rs.next()) {
                String id_sach = String.valueOf(rs.getInt(1));
                String ten_sach = rs.getString(2);
                String the_loai = rs.getString(3);
                String tac_gia = rs.getString(4);
                String nha_xuat_ban = rs.getString(5);
                String nam_xuat_ban = rs.getString(6);
                String mo_ta = rs.getString(7);
                String review_sach = rs.getString(8);
                String hinh_anh = rs.getString(9);

                data.add(new Sach(id_sach, ten_sach, the_loai, tac_gia, nha_xuat_ban, nam_xuat_ban, mo_ta, review_sach, hinh_anh));
            }

        } catch (Exception e) {
            System.out.println("getListSach " + e);
        }
        return data;
    }

    public ArrayList<Sach> listTheLoai() {
        ArrayList<Sach> data = new ArrayList<Sach>();
        try {
            String query = "select DISTINCT  the_loai from Sach";

            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                Sach s = new Sach();
                String the_loai = rs.getString("the_loai");
                s.setThe_loai(the_loai);
                data.add(s);
            }

        } catch (Exception e) {
            System.out.println("getListSach " + e);
        }
        return data;
    }

    public ArrayList<Sach> SachMoi() {
        ArrayList<Sach> data = new ArrayList<Sach>();

        try {
            String query = "select * from Sach where nam_xuat_ban = '2023'";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Sach s = new Sach();
                String sachmoiphathanh = rs.getString("nam_xuat_ban");
                s.setId_sach(rs.getString("id_sach"));
                s.setTac_gia(rs.getString("tac_gia"));
                s.setTen_sach(rs.getString("ten_sach"));
                s.setMo_ta(rs.getString("mo_ta"));
                s.setThe_loai(rs.getString("the_loai"));
                s.setNha_xuat_ban(rs.getString("nha_xuat_ban"));
                s.setReview_sach(rs.getString("review_sach"));
//                s.setHinh_anh(rs.getString("hinh_anh"));
                s.setNam_xuat_ban(sachmoiphathanh);
                data.add(s);
            }

        } catch (Exception e) {
        }
        return data;
    }

    public ArrayList<Sach> listTopDanhGia() {
        ArrayList<Sach> data = new ArrayList<Sach>();

        try {
            String query = "select top 3 dg.id_sach,s.ten_sach,s.mo_ta,s.tac_gia,s.nam_xuat_ban,s.nha_xuat_ban,s.the_loai,s.review_sach,COUNT(dg.danh_gia) as luot_danh_gia\n"
                    + ",avg(dg.danh_gia) as trung_binh_danh_gia\n"
                    + "from Danh_gia dg inner join Sach s\n"
                    + "on dg.id_sach=s.id_sach\n"
                    + "group by dg.id_sach,s.ten_sach,s.mo_ta,s.tac_gia,s.nam_xuat_ban,s.nha_xuat_ban,s.the_loai,s.review_sach\n"
                    + "order by luot_danh_gia desc";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Sach s = new Sach();
                s.setTrung_binh_danh_gia(rs.getString("trung_binh_danh_gia"));
                s.setLuot_danh_gia(rs.getString("luot_danh_gia"));
                s.setTac_gia(rs.getString("tac_gia"));
                s.setTen_sach(rs.getString("ten_sach"));
                s.setMo_ta(rs.getString("mo_ta"));
                s.setThe_loai(rs.getString("the_loai"));
                s.setNha_xuat_ban(rs.getString("nha_xuat_ban"));
                s.setNam_xuat_ban(rs.getString("nam_xuat_ban"));
                s.setNam_xuat_ban(rs.getString("review_sach"));
//                s.setNam_xuat_ban(rs.getString("hinh_anh"));
                s.setId_sach(rs.getString("id_sach"));

                data.add(s);
            }

        } catch (Exception e) {
        }
        return data;
    }

    public boolean themSach(
            String ten_sach,
            String the_loai,
            String tac_gia,
            String nha_xuat_ban,
            String nam_xuat_ban,
            String mo_ta,
            String review_sach) {
        try {

            String strSelect = "INSERT INTO Sach \n"
                    + "(ten_sach,\n"
                    + "the_loai,\n"
                    + "tac_gia,\n"
                    + "nha_xuat_ban,\n"
                    + "nam_xuat_ban,\n"
                    + "mo_ta,\n"
                    + "review_sach) \n"
                    + "VALUES (?,?,?,?,?,?,?); ";
            ps = conn.prepareStatement(strSelect);
            ps.setString(1, ten_sach);
            ps.setString(2, the_loai);
            ps.setString(3, tac_gia);
            ps.setString(4, nha_xuat_ban);
            ps.setString(5, nam_xuat_ban);
            ps.setString(6, mo_ta);
            ps.setString(7, review_sach);

            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Add Sach: " + e.getMessage());
        }
        return false;
    }

    public void xoaSach(String id_sach) {
        try {

            String strSelect = "DELETE FROM [Sach]\n"
                    + "      WHERE id_sach = ?";
            ps = conn.prepareStatement(strSelect);
            ps.setString(1, id_sach);
            ps.execute();
        } catch (Exception e) {
            System.out.println("Xoa Sach: " + e.getMessage());
        }

    }
}
