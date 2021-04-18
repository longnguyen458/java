package VDoverload;

public class Main {
	public static void main(String args[]) {
		HinhTron Htron= new HinhTron();
		HinhTru Htru = new HinhTru();
		
		Htron.xuatThongTin();
		Htru.xuatThongTin();
//		System.out.println("Thông tin đối tượng HinhTron: " + Htron.getClass());
//	    System.out.println("Thông tin đối tượng HinhTron: " + Htron.getClass().getName());
//	    System.out.println("Thông tin đối tượng HinhTron: " + Htron.getClass().getSimpleName());
		Htron.setBanKinh(10);
        
      
        float chuVi = Htron.tinhChuVi();
        float dienTich = Htron.tinhDienTich();
        System.out.println("Chu vi hình tròn: " + chuVi + "; Và diện tích: " + dienTich) ;
	}
}
