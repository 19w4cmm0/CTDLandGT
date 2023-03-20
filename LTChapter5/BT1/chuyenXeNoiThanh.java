
package BT1;


public class chuyenXeNoiThanh extends chuyenXe {
    private int soTuyen;
    private int soKm;
  chuyenXeNoiThanh(){
      
  }
  chuyenXeNoiThanh(int maSoChuyen, String hoTen, int soXe, float danhThu, int soTuyen, int soKm){
      super(maSoChuyen, hoTen, soXe, danhThu);
      this.soKm=soKm;
      this.soTuyen=soTuyen;
  }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
    
}
