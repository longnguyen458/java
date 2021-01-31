package helloword;

import java.util.Scanner;
public class bai3 {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int a, tuoi;
				String ten;
				System.out.println("Nhập vào tên: ");
				ten = scanner.nextLine();
				System.out.println("Nhập vào năm sinh: ");
				a = scanner.nextInt();
				tuoi = 2021-a;
				if(tuoi<16){
					System.out.println("Bạn "+ten+" ở độ tuổi vị thành niên"); 
				}
				if(tuoi >=16 && tuoi <18 ) {
					System.out.println("Bạn "+ten+" ở độ tuổi vị trưởng thành");
				}
				if(tuoi >18 ) {
					System.out.println("Bạn "+ten+" đã già");
				}
				scanner.close();
		}
	}


