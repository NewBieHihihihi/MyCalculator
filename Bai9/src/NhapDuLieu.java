import java.util.Scanner;

public class NhapDuLieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//
		String fullname;
		int ID, Year;
		System.out.print("Enter Full Name:");
		fullname = sc.nextLine();
		System.out.print("Enter ID(CMND/CCCD):");
		ID = sc.nextInt();
		System.out.print("Enter Year of Birth:");
		Year = sc.nextInt();
		System.out.println("Display information:");
		System.out.println("Full Name: " + fullname);
		System.out.println("ID: " + ID);
		System.out.println("Year of Birth: " + Year);
		if(2023 - Year >= 18)
		{
			System.out.println("Du Tuoi Di Tu");
		}
		else
		{
			System.out.println("Chua Du Tuoi di tu");
		}
		sc.close();
	}
}
