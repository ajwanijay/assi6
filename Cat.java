package Animals;

public class Cat extends Pet implements Boardable {

	private String HairLength;
	private Date boardingStart, boardingEnd;

	private class Date {

		private int Day, Month, Year;

		public Date(int Day, int Month, int Year) {// comparing method less than
			this.Day = Day;
			this.Month = Month;
			this.Year = Year;
		}

		public boolean lessThan(Date date) {// comparing method greater than
			if (this.Year < date.Year)
				return true;
			else if (this.Year == date.Year) {
				if (this.Month < date.Month)
					return true;
				else if (this.Month == date.Month && this.Day <= date.Day)
					return true;
			}
			return false;
		}

		public boolean greaterThan(Date date) {
			if (this.Year > date.Year)
				return true;
			else if (this.Year == date.Year) {
				if (this.Month > date.Month)
					return true;
				else if (this.Month == date.Month && this.Day >= date.Day)
					return true;
			}
			return false;
		}
	}

	public Cat(String name, String OwnerName, String color, String hairLenght) {

		super(name, OwnerName, color);

		this.HairLength = hairLenght;

	}

	public String getHairLength() {
		return HairLength;
	}

	public String toString() {

		return super.toString() + "\nHairLength is :" + HairLength;

	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		boardingStart = new Date(day, month, year);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		boardingEnd = new Date(day, month, year);
	}

	@Override

	public boolean boarding(int month, int day, int year) {
		Date boarding = new Date(day, month, year);
		return (boarding.greaterThan(boardingStart) && boarding.lessThan(boardingEnd));
	}

}
