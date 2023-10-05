import java.util.Arrays;

public class TestSV {
	public static void main(String[] args) {
		SinhVien A = new SinhVien(9569, "Nguyễn Thanh Nhật", 9.2);
		SinhVien B = new SinhVien(3492, "Nguyễn Thị Hà Giang", 9.8);
		SinhVien C = new SinhVien(9766, "Trương Đình Huy", 9.1);
		SinhVien list[] = new SinhVien[]{A,B,C};
		System.out.println("Ban đầu: " + Arrays.toString(list));
		//hàm sắp sếp
		Arrays.sort(list);
		System.out.println();
		System.out.println("Sau Khi SX: " + Arrays.toString(list));
		//tìm kiếm
		System.out.println("Sinh Viên Tên Nhật ở vị trí: " + Arrays.binarySearch(list, A));
	}

}
