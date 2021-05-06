package kiemtra;
import java.util.Scanner;

public class InTT extends KhachHang{
	 @Override
	 public void intt() {
	        System.out.println("Mã khách hàng: "+MaKH);
	        System.out.println("Tên khách hàng: "+Ten);
	        System.out.println("SDT khách hàng: "+SoDT);
	 }
	 
	 @Override
	    public void nhaptt() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập mã khách hàng: ");
	        MaKH = sc.next();
	        System.out.println("Nhập tên khách hàng: ");
	        Ten = sc.next();
	        System.out.println("Nhập số DT khách hàng: ");
	        SoDT = sc.next();
	        sc.close();
	    }
}
