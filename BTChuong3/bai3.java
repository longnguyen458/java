package baitapC3;
import java.util.Scanner;
public class bai3 {
	 public static void main(String[] args) {
 	 
		 	Matran A = new Matran();
		 	A.nhapmatrix();
		 	A.xuatmatrix();
	        if(A.donvi()== true)
	        	 System.out.println("Đây là ma trận đơn vị. ");
	        else
	        	 System.out.println("Đây không là ma trận đơn vị. ");
	    }
}
class Matran {
	static int n,matrix[][];
    void nhapmatrix(){
        Scanner input = new Scanner(System.in);
        do {
        	 System.out.println("Nhập vào bậc của ma trận: ");
             n=input.nextInt();
        }while(n<0);
        matrix=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  A["+i+","+j+"]=");
                matrix[i][j]=input.nextInt();
            }
            System.out.println();
        }
    }
    boolean donvi() {
    	 for (int i = 0; i < n; i++) 
             for (int j = 0; j < n; j++) 
            	 if((i == j && matrix[i][j] != 1)||(i != j && matrix[i][j] != 0))
            		 return false;
            	 
         return true; 
    	
    }
    void xuatmatrix(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] +"  ");
        }
        System.out.println("");
        }
    }
}