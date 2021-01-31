package helloword;

import java.util.Scanner;
public class giaithua {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a =1, n, i =1;
			System.out.println("Nhập vào số nguyên: ");
			n = scanner.nextInt();
//		
 		do {
 			a *= i;
//             tong += (double)1 / a;
             i++;
 		}while(i<=n);
 		System.out.println(a);
 		scanner.close();
}
}