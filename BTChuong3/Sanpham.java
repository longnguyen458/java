package helloword;

import java.util.Scanner;

public class Sanpham {
	public static void main(String[] args) {
		SP sanpham1 = new SP("gao",32.2);
		sanpham1.in();
			
		SP sanpham2 = new SP("lua",30,2);
		sanpham2.in();

		
		
	}
}	
class SP{
	private String Tensp;
	private Double Dongia, Giamgia;
	public void settensp(String Tensp){
		this.Tensp = Tensp;
	}
	public String gettensp(){
		return this.Tensp;
	} 
	public void setdongia(Double Dongia) {
		this.Dongia = Dongia;
	}
	public Double getdongia() {
		return this.Dongia;
	}
	public void setgiamgia(Double Giamgia) {
		this.Giamgia = Giamgia;
	}
	public Double getgiamgia() {
		return this.Giamgia;
	}
	void nhap() {
			System.out.println("Hãy nhập thông tin sản phẩm");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập tên sản phẩm : ");
	        Tensp = sc.next();
	        System.out.println("Nhập đơn giá sản phẩm : ");
	        Dongia = sc.nextDouble();
	        System.out.println("Nhập giảm giá sản phẩm : ");
	        Giamgia = sc.nextDouble();
	    }
		private double Thue() {
			return (Dongia / 10);
		}
		public SP(String Tensp, double Dongia, double Giamgia) {
			this.Tensp = Tensp;
			this.Dongia = Dongia;
			this.Giamgia = Giamgia;
		}
		public SP(String Tensp, double Dongia) {
			this.Tensp = Tensp;
			this.Dongia = Dongia;
			this.Giamgia = 0.0;
		}
		public void in() {
	        System.out.println("Tên sản phẩm : "+Tensp);
	        
	        System.out.println("Đơn giá sản phẩm: "+Dongia);
	        
	        System.out.println("Giảm giá sản phẩm: "+Giamgia);
	        System.out.println("Thuế sản phẩm: "+Thue());
	    }
}
