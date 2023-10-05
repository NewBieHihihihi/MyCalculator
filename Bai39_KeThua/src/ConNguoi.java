
public class ConNguoi {
	private
	String hoVaTen;
	int iD;
	public ConNguoi(String hoVaTen, int iD) {
		super();
		this.hoVaTen = hoVaTen;
		this.iD = iD;
	}
	void OutputCn()
	{
		System.out.println("Ho Va Ten: " + this.hoVaTen);
		System.out.println("ID(CCCD): " + this.iD);
	}
	void An()
	{
		System.out.println("An Com");
	}
	void Ngu()
	{
		System.out.println("Ngu Nghi");
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	

}
