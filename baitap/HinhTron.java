package baitap;

public class HinhTron {
	 
    public float banKinh;
 
    // Constructor
    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }
 
    public void tinhChuVi() {
        // Tính chu vi hình tròn và in ra console
    }
 
    public void tinhDienTich() {
        // Tính diện tích hình tròn và in ra console
    }
 
    public void inHinhTron() {
        System.out.println("Hình tròn bán kính = " + this.banKinh);
        this.tinhChuVi();
        this.tinhDienTich();
    }
}
