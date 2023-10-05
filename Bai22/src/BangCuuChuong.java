import java.util.Iterator;

public class BangCuuChuong {
	/*
	 * public static void main(String[] args) { // cachs 1 for(int i = 2 ; i <= 9 ;
	 * i++) { System.out.println("Bang Cuu Chuong" + i + ":"); for(int j = 1 ; j <=
	 * 10 ; j++) { System.out.println(i + "*" + j + "=" + (i*j)); } } }
	 */
	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 2 ; j <= 9; j++)
			{
				System.out.println(j + "*" + i + "=" + j * i);
			}
			System.out.println();
		}
	}
	
}
