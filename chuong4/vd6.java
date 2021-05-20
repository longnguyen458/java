package chuong4;

import java.util.ArrayList;
import java.util.Scanner;
public class vd6 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cac phan tu cua mang");
		int n = sc.nextInt();
		int number;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap cac phan tu thu "+i+" mang");
				number = sc.nextInt();
				arr1.add(number);
		}
		int max =arr1.get(0);
			for (int i = 0;i< arr1.size();i++) {
				if (arr1.get(i) > max) {
					max = arr1.get(i);
				}
			}
			System.out.println("Phan Max tu cua mang:"+max);	
			sc.close();
	}
}
