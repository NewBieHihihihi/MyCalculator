
public class main {
	public static void main(String[] args) {
		String s1 = "Nhat";
		String s2 = "Blue";
		String s3 = ".vn";
		String s4 = s1 + s2 + s3;
		System.out.println(s4);
		//concat => nối chuỗi;
		String s5 = s1.concat(s2);
		System.out.println(s5.concat(s3));
		//hàm replace => thay thế
		String s6 = "Blue.vn";
		String s7 = s6.replaceAll("Blue", "NhatBlue");
		System.out.println(s7);
		String s8 = "nhatblue.VN";
		//Ham Viết Hoa,Viết Thường
		System.out.println(s8.toLowerCase());
		System.out.println(s8.toUpperCase());
		
	}

}
