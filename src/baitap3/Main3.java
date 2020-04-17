/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Hai Tran Do
 */
public class Main3 {
    public static void main(String[] args) throws ParseException {
        // tạo đối tượng format Date
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
        
        // tạo đối tượng quản lý sinh viên
        QLSV quanLy = new QLSV();
        
        // thêm sinh sinh vào đối tượng quản lý
        quanLy.them(new SinhVien("Nguyen Sinh Mot", formaterDate.parse("1/1/1999"), 8.6f));
        quanLy.them(new SinhVien("Nguyen Sinh Hai", formaterDate.parse("23/10/1999"), 6.6f));
        quanLy.them(new SinhVien("Nguyen Sinh Ba", formaterDate.parse("14/11/1999"), 9.6f));
        quanLy.them(new SinhVien("Nguyen Sinh Bon", formaterDate.parse("2/10/1999"), 5.3f));
        quanLy.them(new SinhVien("Nguyen Sinh Nam", formaterDate.parse("4/10/1999"), 8.8f));
        
        // in thông tin danh sách sinh viên
        System.out.println("Danh sách sinh viên");
        quanLy.inDs();
        
        // sắp xếp (tăng dần) ds sinh viên theo tên
        quanLy.setSoSanh(new SoSanhTheoTen());
        quanLy.sapXep();
        System.out.println("\nDanh sách sinh viên (sắp xếp theo tên)");
        quanLy.inDs();
        
        // sắp xêp (tăng dần) ds sinh viên theo điểm
        quanLy.setSoSanh(new SoSanhTheoDiem());
        quanLy.sapXep();
        System.out.println("\nDanh sách sinh viên (sắp xếp theo điểm TB)");
        quanLy.inDs();
    }
}
