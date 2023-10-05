import java.util.Objects;
import java.util.Scanner;

class Date {
	private int day, month, year;

	public Date(int d, int m, int y) {
		if (d >= 1 && d <= 31 && m >= 1 && m <= 12 && y >= 1) {
			this.day = d;
			this.month = m;
			this.year = y;
		} else {
			this.year = this.month = this.day = 1;
		}
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap Ngay Sinh: ");
			this.day = sc.nextInt();
			System.out.println("Ngay Thang Sinh: ");
			this.month = sc.nextInt();
			System.out.println("Nhap Nam Sinh: ");
			this.year = sc.nextInt();
		} while (this.day < 1 || this.day > 31 || this.month < 1 || this.month > 12 || this.year < 1);
		sc.close();
	}

	void output() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
class TacGia
{
	private
	String TenTacGia;
	Date ngaysinh;
	
	public TacGia(String tenTacGia, Date ngaysinh) {
		TenTacGia = tenTacGia;
		this.ngaysinh = ngaysinh;
	}
	public String getTenTacGia() {
		return TenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		TenTacGia = tenTacGia;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	void outputTG()
	{
		System.out.println(this.TenTacGia);
		System.out.println("Nam sinh: ");
		this.ngaysinh.output();
	}
}
class Sach {
	private String TenSach;
	double GiaBan;
	int NamXuatBan;
	TacGia tacgia;
	public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacgia) {
		super();
		TenSach = tenSach;
		GiaBan = giaBan;
		NamXuatBan = namXuatBan;
		this.tacgia = tacgia;
	}
	void OutputSach()
	{
		System.out.println("Ten Sach: " + this.TenSach);
		System.out.println("Gia Ban: " + this.GiaBan);
		System.out.println("Nam Xuat Ban: " + this.NamXuatBan);
		System.out.println("Tac Gia: ");
		this.tacgia.outputTG();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(NamXuatBan);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		return NamXuatBan == other.NamXuatBan;
	}
	double GiamGia(double x)
	{
		return this.GiaBan - (this.GiaBan * x / 100);
	}
};