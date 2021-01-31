package helloword;

import java.util.Scanner;
public class bai8{
	public static void main(String[] args) {
		 int size,tong=0;
		 Scanner scanner = new Scanner(System.in);
		         
		 System.out.println("Nhập vào độ dài của mảng: ");
		 size= scanner.nextInt();
		 int[] array = new int[size];
		    for (int i = 0; i < size; i++) {
		    System.out.println("Nhập vào phần tử thứ " + i + ": ");
		    array[i] = scanner.nextInt();
		 }
		 for (int i = 0; i < size; i++) {
		        System.out.println("Phần tử thứ " + i + ": " + array[i]);
		 }
		 for (int i = 0; i < size; i++) {
		        tong+=array[i];
		 }
		 System.out.println("Tổng các phần tử trong mảng "+tong);
		 scanner.close();
	}
}
