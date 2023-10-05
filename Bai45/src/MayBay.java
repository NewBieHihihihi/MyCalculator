
public class MayBay extends PhuongTienDiChuyen{
	private
	String loaiNhienLieu;

	public MayBay(String loaiPhuongTien, HangSanXuat hsx,String LNL) {
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
	public
	String CatCanh()
	{
		return "Dang Bay Len Troi";
	}
	String HaCanh()
	{
		return "Dang Ha Canh Xuong Dat";
	}

	@Override
	public double LayVanToc() {
		// TODO Auto-generated method stub
		return 500;
	}

}
