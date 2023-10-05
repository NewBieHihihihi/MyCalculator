package Main;

import java.io.File;
import java.util.Scanner;

public class vidu {
	File file;
	public vidu(String tenFile)
	{
		this.file = new File(tenFile);
	}
	public boolean kiemTraThucThi()//checking file.exe,....
	{
		return this.file.canExecute();
	}
	public boolean kiemTraDoc() {
		return this.file.canRead();
	}
	public boolean kiemTraGhi() {
		return this.file.canWrite();
	}
	public boolean kiemTraTonTai()
	{
		return this.file.exists();
	}
	public void inDuongDan()
	{
		System.out.println(this.file.getAbsolutePath());//Print 
	}
	public void inTenFile()
	{
		System.out.println(this.file.getName());
	}
	public void kiemTraThuMucHayTapTin()
	{
		if(this.file.isDirectory() == true)
		{
			System.out.println("Thư mục.");
		}
		else
		{
			System.out.println("Tập tin.");

		}
	}
	public void inCacFileCon()
	{
		if(this.file.isFile() == true)
		{
			System.out.println("Đây là file tập tin ko có file con.");
		}
		else
		{
			File[] mang = this.file.listFiles();
			for (File file : mang) {
				System.out.println(file.getAbsolutePath());
			}		
		}
	}
	//main function.
	public static void main(String[] args) {
		//System.out.println("Hello world!");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String tenFile;
		System.out.println("Nhập tên file: ");
		tenFile = sc.nextLine();
		vidu file = new vidu(tenFile);
		do
		{
			//sc.nextLine();
			System.out.println("---MENU---");
			System.out.println("1.Kiểm tra file có tồn tại.");
			System.out.println("2.Kiểm tra file có thể thực thi.");
			System.out.println("3.Kiểm tra file có thể đọc.");
			System.out.println("4.Kiểm tra file có thể ghi.");
			System.out.println("5.In đường dẫn.");
			System.out.println("6.In tên file.");
			System.out.println("7.Kiểm tra file thư mục hay tập tin.");
			System.out.println("8.In danh sách các file con.");
			System.out.println("9.In ra cây thư mục.");
			System.out.println("0.Thoát chương trình.");
			System.out.print("Vui lòng chọn: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Bạn đã chọn số 1.");
				System.out.println("File có tồn tại không: " + file.kiemTraTonTai());
				break;
			case 2:
				System.out.println("Bạn đã chọn số 2.");
				System.out.println("File có thực thi không: " + file.kiemTraThucThi());
				sc.nextLine();
				break;
			case 3:
				System.out.println("Bạn đã chọn số 3.");
				System.out.println("File có đọc được không không: " + file.kiemTraDoc());
				sc.nextLine();
				break;
			case 4:
				System.out.println("Bạn đã chọn số 4.");
				System.out.println("File có ghi được không: " + file.kiemTraGhi());
				sc.nextLine();
				break;
			case 5:
				System.out.println("Bạn đã chọn số 5.");
				System.out.println("Đường dẫn của file là: ");
				file.inDuongDan();
				break;
			case 6:
				System.out.println("Bạn đã chọn số 6.");
				System.out.print("Tên của file là: ");
				file.inTenFile();
				break;
			case 7:
				System.out.println("Bạn đã chọn số 7.");
				System.out.print("File của bạn là: ");
				file.kiemTraThuMucHayTapTin();
				break;
			case 8:
				System.out.println("Bạn đã chọn số 8.");
				System.out.println("Các file con: ");
				file.inCacFileCon();
				break;
			default:
				break;
			}
		}while(choice != 0);
	}

}
