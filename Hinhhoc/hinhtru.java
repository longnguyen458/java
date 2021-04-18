package Hinhhoc;
import java.util.Scanner;
public class hinhtru extends hinhtron{

	public float chieuCao;
	
	// Constructor
	public hinhtru() {
	    ten = "Hình Trụ";
	}
	
	public void nhapChieuCao() {
	    nhapBanKinh();
	
	    System.out.println("Chiều cao = ");
	    Scanner scanner = new Scanner(System.in);
	    chieuCao = scanner.nextFloat();
	}
	
	public void tinhTheTich() {
	    tinhDienTich();
	    theTich = dienTich * chieuCao;
	}
}	