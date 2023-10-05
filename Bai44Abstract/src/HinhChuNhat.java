
public class HinhChuNhat extends HinhHoc{
	private
	double chieuDai,chieuRong;
	public HinhChuNhat(ToaDo toaDo,double cd,double cr) {
		super(toaDo);
		this.chieuDai = cd;
		this.chieuRong = cr;
		// TODO Auto-generated constructor stub
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	public double TinhDienTich()
	{
		return this.chieuDai * this.chieuRong;
	}
	

}
