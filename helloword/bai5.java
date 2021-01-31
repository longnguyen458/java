package helloword;

import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
		int a,tong=0;
		Scanner scanner = new Scanner(System.in);
		while(tong<100) {
			System.out.println("Nhập các số A: ");
			a = scanner.nextInt();
			tong+=a;
		}
		System.out.println("Tổng các số: "+tong);
		  scanner.close();
	}
}	
