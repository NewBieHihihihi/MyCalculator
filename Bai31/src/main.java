
public class main {
	public static void main(String[] args) {
		CaFeTN cf = new CaFeTN("Cafe chon", 100, 1.5);
		//cf.InputHoaDon();
		cf.OutputHoaDon();
		cf.KiemTraKhoiLuong();
		cf.KiemTraGiaTien();
		System.out.println("So Tien Khach Phai Tra La: " + cf.ThanhTien());
	}
}
