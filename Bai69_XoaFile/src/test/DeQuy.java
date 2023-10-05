package test;

import java.util.Scanner;

public class DeQuy {
	static int giaithua(int n)
	{
		if(n == 1)
			return 1;
		return n * giaithua(n-1);
	}
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n;
	     do
	     {
	    	 System.out.print("Nhập 1 số nguyên(n<0): ");
	    	 n = sc.nextInt();
	     }while(n < 0);
	     int kq = giaithua(n);
	     System.out.println("Giai thừa của " + n + " là: " + kq);
	     sc.close();
		
	}
}
