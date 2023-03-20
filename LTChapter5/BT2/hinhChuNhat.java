/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class hinhChuNhat extends Hinh {
    Scanner sc = new Scanner(System.in);
    private float cd;
    private float cr;
   hinhChuNhat(){
   }
   hinhChuNhat(float cd, float cr){
       this.cd=cd;
       this.cr=cr;
   }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }
    @Override
    public double dienTich(){
        setDt(cd*cr);
        return getDt();
    }
   public void nhapHinhChuNhat(){
       System.out.println("nhap chieu dai hinh chu nhat: ");
       cd = sc.nextFloat();
       System.out.println("Nhap chieu rong hinh chu nhat: ");
       cr = sc.nextFloat();
       
   }

    @Override
    public String toString() {
        return "hinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }
   
}
