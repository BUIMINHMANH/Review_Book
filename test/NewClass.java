
import Model.Sach;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NewClass {
    public static void main(String[] args) {
        Sach s = new Sach();
       
        ArrayList<Sach> list = s.FindSachbyName("Sách");
        for (Sach item : list) {
            System.out.println(item.getTen_sach()+item.getId_sach());
        }
    }
}
