import java.util.Scanner;

public class BaiToan {
	public static void main(String[] args) {
		System.out.println("---TINH DIEN TICH CHU VI HINH TRON---");
		Scanner sc = new Scanner(System.in);
		double R;
		System.out.println("Nhap Ban Kinh HT: ");
		R = sc.nextDouble();
		System.out.println("Dien Tich Hinh Tron La: " + (Math.pow(R, 2) * Math.PI) );;
		System.out.println("Dien Tich Hinh Tron La: " + (Math.pow(R, 2) * Math.PI * 100.0 / 100.0) );;
		System.out.println("Chu Vi Hinh Tron La: " + (2 * Math.PI * R) );;
		System.out.println("Chu Vi Hinh Tron La: " + (2 * Math.PI * R * 100.0 / 100.0) );;
	}

}
