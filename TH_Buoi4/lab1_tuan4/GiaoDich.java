
package lab1_tuan4;

import java.util.Scanner;


public class GiaoDich {
    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    private float dienTich;
    Scanner sc = new Scanner(System.in);
   public GiaoDich(){
       super();
   }
   public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich){
      this.maGiaoDich=maGiaoDich;
      this.ngayGiaoDich=ngayGiaoDich;
      this.donGia=donGia;
      this.dienTich=dienTich;
   }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
   public void nhap(){
       System.out.println("Nhap ma giao dich: ");
       maGiaoDich = sc.nextLine();
       System.out.println("Nhap ngay giao dich: ");
       ngayGiaoDich = sc.nextLine();
       System.out.println("Nhap don gia: ");
       donGia = Long.parseLong(sc.nextLine());
       System.out.println("Nhap dien tich: ");
       dienTich = Float.parseFloat(sc.nextLine());
   }

    
    @Override
    public String toString() {
        return "Ma giao dich: "+this.maGiaoDich+", ngay giao dich: "+this.maGiaoDich+", don gia: "+this.donGia+", dien tich: "+this.dienTich;
    }
    public void hien(){
        System.out.println("GiaoDich{" + "maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia + ", dienTich=" + dienTich + ", sc=" + sc + '}');
    
    }
}
