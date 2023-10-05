package Test;

import java.util.Scanner;
import Code_b.KiemTraSi;
public class Testcaub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
		System.out.println("Nhap 1 So Nguyen > 0: ");
		n = sc.nextInt();
		}while(n <= 0);
		KiemTraSi vd = new KiemTraSi();
		if(vd.kiemtraSNT(n) == true)
		{
			System.out.println(n + " la so nguyen to!!!");
		}
		else
		{
			System.out.println(n + " khong phai la so nguyen to!!!");
		}
	}

}
