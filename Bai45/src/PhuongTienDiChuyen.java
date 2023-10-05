
public abstract class PhuongTienDiChuyen {
	protected
	String loaiPhuongTien;
	HangSanXuat hsx;
	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hsx) {
		super();
		this.loaiPhuongTien = loaiPhuongTien;
		this.hsx = hsx;
	}
	
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHsx() {
		return hsx;
	}

	public void setHsx(HangSanXuat hsx) {
		this.hsx = hsx;
	}

	public String LayTenHSX()
	{
		return hsx.getTenHangSanXuat();
	}
	public void BatDau()
	{
		System.out.println("Bat Dau Chay!!!");
	}
	public void TangToc()
	{
		System.out.println("Tang Toc!!!");
	}
	public void DungLai()
	{
		System.out.println("Dung Lai!!!");
	}
	public abstract double LayVanToc();
}
