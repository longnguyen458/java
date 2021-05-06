package kiemtra;
import java.util.Scanner;
public class HoaDon {
public String SoHD ,Ten, NgayBan;
	
	public  void nhap() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Nhập số HD: ");
	     SoHD = sc.next();
	     System.out.println("Nhập tên: ");
	     Ten = sc.next();
	     System.out.println("Nhập số ngày bán: ");
	     NgayBan = sc.next();
	      
	}
	public void in() {
			System.out.println("Thông tin hóa đơn");
		 	System.out.println("Số hóa đơn: "+SoHD);
	        System.out.println("Tên khách hàng: "+Ten);
	        System.out.println("Ngày bán: "+NgayBan);
	}
}
