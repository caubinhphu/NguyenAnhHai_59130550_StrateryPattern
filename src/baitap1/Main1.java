/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Hai Tran Do
 */
public class Main1 {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ctx.tinh(75, 12));
        ctx.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + ctx.tinh(54, 78));
    }
}
