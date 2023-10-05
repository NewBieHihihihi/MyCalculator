import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Nhap Chuoi: " );
		s = sc.nextLine();
		System.out.println("Do Dai Chuoi La:" + s.length());
		//ham length lay do dai chuoi
		int dodai = s.length();
		//ham charAt In ky tu tai tung vi tri
		System.out.println(s.charAt(0));
		for(int i = 0 ; i < dodai ; i++)
		{
			System.out.println("Vi tri thu " + i + " co ki tu la: " + s.charAt(i));
		}
		//ham getChars(vi tri bat dau,vi tri ket thuc,mang luu du lieu,vi tri bat dau luu
		
	}

}
