package chuong4;

import java.util.ArrayList;

public class vd5 {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>(3);
		arr1.add("RED");
		arr1.add("GREEN");
		arr1.add("BLUE");
		arr1.add("ORANGE");
		arr1.remove("GREEN");
		arr1.add("BLACK");
		arr1.add("YELLOW");
	System.out.println(arr1.get(1));
	System.out.println(arr1.contains("ORANGE"));
	System.out.println(arr1.size());
	System.out.println(arr1);
	}
}
