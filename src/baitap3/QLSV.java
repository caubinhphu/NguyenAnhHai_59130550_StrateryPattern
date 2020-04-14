/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;

/**
 *
 * @author Hai Tran Do
 */
public class QLSV {
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    ISoSanh soSanh;

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    // methods
    // thêm sinh viên vào danh sách
    public void them(SinhVien sv) {
        dsSinhVien.add(sv);
    }
    // sắp xếp danh sách sinh viên (sắp xếp tăng dần theo tiêu chí)
    public void sapXep() {
        dsSinhVien.sort((a, b) -> soSanh.soSanh((SinhVien)a, (SinhVien)b));
    }
    // in ds sinh viên
    public void inDs() {
        dsSinhVien.forEach(sv -> System.out.println("Sinh viên: " + sv.getThongTin()));
    }
}
