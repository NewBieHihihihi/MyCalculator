
public class MAIN {
	public static void main(String[] args) {
		ToaDo ht = new ToaDo(5, 8);
		ToaDo hcn = new ToaDo(3, 8);
		
		HinhHoc ht1 = new HinhTron(ht, 10);
		System.out.println("Hinh Tron Co Toa Do La: " + ht1.InToaDo());
		System.out.println("Dien Tich Hinh Tron R = 8 " + ht1.TinhDienTich());
		
		HinhHoc hcn1 = new HinhChuNhat(hcn,5,10);
		System.out.println("Hinh Chu Nhat Co Toa Do La: " + hcn1.InToaDo());
		System.out.println("Dien Tich Hinh Chu Nhat Chieu Dai = 9,Chieu Rong = 5 La: " + hcn1.TinhDienTich());

	}

}

