package trycatch;

public class vd1 {
	public static void main(String[] args) {
		try {
			int a = 6;
			int b= 0;
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Error:"+e.toString());
		}
		System.out.println("Ban da kiem tra lai chua");			
	}
}
