
public class Main {
	public static void main(String[] args) {
		HangSanXuat maybay = new HangSanXuat("VietNamAirLine", "VietNam");
		HangSanXuat oto = new HangSanXuat("Ferrari", "Italia");
		
		
		MayBay mayb = new MayBay("May bay", maybay, "Xang");
		PhuongTienDiChuyen otoo = new Oto("Oto 4 banh", oto, "Xang");
		System.out.println("May Bay: ");
		System.out.println("Hang SX cua may bay la: " + mayb.LayTenHSX());
		mayb.BatDau();
		System.out.println("May Bay: " + mayb.CatCanh());
		mayb.TangToc();
		System.out.println("Van Toc Cua May Bay La: " + mayb.LayVanToc()+ " km/h.");
		mayb.DungLai();
		System.out.println("May Bay: " + mayb.HaCanh());
		System.out.println("Hang SX cua oto la: " +otoo.LayTenHSX());
		System.out.println("Van Toc Cua Oto La: " + otoo.LayVanToc()+" km/h.");

	}

}
