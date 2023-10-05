package Test;

import java.util.Scanner;

import Code_a.vidu;

public class Testcaua {
	public static void main(String[] args) {
		//caua
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap So Luong Phan Tu: ");
		n = sc.nextInt();
		int a[] = new int[n];
		vidu vd1 = new vidu(n,a);
		vd1.nhapMang();
		System.out.println("-------------");
		vd1.inMang();
		vd1.sapSep();
		System.out.println("-------------");
		vd1.inMang();
		
	}

}
