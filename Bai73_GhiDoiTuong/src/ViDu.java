import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDu {
	public static void main(String[] args) {
		System.out.println("Hello Nhật Đẹp Trai");
		try {
			File file = new File("E:\\input.txt");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			SinhVien sv = new SinhVien("28211", "NGUYỄN THANH NHẬT", 2004, 9.8);
			oos.writeObject(sv);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
}
