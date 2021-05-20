package chuong4;

import java.util.ArrayList;
import java.util.ListIterator;
public class vd3 {
	public static void main(String[] args) {
		ArrayList<Character> arr1 = new ArrayList<>();
		arr1.add('a');
		arr1.add('b');
		arr1.add('d');
		arr1.add('c');
	ListIterator<Character> listIterator = arr1.listIterator();
		System.out.println("Cac phan tu trong mang la:");
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
				
			} 
	}
}
