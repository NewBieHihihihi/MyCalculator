import java.util.Scanner;

public class ThapPhanSangNhi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nhiphan = "";
		int n;
		System.out.print("Nhap So Thap Phan(>0):" );
		n = sc.nextInt();
		while(n > 0)
		{
			nhiphan = (n % 2) + nhiphan;
			n = n / 2;
		}
		System.out.print(nhiphan);
		
	}

}
