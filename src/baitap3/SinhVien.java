/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hai Tran Do
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public String getThongTin() {
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyy");
        return "Họ tên: " + this.hoTen + ", ngày sinh: " + formaterDate.format(this.ngaySinh) + ", điểm TB: " + this.diemTB;
    }
}
