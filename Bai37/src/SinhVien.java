import java.util.Scanner;

class SinhVien {
	private
	int maSoSV;
	String hoVaTen;
	NgaySinh ngaySinh;
	float diemTrungBinh;
	Lop lopHoc;
	
	public SinhVien(int maSoSV, String hoVaTen, NgaySinh ngaySinh, float diemTrungBinh, Lop lopHoc) {
		super();
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lopHoc = lopHoc;
	}
	
	public
	void NhapThongTinSinhVien()
	{
		this.ngaySinh = new NgaySinh(0, 0, 0);
		this.lopHoc = new Lop(null, null);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma So SV: ");
		this.maSoSV = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap Ho Ten SV: ");
		this.hoVaTen = sc.nextLine();
		this.ngaySinh.InputNgaySinh();
		System.out.print("Nhap Diem Trung Binh: ");
		this.diemTrungBinh = sc.nextFloat();
		this.lopHoc.NhapLop();
	}
	void XuatThongTinSinhVien()
	{
		System.out.println("Ma So SV: " + this.maSoSV);
		System.out.println("Ho Ten SV: " + this.hoVaTen);
		System.out.print("Ngay Sinh SV: ");
		this.ngaySinh.OutputNgaySinh();
		System.out.println("Diem Trung Binh: " + this.diemTrungBinh);
		System.out.println("Lop Dang Hoc: ");
		this.lopHoc.OutputLop();
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	

}
