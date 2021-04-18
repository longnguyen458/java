package Hinhhoc;
import java.util.Scanner;
public class hinhvuong extends hinhchunhat{
	    // Constructor
	    public hinhvuong() {
	        ten = "Hình Vuông";
	    }
	 
	    public void nhapCanh() {
	        System.out.println("Cạnh = ");
	        Scanner scanner = new Scanner(System.in);
	        dai = rong = scanner.nextFloat();
	    }
}

