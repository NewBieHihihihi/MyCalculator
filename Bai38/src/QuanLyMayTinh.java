
class QuanLyMayTinh {
	HangSanXuat sx;
	float giaBan;
	Ngay thoiGianBaoHanhTheoThanh;
	public QuanLyMayTinh(HangSanXuat sx, float giaBan, Ngay thoiGianBaoHanhTheoThanh) {
		super();
		this.sx = sx;
		this.giaBan = giaBan;
		this.thoiGianBaoHanhTheoThanh = thoiGianBaoHanhTheoThanh;
	}
	String TenQuocGia()
	{
		return this.sx.LayTenQuocGia();
	}
	boolean KiemTraGiaThap(QuanLyMayTinh other)
	{
		return this.giaBan < other.giaBan;
	}
	

}
