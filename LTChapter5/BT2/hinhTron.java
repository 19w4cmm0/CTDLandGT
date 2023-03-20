
package BT2;

import java.util.Scanner;
public class hinhTron extends Hinh{
    Scanner sc = new Scanner(System.in);
    private float r;
   
    hinhTron(){}
    hinhTron(float r){
        this.r=r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
   @Override
   public double dienTich(){
       
        setDt(3.14*r*r);
        return getDt();
        
       
   }
   public void nhapHinhTron(){
       System.out.println("Nhap ban kinh: ");
       r= sc.nextFloat();
       
   }

    @Override
    public String toString() {
        return "hinhTron{" + "r=" + r + '}';
    }
       
   
    
}
