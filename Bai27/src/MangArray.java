import java.util.Scanner;

public class MangArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[],n;
		System.out.print("Nhap So Luong Mang: ");
		n = sc.nextInt();
		a = new int[n];
		//Enter Value for Array
		System.out.println("----NHAP MANG----");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Nhap a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		//Display Value of Array
		System.out.println("----XUAT MANG----");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Mang Thu a[" + i + "]:" + a[i]);
		}
		// Sum of Array
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Tong Mang La: " + sum);
		sc.close();

		
	}

}
