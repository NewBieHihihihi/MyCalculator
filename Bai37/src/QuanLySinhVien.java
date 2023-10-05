import java.util.Scanner;

class QuanLySinhVien {
	private
	int n;
	SinhVien list[];
	public
	void NhapThongTinSV()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap So Luong Sinh Vien: ");
		n = sc.nextInt();
		this.list = new SinhVien[n];
		for(int i = 0 ; i < n ; i++)
		{
		   System.out.println("Nhap Sinh Vien Thu " + (i+1) + ":");
		   this.list[i] = new SinhVien(0, null, null, 0, null);
		   this.list[i].NhapThongTinSinhVien();
		}
		
	}
	void InThongTinSinhVien()
	{
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Thong Tin Sinh Vien Thu " +(i+1)+ ":");
			this.list[i].XuatThongTinSinhVien();
		}
	}
	void KiemTraSinhVien()
	{
		System.out.println("Ten Sinh Vien Diem TB > 5.0: ");
		for(int i = 0 ; i < n ; i++)
		{
			if(this.list[i].getDiemTrungBinh() > 5.0)
			{
				System.out.println("Ten Sinh Vien Dau: " + this.list[i].getHoVaTen());
			}
		}
	}
	void KiemTraNgaySinhGiongNhau() {
	    System.out.println("Ten Cua SV Co Ngay Sinh Giong Nhau: ");
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (this.list[i].equals(this.list[j])) {
	                System.out.println("TenSV: " + this.list[i].hoVaTen);
	                System.out.println("TenSV: " + this.list[j].hoVaTen);
	            } else {
	                System.out.println("Khong Co Ngay Sinh Giong Nhau.");
	            }
	        }
	    }
	}
	void SapSep()
	{
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i + 1 ; j < n ; j++)
			{
				if(list[i].getDiemTrungBinh() > list[j].getDiemTrungBinh())
				{
					SinhVien tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
		}
	}


}
