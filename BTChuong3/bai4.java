package baitapC3;

import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		SV so[] = null,tg;
        int n = 0;
        Scanner sc = new Scanner(System.in); 
		System.out.println("Nhập số lương sinh viên cần khai báo: ");
        n = sc.nextInt();
        so = new SV[n];
        for (int i = 0; i < n; i++) {
             System.out.println("Sinh viên thứ " + (i + 1)+": ");
             so[i] = new SV();
             so[i].nhap();
        }
        System.out.println("Danh sách sinh viên đã nhập: ");
        for (int i = 0; i < n; i++) {
            so[i].in();
       }
    	for( int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    		if(so[i].dtb() < so[j].dtb())
    			{tg=so[i];so[i]=so[j];so[j]=tg;}			
    			}
    		}
    	System.out.println("Danh sách sinh viên đã sắp xếp: ");
        for (int i = 0; i < n; i++) {
            so[i].in();
       }
        sc.close();
	}
}
class SV{
	String hoten,gioitinh,ns,lop;
	float dtoan, dly, dhoa;
	void nhap() {
		Scanner sc = new Scanner(System.in); 
        System.out.println("Nhập họ và tên: ");
        hoten = sc.next();
        System.out.println("Nhập ngày sinh:");
        ns = sc.next();
        System.out.println("Nhập giới tính(Nam/Nữ):");
        gioitinh = sc.next();
        System.out.println("Nhập lớp học: ");
        lop = sc.next();
        System.out.println("Nhập điểm toán:");
        dtoan = sc.nextFloat();
        System.out.println("Nhập điểm lý:");
        dly = sc.nextFloat();
        System.out.println("Nhập điểm hóa:");
        dhoa = sc.nextFloat(); 
	}
	void in() {
		System.out.println("Họ và tên: "+hoten);
		
        System.out.println("Ngày sinh: "+ns);
        
        System.out.println("Giới tính: "+gioitinh);
        
        System.out.println("Lớp học: "+lop);
        
        System.out.println("Điểm toán: "+dtoan);
        
        System.out.println("Điểm lý: "+dly);
      
        System.out.println("Điểm hóa: "+dhoa);
        
        System.out.println("Điểm Trung bình: "+dtb());
	}
	float dtb() {
		return (dtoan+dly+dhoa)/3;
	}
}