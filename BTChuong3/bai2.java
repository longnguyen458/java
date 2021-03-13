package baitapC3;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		ThoiGian time[] = null;
        int n = 0,t = 0;
        Scanner sc = new Scanner(System.in); 
        do {
        	System.out.println("Nhập số lương thành tích : ");
            n = sc.nextInt();
        }while(n<=0||n>=50);
		
        time = new ThoiGian[n];
        for (int i = 0; i < n; i++) {
             System.out.println("Thành tích người thứ " + (i + 1)+": ");
             time[i] = new ThoiGian();
             if(i<5) {
                 time[i].nhaptg();
             }else {
            	 time[i].hamTao(0, 0, 0);
             }
        }
       int s =time[0].chuyen();
       System.out.println("Danh sách thành tích đã nhập: ");
        for (int i = 0; i < n; i++) {
            time[i].intg();
       }
        for (int i = 0; i < n; i++) {
            t+=time[i].chuyen();
            if(s > time[i].chuyen()) {
            	s=time[i].chuyen();
            }
       }
        System.out.println("Thời gian nhanh nhất vận động viên đạt được là: "+s+" giây");
        System.out.println("Thời gian trung bình của các vận động viên là: "+t/n+" giây");
	}
}
class ThoiGian{
	int x, y, z, k;
	void nhaptg() {
		Scanner sc = new Scanner(System.in); 
        System.out.println("Nhập giờ: ");
        x = sc.nextInt();
        System.out.println("Nhập phút: ");
        y = sc.nextInt();
        System.out.println("Nhập giây: ");
        z = sc.nextInt(); 
	}
	void intg() {
		  System.out.println(x +" giờ,"+ y +" phút, "+ z +" giây."); 
		  System.out.println("Thành tích đổi sang giây là: "+chuyen()+" giây.");
	}
	void hamTao(int x, int y, int z){
	    this.z = z;
	    this.y = y;
	    this.x = z;        
	    }
	int chuyen() {
		return x*3600+y*60+z;
	}
}
