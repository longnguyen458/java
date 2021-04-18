package main;


import Hinhhoc.hinhchunhat;
import Hinhhoc.hinhtron;
import Hinhhoc.hinhvuong;
import Hinhhoc.hinhtru;
public class Mainclass {

   public static void main(String[] args) {
       hinhtron HT = new hinhtron();
       HT.xuatTen();
       HT.nhapBanKinh();
       HT.tinhChuVi();
       HT.tinhDienTich();
       HT.inChuVi();
       HT.inDienTich();

      
       hinhtru  HT1 = new hinhtru();
       HT1.xuatTen();
       HT1.nhapChieuCao();
       HT1.tinhTheTich();
       HT1.inTheTich();

     
       hinhchunhat HCN = new hinhchunhat();
       HCN.xuatTen();
       HCN.nhapChieuDai();
       HCN.nhapChieuRong();
       HCN.tinhChuVi();
       HCN.tinhDienTich();
       HCN.inChuVi();
       HCN.inDienTich();

       
       hinhvuong HV = new hinhvuong();
       HV.xuatTen();
       HV.nhapCanh();
       HV.tinhChuVi();
       HV.tinhDienTich();
       HV.inChuVi();
       HV.inDienTich();
   }

}
