import java.util.Arrays;

public class Arrray {
	public static void main(String[] args) {
		int[] arr  = {8,5,4};
		int[] arr_a = arr;
		arr_a[2] = 2004;
		//Copy mảng cách 1 cách này là tham chiếu,khi arr_a thay đổi
		//thì arr cũng thay đổi
		System.out.println("Mảng arr: " + Arrays.toString(arr));
		System.out.println("Mảng arr_a: " + Arrays.toString(arr_a));
		//Copy mảng cách 2 -> dùng hàm clone
		//khi arr_b thay đổi thì arr vẫn giữ nguyên ban đầu
		int[] arr_b = arr.clone();
		arr_b[0] = 20;
		System.out.println("Mảng arr_b: " + Arrays.toString(arr_b));
		//Copy mảng cách 3 -> dùng hàm System.arrCopy
		int[] arr_c = new int[arr.length];
		System.arraycopy(arr, 0, arr_c, 0, arr_c.length);
		arr_c[0] = 70;
		System.out.println("Mảng arr_c: " + Arrays.toString(arr_c));
		System.out.println("Copy mang string: ");
		String[] a = {"NhatBlue",".vn"};
		System.out.println("Mảng ban đầu: "+ a[0] + a[1]);
		//copy c1
		String[] a1 = a;
		a1[1] = ".com";
		System.out.println("Mảng sau khi thêm a1: " + a1[0] + a1[1]);
		System.out.println("Mảng ban đầu: "+ a[0] + a[1]);
		//copy c2
		String[] a2 = a.clone();
		a2[0] = "NHAT";
		System.out.println("Mảng a2: " + Arrays.toString(a2));
	}

}
