package kiemtra;

import java.util.Scanner;

public class ChiTietHoaDon extends HoaDon {
	public String MaSP ,TenSP;
	public int DonGia, SoLuong;
	 @Override
	    public void nhap() {
		 	Scanner sc = new Scanner(System.in);
	        super.nhap();
	        System.out.print("Nhập mã SP: ");
	        MaSP = sc.next();
	        System.out.print("Nhập Tên SP: ");
	        TenSP = sc.next();
	        System.out.print("Nhập số lượng SP: ");
	        SoLuong = sc.nextInt();
	        System.out.print("Nhập đơn giá SP: ");
	        DonGia = sc.nextInt();
	        
	    }
	 public int Tien() {
		 return SoLuong * DonGia;
	 }
	 @Override
	    public void in() {
		 	
	        super.in();
	        System.out.print("Mã SP: "+MaSP);
	     
	        System.out.print("Nhập Tên SP: "+TenSP);
	      
	        System.out.print("Nhập số lượng SP: "+SoLuong);
	        
	        System.out.print("Nhập đơn giá SP: "+DonGia);
	        
	        System.out.print("Tổng Tiền của HD: "+Tien());
	       
	    }
}
