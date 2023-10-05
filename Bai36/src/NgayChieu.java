
class NgayChieu {
	private int day;
	int month;
	int year;

	public NgayChieu(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	void OutputDay() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}

};
