package Animals;

public class Dog extends Pet implements Boardable {

	private String Size;
	private Date boardingStart, boardingEnd;

	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.Size = size;

	}

	public String getSize() {
		return Size;
	}

	private class Date {

		private int Day, Month, Year;

		public Date(int Day, int Month, int Year) {
			this.Day = Day;
			this.Month = Month;
			this.Year = Year;
		}
		// comparing method less than

		public boolean lessThan(Date date) {
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
		// comparing method greater than

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

	public String toString() {
		return super.toString() + "\n Size is:" + Size;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		boardingStart = new Date(day, month, year);

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		boardingEnd = new Date(day, month, year);

	}

	@Override
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		Date boarding = new Date(day, month, year);
		return (boarding.greaterThan(boardingStart) && boarding.lessThan(boardingEnd));

	}
}