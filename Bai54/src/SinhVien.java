
public class SinhVien implements Comparable<SinhVien>{
	private
	int iD_SV;
	String name_SV;
	double diem_SV;
	public SinhVien(int iD_SV, String name_SV, double diem_SV) {
		super();
		this.iD_SV = iD_SV;
		this.name_SV = name_SV;
		this.diem_SV = diem_SV;
	}
	public int getiD_SV() {
		return iD_SV;
	}
	public void setiD_SV(int iD_SV) {
		this.iD_SV = iD_SV;
	}
	public String getName_SV() {
		return name_SV;
	}
	public void setName_SV(String name_SV) {
		this.name_SV = name_SV;
	}
	public double getDiem_SV() {
		return diem_SV;
	}
	public void setDiem_SV(double diem_SV) {
		this.diem_SV = diem_SV;
	}
	public String get_ten()
	{
		String s = this.name_SV.trim();
		if(s.indexOf(" ") >= 0)
		{
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		}
		else
		{
			return s;
		}
	}
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		String this_name = this.get_ten();
		String o_name = o.get_ten();
		return this_name.compareTo(o_name);
	}
	@Override
	public String toString() {
		return "SinhVien [iD_SV=" + iD_SV + ", name_SV=" + name_SV + ", diem_SV=" + diem_SV + "]";
	}
	

}
