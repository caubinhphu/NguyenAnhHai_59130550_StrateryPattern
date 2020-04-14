/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author Hai Tran Do
 */
public class Main2 {
    public static void main(String[] args) {
        // tạo hàng hóa
        HangHoa hh1 = new HangHoa("Áo thun nam", 100000, "Nhiều màu sắc");
        HangHoa hh2 = new HangHoa("Áo sơ mi nam", 250000, "Không nhăn, dài tay");
        HangHoa hh3 = new HangHoa("Áo thun nữ", 110000, "Phong cách");
        HangHoa hh4 = new HangHoa("Áo sơ mi nữ", 200000, "Font công sở");
        HangHoa hh5 = new HangHoa("Áo khoát", 350000, "Chất liệu cotton");
        
        GioHang gh1 = new GioHang();
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh1.them(hh1);
        gh1.them(hh2);
        gh1.them(hh3);
        gh1.them(hh4);
        gh1.them(hh5);
//        ArrayList<HangHoa> dsHangHoa1 = gh1.getDsHangHoa();
//        System.out.println("Danh sách hàng trong giỏ");
//        for (HangHoa hangHoa : dsHangHoa1) {
//            System.out.println("Hàng hóa: " + hangHoa.thongTinHH());
//        }
        gh1.inDs();
        System.out.println("Tổng tiền hàng: " + gh1.tongTienHang());
        System.out.println("Tổng tiền phải thanh toán: " + gh1.thanhToan());
        
        System.out.println("");
        
        GioHang gh2 = new GioHang();
        gh2.setHinhThucTT(new ThanhToanCOD());
        gh2.them(hh1);
        gh2.them(hh2);
//        ArrayList<HangHoa> dsHangHoa2 = gh1.getDsHangHoa();
//        System.out.println("Danh sách hàng trong giỏ");
//        for (HangHoa hangHoa : dsHangHoa2) {
//            System.out.println("Hàng hóa: " + hangHoa.thongTinHH());
//        }
        gh2.inDs();
        System.out.println("Tổng tiền hàng: " + gh2.tongTienHang());
        System.out.println("Tổng tiền phải thanh toán: " + gh2.thanhToan());
    }
}
