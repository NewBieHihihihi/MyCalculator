
class QuanLyPhim {
	private String TenPhim;
	int NamSanXuat;
	double GiaVe;
	HangSanXuat hsx;
	NgayChieu ngaychieu;

	public QuanLyPhim(String tenPhim, int namSanXuat,double gv ,HangSanXuat hsx, NgayChieu ngaychieu) {
		TenPhim = tenPhim;
		NamSanXuat = namSanXuat;
		this.hsx = hsx;
		this.GiaVe = gv;
		this.ngaychieu = ngaychieu;
	}
	void OutputPhim()
	{
		System.out.println("Ten Phim: " + this.TenPhim);
		System.out.println("Nam San Xuat: " + this.NamSanXuat);
		System.out.print("Hang San Xuat: ");
		hsx.Output();
		System.out.println("Gia Ve: " + this.GiaVe);
		System.out.print("Ngay Chieu: " );
		ngaychieu.OutputDay();
	}
	
	public String getTenPhim() {
		return TenPhim;
	}
	public void setTenPhim(String tenPhim) {
		TenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return NamSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		NamSanXuat = namSanXuat;
	}
	public double getGiaVe() {
		return GiaVe;
	}
	public void setGiaVe(double giaVe) {
		GiaVe = giaVe;
	}
	public HangSanXuat getHsx() {
		return hsx;
	}
	public void setHsx(HangSanXuat hsx) {
		this.hsx = hsx;
	}
	public NgayChieu getNgaychieu() {
		return ngaychieu;
	}
	public void setNgaychieu(NgayChieu ngaychieu) {
		this.ngaychieu = ngaychieu;
	}
	String LayTenHangSX()
	{
		return this.hsx.getTenHangSanXuat();
	}
	boolean GiaVeRe(QuanLyPhim other)
	{
		if(this.GiaVe < other.GiaVe)
		{
		return true;
		}
		return false;
	}
	double GiamGia(int x)
	{
		return this.GiaVe - (this.GiaVe * x/100);
	}

};
