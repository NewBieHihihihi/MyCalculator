
public class Main {
    public static void main(String[] args) {
		System.out.println("Test Câu a)");
		MayTinhCasioFX500 maytinh = new MayTinhCasioFX500();
		MayTinhVinaCal500 mtvnc = new MayTinhVinaCal500();
		System.out.println("Test FX500:");
		
		System.out.println("Hiệu 2 số (5 và 9): " + maytinh.Tru(10, 9));
		System.out.println("Thương 2 số(5 và 5): " + maytinh.Chia(5, 5));
		
		System.out.println("Test VNC500:");
		System.out.println("Tổng 2 số(10 và 1000): " + mtvnc.Cong(10, 1000));
		System.out.println("Tích 2 số(3849 và 1234: " + mtvnc.Nhan(3849, 1234));



	} 
}
