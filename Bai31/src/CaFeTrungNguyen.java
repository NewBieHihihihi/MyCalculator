import java.util.Scanner;

class CaFeTN {
	private String LoaiCafe;
	double GiaTien;
	double KhoiLuong;

	public CaFeTN(String l, double gt, double kl) {
		this.LoaiCafe = l;
		this.GiaTien = gt;
		this.KhoiLuong = kl;
	}

	void InputHoaDon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Loai Cafe: ");
		this.LoaiCafe = sc.nextLine();
		System.out.println("Nhap Gia Tien: ");
		this.GiaTien = sc.nextDouble();
		System.out.println("Nhap Khoi Luong: ");
		this.KhoiLuong = sc.nextDouble();
		sc.close();
	}

	void OutputHoaDon() {
		System.out.println("Loai Cafe: " + this.LoaiCafe);
		System.out.println("Gia Tien: " + this.GiaTien);
		System.out.println("Khoi Luong: " + this.KhoiLuong);
	}
    void KiemTraKhoiLuong()
    {
    	if(this.KhoiLuong > 2)
    	{
    		System.out.println("Khoi Luong Lon Hon 2kg");
    	}
    	else
    	{
    		System.out.println("Khoi Luong Nho Hon 2kg");
    	}
    }
    void KiemTraGiaTien()
    {
    	if(this.GiaTien > 500.000)
    	{
    		System.out.println("Gia Tien Lon Hon 500.000");
    	}
    	else
    	{
    		System.out.println("Gia Tien Nho Hon 500.000");
    	}
    }
	double ThanhTien() {
		double tinhtien;
		if(this.GiaTien <= 500.000)
		{
			System.out.println("Ban da duoc giam 10%");
			tinhtien = this.GiaTien * this.KhoiLuong * 0.9;
		}
		else
		{
			tinhtien = this.GiaTien * this.KhoiLuong;
		}
		return tinhtien;
	}

};
