
package BT2;

import java.util.Scanner;
public class main {

    private static hinhTron h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       hinhChuNhat cn = new hinhChuNhat();
       hinhTron tr = new hinhTron();
       danhSachHinh dsh = new danhSachHinh();
       System.out.println("Chon loai hinh: 0 - hinh tron / 1 - hinh chu nhat");
        int choose = sc.nextInt();
        if (choose == 0){
            System.out.println("Nhap ban kinh hinh tron: ");
            float r= sc.nextFloat();
            dsh.themHinh(h);
            dsh.inDanhSachHinh();
        }
        if (choose == 1){
            System.out.println("Nhap chieu dai cua hinh chu nhat: ");
            float cd= sc.nextFloat();
            System.out.println("Nhap chieu rong cua hinh chu nhat: ");
            float cr=sc.nextFloat();
            dsh.themHinh(h);
            cn.dienTich();
            dsh.inDanhSachHinh();
        }
            
        }
    
    
}
