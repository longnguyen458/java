package helloword;

import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
	
			System.out.println("Nhập các số A: ");
			a = scanner.nextInt();
			
		  if(a%2==0) {
			  System.out.println("Đây là số chẵn ");
		  }else {
			  System.out.println("Đây là số lẻ");
		  }
		  scanner.close();
	}
}	

