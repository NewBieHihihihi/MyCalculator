
public class MayTinhVinaCal500 implements MayTinhBoTui_Interface{

	@Override
	public double Cong(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double Tru(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double Nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double Chia(double a, double b) {
		if(b == 0)
		{
			return 0;
		}
		else
		{
			return a / b;
		}
	}

}
