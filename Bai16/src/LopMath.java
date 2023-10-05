import java.util.Scanner;

public class LopMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		System.out.print("Enter A: ");
		a = sc.nextDouble();
		System.out.print("Enter B: ");
		b = sc.nextDouble();
		//
		System.out.println("|A| is: " + Math.abs(a));//Absolute value
		System.out.println("|B| is: " + Math.abs(b));
		//
		System.out.println("Max(A and B): " + Math.max(a, b));// Max of two number
		System.out.println("Min(A and B): " + Math.min(a, b));// Min of two number
		//
		System.out.println("Ceil(A):" + Math.ceil(a));// Number bigger but the smallest Ex: 4.5 => 5
		System.out.println("Floor(B):" + Math.floor(b));// Number smaller but the biggest Ex: 3.3 => 3
		//
		System.out.println("√A is: " + Math.sqrt(a));
		System.out.println("√B is: " + Math.sqrt(b));
		//
		System.out.println("A^B is: " + Math.pow(a, b));
	}

}
