import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {//main function
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<String>();
		//push là bỏ giá trị vào
		//pop là bỏ giá trị ra, xóa khỏi stack
		//peek là bỏ giá trí, còn trong stack
		//clean là làm sạch stack
		//contains là kiểm tra phần tử có tồn tại hay ko
		System.out.println("Nhập Chuỗi: ");
		String s = sc.nextLine();
		System.out.println("Chuỗi ban đầu: " + s);
		//bỏ tửng phần vào stack
		for(int i = 0 ; i < s.length(); i++)
		{
			stackChuoi.push(s.charAt(i)+"");
		}
		System.out.print("Sau Khi Bỏ Vào Stack: ");
		for(int i = 0 ; i < s.length(); i++)
		{
			System.out.print(stackChuoi.pop());
		}
		//chia thap phan thanh nhi phan
		Stack<Integer> ss = new Stack<Integer>();
		System.out.println();
		int n;
		System.out.println("Nhập Số Thập Phân: ");
		n = sc.nextInt();
		int s1,dem = 0;
		while(n > 0)
		{
		   s1 = n % 2;
		   ss.push(s1);
		   n = n / 2;
		   dem++;
		}
		System.out.print("Chia Thành Nhị Phân: ");
		for(int i = 0 ; i < dem; i++)
		{
			System.out.print(ss.pop());
		}
		sc.close();
	}
}
