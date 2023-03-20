
package BT1;

public class chuyenXeNgoaiThanh extends chuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;
 chuyenXeNgoaiThanh(){}
 chuyenXeNgoaiThanh(int maSoChuyen, String hoTen, int soXe, float danhThu, String noiDen, int soNgayDiDuoc){
     super(maSoChuyen, hoTen, soXe, danhThu);
     this.noiDen=noiDen;
     this.soNgayDiDuoc=soNgayDiDuoc;
 }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
}
