import java.util.Objects;
import java.util.Scanner;

class NgaySinh {
	private
	int day,month,year;

	public NgaySinh(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	void InputNgaySinh()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ngay Sinh: ");
		this.day = sc.nextInt();
		System.out.print("Nhap Thang Sinh: ");
		this.month = sc.nextInt();
		System.out.print("Nhap Nam Sinh: ");
		this.year = sc.nextInt();
	}
	void OutputNgaySinh()
	{
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NgaySinh other = (NgaySinh) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
    
	
	

}
