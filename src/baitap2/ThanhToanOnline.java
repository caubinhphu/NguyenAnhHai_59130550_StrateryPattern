/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Hai Tran Do
 */
public class ThanhToanOnline implements IThanhToan {

    @Override
    public double thanhToan(int tienHang) {
        return tienHang < 1e6 ? tienHang * 0.95 : tienHang * 0.93;
    }
    
}
