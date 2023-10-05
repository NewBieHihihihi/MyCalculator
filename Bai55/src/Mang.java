import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Mang {
	public static int[] giamdan (int x[])
	{
		int tmp[] = new int[x.length];
		int index = 0;
		for(int i = x.length - 1 ; i >= 0 ; i--)
		{
			tmp[index] = x[i];
			index ++;
		}
		return tmp;
	}
	public static void main(String[] args) {
		/*
		 * Random random = new Random(System.currentTimeMillis()); //hàm random số qua
		 * time int a[] = new int[10]; //cấp phát cho a[] có 10 ô nhớ chứa pt int int
		 * b[] = new int[10]; for(int i = 0 ; i < a.length ; i++) { a[i] =
		 * random.nextInt(100); b[i] = random.nextInt(100); }
		 */
		int c[] = new int[]{4,6,2,7,5,1,0,9};
		int d[] = new int[5];
		for(int i = 0 ; i < c.length ; i++)
		{
			System.out.print("c[" + i + "]:" + c[i] + "  ");
		}
		System.out.println();
		//hàm sắp xếp tăng dần
		Arrays.sort(c);
		System.out.println("Sau khi sắp sếp tăng dần: ");
		for(int i = 0 ; i < c.length ; i++)
		{
			System.out.print("c[" + i + "]:" + c[i] + "  ");
		}
		System.out.println();
		//hàm tìm kiếm
		int index = Arrays.binarySearch(c, 7);
		System.out.println("Vị trí số 7 trong mảng c là: " + index);
		//hàm điền giá trị
		Arrays.fill(d, 12);
		for(int i = 0 ; i < d.length ; i++)
		{
			System.out.print("d[" + i + "]:" + d[i] + "  ");
		}
		System.out.println();

		//hàm sắp xếp giảm dần
		c  = Mang.giamdan(c);
		System.out.println("Mảng sau khi sx giảm: " + Arrays.toString(c));
		
		
	}

}
