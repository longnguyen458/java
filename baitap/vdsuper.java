package baitap;

public class vdsuper {
	public class HinhHoc {
		 
	    public String ten;
	 
	    public void xuatTen() {
	        System.out.println("\n\n===== " + ten + " =====");
	    }
	 
	    // Các phương thức khác
	    // ...
	}
	 
	public class HinhTron extends HinhHoc {
	 
	    // Constructor
	    public HinhTron() {
	        ten = "Hình Tròn";
	    }
	 
	    public void xuatTen() {
	        super.xuatTen();
	        System.out.println("\nHàm xuất tên từ HinhTron");
	    }
	 
	    // Các phương thức khác
	    // ...
	}
	 
	public class MainClass {
	 
	    public static void main(String[] args) {
	        // Thử nghiệm với lớp Hình tròn
	        HinhTron hinhTron = new HinhTron();
	        hinhTron.xuatTen();
	    }
	 
	}
}
