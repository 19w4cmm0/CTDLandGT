/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        chuyenXe cx = new chuyenXe();
        chuyenXeNoiThanh noi = new chuyenXeNoiThanh(257, "Nguyen", 255, 7, 75, 8);
        chuyenXeNgoaiThanh ngoai = new chuyenXeNgoaiThanh(257,"asofh", 345, 8," haof", 4);
        System.out.println("Danh thu cua xe noi thanh la: "+ noi.getDanhThu());
        System.out.println("Danh thu cua xe ngoai thanh la: "+ ngoai.getDanhThu());
        int tong= (int) (noi.getDanhThu() + ngoai.getDanhThu());
        System.out.println("Tong danh thu cua tat ca loai xe la: "+ tong);
        
    }
}
