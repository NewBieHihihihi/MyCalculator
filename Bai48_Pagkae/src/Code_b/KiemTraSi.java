package Code_b;

public class KiemTraSi {
	public boolean kiemtraSNT(int n)
	{
		int sum = 0,dem = 0;
		for(int i = 1 ; i <= n ; i++)
		{
			if(n % i == 0)
			{
				dem++;
			}
		}
		if(dem == 2)
		{
			return true;
		}
		return false;
	}

}
