
public class Oto extends PhuongTienDiChuyen{
	private
	String loaiNhienLieu;

	public Oto(String loaiPhuongTien, HangSanXuat hsx, String LNL) {
		super(loaiPhuongTien, hsx);
		this.loaiNhienLieu = LNL;
		// TODO Auto-generated constructor stub
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double LayVanToc() {
		// TODO Auto-generated method stub
		return 70;
	}
	
	

}
