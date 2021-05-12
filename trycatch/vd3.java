package trycatch;

public class vd3 {
	public static void main(String[] args) {
		vd3 mot = new vd3();
		try {
			mot.connectDatabase();
		}catch(Exception e){
			System.out.println("Error:"+e.toString());
		}
		
	}
	public void connectDatabase() throws Exception{
		throw new NullPointerException();
	}
}
