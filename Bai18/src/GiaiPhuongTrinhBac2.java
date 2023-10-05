import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
	public static void main(String[] args) {
		System.out.println("Giai Phuong Trinh Bac 2 Ax^2+Bx+C = 0");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap A: ");
		a = sc.nextInt();
		System.out.print("Nhap B: ");
		b = sc.nextInt();
		System.out.print("Nhap C: ");
		c = sc.nextInt();
		if(a == 0)
		{
			System.out.println("Phuong Trinh Tro Thanh Bac 1");
			if(b == 0)
			{
				if(c == 0)
				{
					System.out.println("Phuong Trinh Vo So Nghiem");
				}
				else
				{
					System.out.println("Phuong Trinh Vo Nghiem");
				}
			}
			else
			{
				System.out.println("Phuong Trinh Bx + C = 0 Co Nghiem La:" + (double)-c/b);
			}
		
		}
		else
		{
			double delta = Math.pow(b, 2) - (4 * a * c);
			if(delta < 0)
			{
				System.out.println("Phuong Trinh Vo Nghiem");
			}
			else if(delta > 0)
			{
				double x1,x2;
				x1 = (-b + Math.sqrt(delta))/ 2*a;
				x2 = (-b - Math.sqrt(delta))/ 2*a;
				System.out.println("Phuong Trinh Co 2 Nghiem Phan Bien x1 = " + x1 + " x2 = " + x2);
			}
			else
			{
				System.out.println("Phuong Trinh Co Nghiem Kep X1 = X2 = " + (double)-b / 2*a);
			}
		}
	}

}
