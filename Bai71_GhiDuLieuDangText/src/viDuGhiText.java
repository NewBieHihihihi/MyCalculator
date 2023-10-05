import java.io.IOException;
import java.io.PrintWriter;

public class viDuGhiText {
	public static int kiemtraSNT(int n)
	{
		int dem = 0;
		for(int i = 1 ; i <= n ; i++)
		{
			if(n % i == 0)
			{
				dem++;
			}
		}
		if(dem == 2)
		return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		int a[] = {1,5,7,71,97};
		try
		{
		PrintWriter file = new PrintWriter("E:\\GhiFile.txt","UTF-8");
		Student sv1 = new Student(282119569, "NguyenThanhNhat");
		file.println(sv1);
		file.println("array[] = {1,5,7,71,97}");
		file.print("Số nguyên tố là: ");
		for(int i = 0 ; i < 5; i++)
		{
			if(kiemtraSNT(a[i])==1)
			{
				file.print(a[i] + " ");
			}
		}
		file.flush();
		file.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
