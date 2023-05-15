
package lab1_tuan4;

import java.util.Scanner;


public class GiaoDichNha extends GiaoDich{
    private String loaiNha, diaChi;
    private int choose;
    Scanner sc = new Scanner(System.in);
   public GiaoDichNha(){
       super();
   }
   public GiaoDichNha(String loaiNha, String diaChi){
       super();
       this.loaiNha=loaiNha;
       this.diaChi=diaChi;
   }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }
   public void nhap(){
       super.nhap();
       System.out.println("Nhap dia chi: ");
       diaChi = sc.nextLine();
       System.out.println("Nhap loai nha (0: cao cap, 1: thuong): ");
       choose = sc.nextInt();
       switch(choose){
           case 0:
               loaiNha="Cao cap";
               break;
           case 1:
               loaiNha="thuong";
               break;
           default:
               System.out.println("Chon so khong hop le");
               break;
                     
       }
   }

    @Override
    public String toString() {
        return super.toString()+",loai nha:"+this.loaiNha+", dia chi: "+this.diaChi;
    }
   
}
