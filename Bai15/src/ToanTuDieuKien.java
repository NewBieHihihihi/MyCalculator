import java.util.Scanner;

public class ToanTuDieuKien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// cin >> 
		int a,b;
		System.out.print("Enter A: ");//cout <<
		a = sc.nextInt();
		System.out.print("Enter B: ");
		b = sc.nextInt();
		System.out.println("Way1: ");
		//Way 1
		if(a > b)
		{
			System.out.println("A is bigger than B");
		}
		else
		{
			System.out.println("A is smaller than B");
		}
		System.out.println("Way2: ");
		//Way 2
		String ketqua = (a > b) ? "A is bigger than B" : "A is smaller than B" ;
		System.out.println("Resuit: " + ketqua);
		sc.close();
	}

}
