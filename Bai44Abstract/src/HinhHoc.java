
public abstract class HinhHoc {
	protected ToaDo toaDo;

	public HinhHoc(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	String InToaDo() {
		String tdx = "Toa Do x: " + this.toaDo.getX() + "," + "Toa Do y: " + this.toaDo.getY();
		return tdx;
	}
	public abstract double TinhDienTich();

}
