package helloword;

import java.util.Scanner;
public class bai6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tong =1, n, i =1;
		System.out.println("Nhập vào số nguyên: ");
		n = scanner.nextInt();	
 		do {
 			tong *= i;
             i++;
 		}while(i<=n);
 		System.out.println(tong);
 		scanner.close();
}
}