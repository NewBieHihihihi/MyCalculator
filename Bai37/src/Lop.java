import java.util.Scanner;

class Lop {
	private
	String tenLop;
	String tenKhoa;
	public Lop(String tenLop, String tenKhoa) {
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
	}
	void NhapLop()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ten Lop: ");
		this.tenLop = sc.nextLine();
		System.out.print("Nhap Ten Khoa: ");
		this.tenKhoa = sc.nextLine();
	}
	void OutputLop()
	{
		System.out.println("Ten Lop: " + this.tenLop);
		System.out.println("Ten Khoa: " + this.tenKhoa);
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getTenKhoa() {
		return tenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}
	
	

}
