package baitap;
import Hinhhoc.hinh;

public class HinhChuNhat extends hinh{
	public float dai;
    public float rong;
 
    // Constructor
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }
 
    // Constructor
    public HinhChuNhat(float dai, float rong) {
        this(); // Gọi đến HinhChuNhat()
        this.dai = dai;
        this.rong = rong;
    }
 
    // Constructor
    public HinhChuNhat(float canh) {
        this(canh, canh); // Gọi đến HinhChuNhat(dai, rong)
    }
 
    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }
 
    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
