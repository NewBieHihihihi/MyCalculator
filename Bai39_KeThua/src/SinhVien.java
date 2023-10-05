
public class SinhVien extends ConNguoi{
	private
	int iDSV;
	String tenLop,tenKhoa;
	public SinhVien(String hoVaTen, int iD, int iDSV, String tenLop, String tenKhoa) {
		super(hoVaTen, iD);
		this.iDSV = iDSV;
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
	}
	void Output()
	{
		super.OutputCn();
		System.out.println("IDSV: " + this.iDSV);
		System.out.println("Ten Lop: " + this.tenLop);
		System.out.println("Ten Khoa: " + this.tenKhoa);
	}
	void LamNhom()
	{
		System.out.println("Lam Thuyet Trinh Nhom");
	}
	void DiChoi()
	{
		System.out.println("Di Dao");
	}
	
	    
	    

}
