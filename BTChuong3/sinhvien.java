package helloword;

import java.util.Scanner;

public class sinhvien {
	public static void main(String[] args) {
		SV mot = new SV();
		mot.nhap();
		mot.in();
		
	}
}
class SV {
	 		String hoTen;
	 		int maSV;
	 		String diaChi;
	 		String lopHoc;
	 		void nhap() {
	 			System.out.println("Hãy nhập thông tin sinh viên");
	 	        Scanner sc = new Scanner(System.in);
	 	        System.out.println("Nhập mã số sinh viên: ");
	 	        maSV= sc.nextInt();
	 	        System.out.println("Nhập họ và tên sinh viên: ");
	 	        hoTen = sc.next();
	 	        System.out.println("Nhập địa chỉ sinh viên: ");
	 	        diaChi= sc.next();
	 	        System.out.println("Nhập lớp học: ");
	 	        lopHoc = sc.next();  
	 	        sc.close();
	 	    }
	 		void in() {
	 	        System.out.println("Mã số sinh viên: "+maSV);
	 	        
	 	        System.out.println("Họ và tên sinh viên: "+hoTen);
	 	        
	 	        System.out.println("Địa chỉ sinh viên: "+diaChi);
	 	        
	 	        System.out.println("Lớp học: "+lopHoc);
	 	    }
}