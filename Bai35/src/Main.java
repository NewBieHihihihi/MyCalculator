
public class Main {
  public static void main(String[] args) {
	  Date tg1 = new Date(8,5,2004);
	  Date tg2 = new Date(19,6,1998);
	  Date tg3 = new Date(3,8,1990);
	  TacGia gt1 = new TacGia("Nguyen Thanh Nhat", tg1);
	  TacGia gt2 = new TacGia("Ubisoft", tg2);
	  TacGia gt3 = new TacGia("Garena", tg3);
	  Sach s1 = new Sach("Lap Trinh C#", 150,2020,gt1);
	  //s1.GiamGia(5);
	  Sach s2 = new Sach("AssinCreed 4", 300,2020,gt2);
	  //s2.GiamGia(30);
	  Sach s3 = new Sach("Ky Nang Leo Rank Vao Chu Nhat", 189,2018,gt3);
	  //s3.GiamGia(10);
	  System.out.println("Tac Gia 1: ");
	  s1.OutputSach();
	  System.out.println("Sach Duoc Giam Gia 5%: " + s1.GiamGia(5));
	  System.out.println();
	  System.out.println("Tac Gia 2: ");
	  s2.OutputSach();
	  System.out.println("Sach Duoc Giam Gia 30%: " + s2.GiamGia(30));
	  System.out.println();
	  System.out.println("Tac Gia 3: ");
	  s3.OutputSach();
	  System.out.println("Sach Duoc Giam Gia 10%: " + s3.GiamGia(10));
      System.out.println("Nam Xuat Ban s1 == s2: " + (s1.equals(s2)));
	  

	
}
}
