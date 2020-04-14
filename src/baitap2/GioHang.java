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
public class GioHang {
    // attrs
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();
    
    // setter
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public ArrayList<HangHoa> getDsHangHoa() {
        return dsHangHoa;
    }
    
    // method
    // thêm hàng hóa vào giỏ
    public void them(HangHoa hangHoa) {
        dsHangHoa.add(hangHoa);
    }
    
    // Tổng tiền hàng
    public int tongTienHang() {
        int tong = 0;
        for (HangHoa hangHoa : dsHangHoa) {
            tong += hangHoa.getGia();
        }
        return tong;
    }
    
    public double thanhToan() {
        int tien = 0;
        for (HangHoa hangHoa : dsHangHoa) {
            tien += hangHoa.getGia();
        }
        return hinhThucTT.thanhToan(tien);
    }
}