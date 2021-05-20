package chuong4;

import java.util.ArrayList;
public class vd2 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		System.out.println("Cac phan tu trong mang la:");
			for (int number : arr1) {
				System.out.println(number+ "\t");
			}
	}
}
