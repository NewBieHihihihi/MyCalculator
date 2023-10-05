package test;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
	Set<String> tapHopSo = new HashSet<String>();
	public
	Main()
	{
		
	}
	boolean themPhieu(String phieu)
	{
		return this.tapHopSo.add(phieu);
	}
	boolean xoaPhieu(String phieu)
	{
		return this.tapHopSo.remove(phieu);
	}
	boolean kiemTraPhieu(String phieu)
	{
		return this.tapHopSo.contains(phieu);
	}
	void xoaTatCaPhieu()
	{
	    this.tapHopSo.clear();
	}
	int soLuongPhieu()
	{
		return this.tapHopSo.size();
	}
	boolean kiemtraConTrong()
	{
		return this.tapHopSo.isEmpty();
	}
	String rutTham()
	{
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(tapHopSo.size());
		ketQua = (String) this.tapHopSo.toArray()[viTri];
		return ketQua;
	}
	public void inTatCa()
	{
		System.out.println(Arrays.toString(this.tapHopSo.toArray()));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main rt = new Main();
		int choice = 0;
		do
		{
		   System.out.println("-------------------------------------");
		   System.out.println("MENU GAMES");
		   System.out.println("1.Thêm mã số dự thưởng.");
		   System.out.println("2.Xóa mã số dự thưởng.");
		   System.out.println("3.Kiểm mã số dự thưởng có tồn tại.");
		   System.out.println("4.Xóa tất cả mã số dự thưởng.");
		   System.out.println("5.Số lượng số dự thưởng.");
		   System.out.println("6.Rút thăm mã số dự thưởng.");
		   System.out.println("7.In tất cả mã dự thưởng.");
		   System.out.println("0.Exit");
		   System.out.print("Please choices: ");
		   choice = sc.nextInt();
		   if(choice == 1)
		   {
			   sc.nextLine();
			   System.out.print("Nhập mã số cần thêm: ");
			   String phieu = sc.nextLine();
			   if(rt.themPhieu(phieu))
			   {
				   System.out.println("Thêm Thành Công");
			   }
			   else
			   {
				   System.out.println("Thêm Không Thành Công");
			   }
		   }
		   else if(choice == 2)
		   {
			   sc.nextLine();
			   System.out.print("Nhập mã số cần xóa: ");
			   String phieu = sc.nextLine();
			   if(rt.xoaPhieu(phieu))
			   {
				   System.out.println("Xóa Thành Công");
			   }
			   else
			   {
				   System.out.println("Xóa Không Thành Công");
			   }
		   }
		   else if(choice == 3)
		   {
			   sc.nextLine();
			   System.out.print("Nhập mã số cần kiểm tra: ");
			   String phieu = sc.nextLine();
			   if(rt.kiemTraPhieu(phieu) == true)
			   {
				   System.out.println("Có Tồn Tại");
			   }
			   else
			   {
				   System.out.println("Không Tồn Tại");
			   }
		   }
		   else if(choice == 4)
		   {
			  rt.xoaTatCaPhieu();
			  if(rt.kiemtraConTrong() == true)
			  {
				  System.out.println("Xóa Thành Công");
			  }
			  else
			  {
				  System.out.println("Không Thành Công");
			  }
		   }
		   else if(choice == 5)
		   {
			   System.out.println("Trong thùng có " + rt.soLuongPhieu() + " phiếu.");
		   }
		   else if(choice == 6)
		   {
			   System.out.println("Mã Số Dự Thưởng Bạn Vừa Bốc Là: " + rt.rutTham());
		   }
		   else if(choice == 7)
		   {
			   System.out.print("Tất cả mã dữ thưởng: ");
			   rt.inTatCa();
		   }
		   else if(choice == 0)
		   {
			   System.out.println("Exit!");
			   break;
		   }

		}while(choice != 0);
		sc.close();
		
	}
}
