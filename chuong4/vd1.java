package chuong4;

import java.util.ArrayList;

public class vd1 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("JAVA");
		arr.add("PHP");
		arr.add("C++");
		arr.add("C#");
		
		System.out.println("Cac phan tu trong mang la:");
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i)+ "\t");
			}
	}
}
