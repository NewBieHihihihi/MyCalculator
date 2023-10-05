
public class HinhTron extends HinhHoc{
    private
    double r;
	public HinhTron(ToaDo toaDo,double bk) {
		super(toaDo);
		this.r = bk;
		// TODO Auto-generated constructor stub
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double TinhDienTich()
	{
		return this.r * this.r * Math.PI;
	}
	

}
