package helloword;

import java.util.Scanner;
public class hinhtron{
	public static void main(String[] args) {
		HinhTron tron1= new HinhTron();
		tron1.nhapBanKinh();
		if(tron1.kichthuoc()) {
			 System.out.println("Đây là hình tròn lớn vơi bán kính là : "+ tron1.bankinh());
		}
		else {
			tron1.tinhChuVi();
			tron1.inChuVi();
		}
	}
}

class HinhTron {	
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
   
    void nhapBanKinh() {
        System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
        scanner.close();
    }
    float bankinh() {
    	return r;
    }
    void tinhChuVi() {
        cv = 2 * PI * r;
    }
 
    void tinhDienTich() {
        dt = PI * r * r;
    }
 
    void inChuVi() {
        System.out.println("Chu vi Hình tròn: " + cv);
    }
 
    void inDienTich() {
        System.out.println("Diện tích Hình tròn: " + dt);
    }
    boolean kichthuoc() {
    	if(r>10) {
    		return true;
    	}
    	else
    		return false;
    }
}
