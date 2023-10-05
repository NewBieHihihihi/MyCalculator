
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(19, 6, 2010);
		Ngay ngay2 = new Ngay(13, 1, 2013);
		Ngay ngay3 = new Ngay(9, 9, 2014);
		
		QuocGia quocgia1 = new QuocGia("USA", "America");
		QuocGia quocgia2 = new QuocGia("ENG", "EngLand");
		QuocGia quocgia3 = new QuocGia("VN", "VietNam");
		
		HangSanXuat sx1 = new HangSanXuat("Dell", quocgia1);
		HangSanXuat sx2 = new HangSanXuat("Asus", quocgia2);
		HangSanXuat sx3 = new HangSanXuat("Casio", quocgia3);
		
		QuanLyMayTinh mt1 = new QuanLyMayTinh(sx1, 15000000, ngay1);
		QuanLyMayTinh mt2 = new QuanLyMayTinh(sx2, 19000000, ngay2);
		QuanLyMayTinh mt3 = new QuanLyMayTinh(sx3, 400000, ngay3);
		
		System.out.println("May tinh 1 gia thap hon mt2: " + mt1.KiemTraGiaThap(mt2));
		
		System.out.println("Ten Quoc Gia May Tinh 1: " + mt1.TenQuocGia());
		System.out.println("Ten Quoc Gia May Tinh 2: " + mt2.TenQuocGia());
		System.out.println("Ten Quoc Gia May Tinh 3: " + mt3.TenQuocGia());
	}

}
