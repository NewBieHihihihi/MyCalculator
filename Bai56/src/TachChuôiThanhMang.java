import java.util.Arrays;

public class TachChuôiThanhMang {
	public static void main(String[] args) {
		String s1 = "Tôi là Nhật";
	    //hàm split cắt chuỗi
		//cắt dấu cách trong s1
		String[] c = s1.split(" ");
		System.out.println(Arrays.toString(c));
		System.out.println(c[2]);
	}

}
