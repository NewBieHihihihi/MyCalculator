import java.util.Objects;
import java.util.Scanner;

class Date// declare a class named date
{
	private // AccessModifier Private
	int day, month, year;

	public // AccessModifire Public
	Date(int d, int m, int y)// Constructor has PARAMETERS
	{
		if(d >= 1 && d <= 31 && m >= 1 && m <= 12 && y >=1 )
		{
		this.day = d;
		this.month = m;
		this.year = y;
		}
		else this.day = this.month = this.year = 1;
	}

	void input()// funcion enters Date
	{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter Day: ");
			this.day = sc.nextInt();
			System.out.print("Enter Month: ");
			this.month = sc.nextInt();
			System.out.print("Enter Year: ");
			this.year = sc.nextInt();
			if (this.day <= 0 || this.day > 31 || this.month <= 0 || this.month > 12) {
				System.out.println("Enter Again: ");
			}
		} while (this.day <= 0 || this.day > 31 || this.month <= 0 || this.month > 12);
		sc.close();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int d) {
		if (d >= 1 && d <= 31)
			this.day = d;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int m) {
		if (m >= 1 && m <= 12)
			this.month = m;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		if (y >= 1)
			this.year = y;
	}

	void output()// funcion displays Date
	{
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day == other.day && month == other.month && year == other.year)
		{
		return true;
		}
		else
			return false;
	}

};
