package helloword;

import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		int a,b,tong,hieu,tich, thuong,du;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập các số A: ");
			a = scanner.nextInt();
			System.out.println("Nhập các số B: ");
			b = scanner.nextInt();
		}while(a<0 || b<0);
		tong=a+b;
		hieu=a-b;
		tich=a*b;
		thuong=a/b;
		du=a%b;
		  System.out.println("Tổng của các số vừa nhập là: "+ tong);
		  System.out.println("Hiệu của các số vừa nhập là: "+ hieu);
		  System.out.println("Tích của các số vừa nhập là: "+ tich);
		  System.out.println("Thương của các số vừa nhập là: "+ thuong);
		  System.out.println("Chia Dư của các số vừa nhập là: "+ du);
		  if(a==b) {
			  System.out.println("Hai số bằng nhau ");
		  }
		  else if(a>b) {
			  System.out.println("Số lớn hơn là A:"+a);
		  }else {
			  System.out.println("Số lớn hơn là B: "+b);
		  }
		  scanner.close();
	}
}	
		  
