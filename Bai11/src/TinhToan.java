import java.util.Scanner;

public class TinhToan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Nhap A = ");
		a = sc.nextInt();
		System.out.print("Nhap B = ");
		b= sc.nextInt();
		System.out.println("So A vua nhap la: " + a);
		System.out.println("So B vua nhap la: " + b);
		int sum = a + b;
		int minus = a - b;
		int multiply = a * b;
		float divide = (float)a / b;
		int remainder = a % b;
		System.out.println("Tong cua " + a + " va " + b + " la: "+ sum );
		System.out.println("Hieu cua " + a + " va " + b + " la: "+ minus );
		System.out.println("Tich cua " + a + " va " + b + " la: "+ multiply );
		System.out.println("Thuong cua " + a + " va " + b + " la: "+ divide );
		System.out.println(a + " chia lay du " + b + " = " + remainder);
		sc.close();		
	}
}
