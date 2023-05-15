
package lab1_tuan4;

import java.util.ArrayList;
import java.util.Scanner;


public class dsGiaoDich {
    ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
    ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<>();
    int soGiaoDichNha = 0, soGiaoDichDat=0;
    long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
    Scanner sc = new Scanner(System.in);
    
    public void nhapMangDat(){
        System.out.println("Nhap so giao dich dat: ");
        soGiaoDichDat = sc.nextInt();
        System.out.println("Nhap thong tin giao dich dat: ");
        for(int i=0; i< soGiaoDichDat; i++){
            System.out.println("nhap thong tin giao dich dat thu: " + (i+1) + ":");
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            giaoDichDat.nhap();
            arrGiaoDichDat.add(giaoDichDat);
        }
    }
        public void nhapMangNha(){
        System.out.println("Nhap so giao dich nha: ");
        soGiaoDichNha = sc.nextInt();
        System.out.println("Nhap thong tin giao dich nha: ");
        for(int i=0; i< soGiaoDichNha; i++){
            System.out.println("nhap thong tin giao dich nha thu: " + (i+1) + ":");
            GiaoDichNha giaoDichNha = new GiaoDichNha();
            giaoDichNha.nhap();
            arrGiaoDichNha.add(giaoDichNha);
        }
        }
    public void xuatMangDat(){
        System.out. println("Thong tin giao dich dat: ");
        for(int i = 0; i< arrGiaoDichDat.size(); i++){
            System.out.println(arrGiaoDichDat.get(i).toString());
        }
    }
    public void xuatMangNha(){
        System.out. println("Thong tin giao dich nha: ");
        for(int i = 0; i< arrGiaoDichNha.size(); i++){
            System.out.println(arrGiaoDichNha.get(i).toString());
        }
    }
    public void tinhTong(){
        for (int i=0; i< arrGiaoDichDat.size(); i++){
            if(arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")){
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich()*arrGiaoDichDat.get(i).getDonGia()*1.5;
                
            }
            else if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B")|| arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C")){
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich()*arrGiaoDichDat.get(i).getDonGia();
            }
        }
    }
    public void trungBinh(){
        trungBinhThanhTien = tongTienGiaoDichDat / (arrGiaoDichDat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);
    }
    public void giaoDichThang9(){
        System.out.println("Cac giao dich dat cua thang 9 nam 2013: ");
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            String[] dateGiaoDichDat = arrGiaoDichDat.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
                System.out.println(arrGiaoDichDat.get(i).toString());
            }
        }
         
        System.out.println("Cac giao dich nha cua thang 9 nam 2013: ");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            String[] dateGiaoDichNha = arrGiaoDichNha.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
                System.out.println(arrGiaoDichNha.get(i).toString());
            }
        }

    }
    public void size(){
        System.out.println("So luong giao dich dat: " +arrGiaoDichDat.size());
        System.out.println("So luong giao dich nha: " +arrGiaoDichNha.size());
    }
    public void menuChinh() {
System.out.println("------------- Moi ban lua chon -----------");
System.out.println("1. Nhap giao dich dat");
System.out.println("2. Xuat giao dich dat");
System.out.println("3. Nhap giao dich nha");
System.out.println("4. Xuat giao dich nha");
System.out.println("5. Tinh tong so luong cho tung loai");
System.out.println("6. trung binh thanh tien cua giao dich dat");
System.out.println("7. Giao dich thang 9 nam 2013");
System.out.println("----------- Chon so 0 de thoat ----------");
}


        
    
}
