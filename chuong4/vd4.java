package chuong4;
import java.util.ArrayList;
import java.util.Iterator;
public class vd4 {
	public static void main(String[] args) {
		ArrayList<Float> arr1 = new ArrayList<>();
		arr1.add(1.0f);
		arr1.add(2.0f);
		arr1.add(3.0f);
		arr1.add(4.0f);
	Iterator<Float>	iterator  = arr1.iterator();
		System.out.println("Cac phan tu trong mang la:");
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				
			} 
	}
}
