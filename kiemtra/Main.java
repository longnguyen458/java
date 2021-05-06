package kiemtra;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số hóa đơn : ");
	        int soHD = scanner.nextInt();
	       ChiTietHoaDon[] hoadon1 = new  ChiTietHoaDon[soHD];
	       ChiTietHoaDon tg = new  ChiTietHoaDon();
	       for (int i = 0; i < soHD; i++) {
	            System.out.println("Nhập thông tin hoa đơn thứ " + (i + 1) + ":");
	            hoadon1[i].nhap();
	       }
	       System.out.println("Thông tin của các hóa đơn vừa nhập: ");
	       for (int i = 0; i < soHD; i++) {
	            hoadon1[i].in();
	       } 
	       for (int i = 0; i < soHD -1; i++) {
	    	   for (int j = i+1; i < soHD; j++) {
		           if(hoadon1[i].Tien() > hoadon1[j].Tien()) {
		        	   tg=hoadon1[i];
		        	   hoadon1[i]=hoadon1[j];
		        	   hoadon1[j]=tg;
		           }
		       }
	       }
	       System.out.println("Thông tin của các hóa đơn sau sắp xếp: ");
	       for (int i = 0; i < soHD; i++) {
	            hoadon1[i].in();
	       }
	      
	       for (int i = 0; i < soHD -1; i++) {
	    	   for (int j = i+1; i < soHD; j++) {
		           if(hoadon1[i].Tien() < hoadon1[j].Tien()) {
		        	   tg=hoadon1[i];
		        	   hoadon1[i]=hoadon1[j];
		        	   hoadon1[j]=tg;
		           }
		       }
	       }
	       System.out.println("Thông tin của hóa đơn ít tiền nhất là: ");
	       tg.in();
	       
	 }     
}

