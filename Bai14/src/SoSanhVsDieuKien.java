import java.util.Scanner;

public class SoSanhVsDieuKien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		System.out.println("Gia Tri Cua A va B la: " + "A= " + a + "   " + "B= " + b);
		System.out.println("A == B: " + (a == b));
		System.out.println("A != B: " + (a != b));
		System.out.println("A >= B: " + (a >= b));
		System.out.println("A <= B: " + (a <= b));
		System.out.println("A > B: " + (a > b));
		System.out.println("A < B: " + (a < b));
		System.out.println("A va B la So Chan: " + (a % 2 == 0 && b % 2 == 0));
		System.out.println("A va B la So Le: " + (a % 2 != 0 && b % 2 != 0));
	}
}
