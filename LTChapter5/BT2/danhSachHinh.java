/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.ArrayList;
public class danhSachHinh {
    private ArrayList<Hinh>danhSach;
  public danhSachHinh(){
  this.danhSach= new ArrayList<Hinh>();}
  public danhSachHinh(ArrayList<Hinh>danhSach){
      this.danhSach=danhSach;
  }
  public void themHinh(Hinh h){
      this.danhSach.add(h); 
  }
  public void inDanhSachHinh(){
      for ( Hinh hinh : danhSach){
          System.out.println(hinh);
      }
  }
    
    
    
}
