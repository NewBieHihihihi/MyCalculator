
class HangSanXuat {
	private String TenHangSanXuat;
	String QuocGia;

	public HangSanXuat(String tenHangSanXuat, String quocGia) {
		TenHangSanXuat = tenHangSanXuat;
		QuocGia = quocGia;
	}

	void Output() {
		System.out.println(this.TenHangSanXuat);
		System.out.println("Quoc Gia: " + this.QuocGia);
	}

	public String getTenHangSanXuat() {
		return TenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		TenHangSanXuat = tenHangSanXuat;
	}

	public String getQuocGia() {
		return QuocGia;
	}

	public void setQuocGia(String quocGia) {
		QuocGia = quocGia;
	}
	

}
