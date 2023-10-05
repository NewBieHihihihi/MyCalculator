
public class main {
	public static void main(String[] args) {
		String s1 = "nhatblue.com";
		String s2 = "NHATBLUE.com";
		String s3 = "nhatblue.com";
		
		//hàm equals so sánh 2 chuỗi = nhau, có phân biệt chữ hoa. 
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		
		//ham equalsIgnoreCase so sánh 2 chuỗi = nhau, không có phân biệt chữ hoa. 
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		
		//ham compareto
		String sv1 = "Nguyen Thanh Nhat";
		String sv2 = "Nguyen Thanh Nhat";
		String sv3 = "Nguyen Thi Nhi";
		String sv4 = "Nguyen Thanh Tung";
		System.out.println("Sv1 compareti sv2: " + sv1.compareTo(sv2));
		System.out.println("Sv1 compareti sv2: " + sv1.compareTo(sv3));
		System.out.println("Sv1 compareti sv2: " + sv1.compareTo(sv4));
		
		//ham compareToIgnoreCase
		System.out.println("Sv1 compareToIgnoreCase Sb2: " + sv1.compareToIgnoreCase(sv3));
		
		//ham regionMatches => so sanh 1 doan
		String sf1 = "nhat.Blue";
		String sf2 = "nhat.Blue";
		boolean check = sf1.regionMatches(5, sf2,6, 4);
		System.out.println(check);
		
		System.out.println("startsWith");
		//ham startsWith => ham kt chôi bat dau bang
		String sdt = "0764078204";
		System.out.println(sdt.startsWith("0764"));
		if(sdt.startsWith("0764") == true)
		{
			System.out.println("So Nha Mang Mobi");
		}

		
	}

}
