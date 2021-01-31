package helloword;
import java.util.Scanner;
public class bai9 {
	public static void main(String[] args)
    {
        String chuoi;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        scanner.close();
        int Hoa=0,Thuong=0;
        for(int i=0;i<chuoi.length();i++)
        {
            ch = chuoi.charAt(i);
            int asciivalue = (int)ch;
            if(asciivalue >=65 && asciivalue <=90){
               Hoa++;
            }
            else if(asciivalue >=97 && asciivalue <=122){
                Thuong++;
            }
        }
        System.out.println("Số ký tự in hoa : " + Hoa);
        System.out.println("Số ký tự in thường : " + Thuong);
    }
}
