
package BT1;


public class chuyenXe {
 private int maSoChuyen;
 private String hoTen;
 private int soXe;
 private float danhThu;
 chuyenXe(){}
 chuyenXe(int maSoChuyen, String hoTen, int soXe, float danhThu){
     super();
     this.maSoChuyen=maSoChuyen;
     this.hoTen=hoTen;
     this.soXe=soXe;
     this.danhThu=danhThu;
 }

    public int getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public float getDanhThu() {
        return danhThu;
    }

    public void setDanhThu(float danhThu) {
        this.danhThu = danhThu;
    }
  public float tongDanhThu(){
      return danhThu;
       
   }
    
    
    
}
