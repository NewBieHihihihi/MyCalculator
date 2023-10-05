import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class VidDocDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\input.txt");
			InputStream is = new FileInputStream(file);
			ObjectInputStream obs = new ObjectInputStream(is);
			SinhVien sv = (SinhVien) obs.readObject();//Ép kiểu
			System.out.println(sv);
			obs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	};

}
