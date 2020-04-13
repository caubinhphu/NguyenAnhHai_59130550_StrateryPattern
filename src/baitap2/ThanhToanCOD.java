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
public class ThanhToanCOD implements IThanhToan {

    @Override
    public double thanhToan(int tienHang) {
        return tienHang > 2e6 ? tienHang * 0.98 : tienHang;
    }
    
}
