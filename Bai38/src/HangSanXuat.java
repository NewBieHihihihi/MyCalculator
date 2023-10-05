
class HangSanXuat {
	String tenHangSX;
	QuocGia quocGia;
	public HangSanXuat(String tenHangSX, QuocGia quocGia) {
		super();
		this.tenHangSX = tenHangSX;
		this.quocGia = quocGia;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
	public String LayTenQuocGia() {
		// TODO Auto-generated method stub
		return this.quocGia.getTenQuocGia();
	}
	

}
