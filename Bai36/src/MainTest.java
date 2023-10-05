
public class MainTest {
	public static void main(String[] args) {
		NgayChieu nc1 = new NgayChieu(29,8,2023);
		NgayChieu nc2 = new NgayChieu(20,8,2023);
		NgayChieu nc3 = new NgayChieu(19,9,2023);
		
		HangSanXuat hsx1 = new HangSanXuat("Mavel Studios", "America");
		HangSanXuat hsx2 = new HangSanXuat("Lightstorm Entertainment", "America");
		HangSanXuat hsx3 = new HangSanXuat("Warner Bros", "America");
		HangSanXuat hsx4 = new HangSanXuat("Hoai Linh", "VietNam");
		
		System.out.println("Phim Thu 1: ");
		QuanLyPhim ql1 = new QuanLyPhim("IronMan",2023,89.000,hsx1,nc1);
		ql1.OutputPhim();
		System.out.println();
		System.out.println("Phim Thu 2: ");
		QuanLyPhim ql2 = new QuanLyPhim("Avatar",2023,129.000,hsx2,nc2);
		ql2.OutputPhim();
		System.out.println();
		System.out.println("Phim Thu 3: ");
		QuanLyPhim ql3 = new QuanLyPhim("Batman",2023,99.000,hsx3,nc3);
		ql3.OutputPhim();
		//Lay Ten Hsx;
		System.out.println();
		System.out.println("Ten Hang San Xuat Cua Ironman: " + ql1.LayTenHangSX());
		System.out.println();
		//Kiem Tra Gia Ve Re;
		System.out.println("Gia Ve Phim Mavel Re Hon Phim Avatar: " + ql1.GiaVeRe(ql2));
		System.out.println("Gia Ve Phim BatMan Dat Hon Phim Avatar: " + ql2.GiaVeRe(ql3));
		//Giam Gia Ve
		System.out.println();
		System.out.println("Gia Ve Phim IronMan Khi Giam 10%: " + ql1.GiamGia(10));
		System.out.println("Gia Ve Phim Avatar Khi Giam 15%: " + ql2.GiamGia(15));
		System.out.println("Gia Ve Phim BatMan Khi Giam 12%: " + ql3.GiamGia(12));
	}
}
