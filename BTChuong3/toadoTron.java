package helloword;
import java.util.Scanner;
public class toadoTron {
	public static void main(String[] args) {
	    HinhTron hinhTron = new HinhTron);
		System.out.println("Hãy nhập vào Bán kính Hình tròn: "); 
		Scanner scanner = new Scanner(System.in);
		float bk = scanner.nextFloat(); 
		hinhTron.setBankinh(bk);
		
	    System.out.println("Hãy nhập vào Tọa độ Hình tròn: ");
	    System.out.println("x = "); 
	    ToaDo toaDo = new ToaDo(); 
	    toaDo.X = scanner.nextInt(); 
	    System.out.println("y = "); 
	    toaDo.y = scanner.nextInt(); hinhTron.setToaDo(toaDo); 
	    hinhTron.setToaDo(toaDo.x, toaDo.y); 
	    hinhTron.xuatBankinh(); 
	    hinhTron.xuatToaDo();

		
	}
}
public class HinhTron{
	float r;
	ToaDo toaDo;
	void setBanKinh(float r) {
		this.r = r;
	}
	void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	void setToaDo(int x, int y) {
		this.toaDo = new ToaDo();
		
		this.toaDo.x = x;
		this.toaDo.y = y;
	}
	void xuatbankinh() {
		System.out.println("Bán kính hình tròn la: "+this.r);
	}
	void xuattoado() {
		System.out.println("Tọa độ hình tròn la: ");
		System.out.println("x = "+this.toaDo.x);
		System.out.println("y = "+this.toaDo.y);
	}
}