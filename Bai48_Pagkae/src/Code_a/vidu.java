package Code_a;

import java.util.Scanner;

public class vidu {
	private
	int n;
	int a[];
	public vidu(int n, int[] a) {
		super();
		this.n = n;
		this.a = a;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	
	public void nhapMang()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Nhap Mang Thu a[" + i + "]:");
            a[i] = sc.nextInt();
		}
		sc.close();
	}
	public void inMang()
	{
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Mang Thu a[" + i + "]:" + a[i]);
		}
	}
	public void sapSep()
	{
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i + 1 ; j < n ; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	

}
