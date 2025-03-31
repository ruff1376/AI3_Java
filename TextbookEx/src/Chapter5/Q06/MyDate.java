package Chapter5.Q06;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
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
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isValid() {
		boolean isValidDay = day >= 1 && day <= 31;
		boolean isValidMonth = month >= 1 && month <= 12;
		boolean isValidYear = year >= 1;
		boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		if (isValidDay && isValidMonth && isValidYear) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				System.out.println("유효한 날짜입니다.");
				return true;
			}
			else if (month == 2 && isLeapYear) {
				if (day <= 29) {
					System.out.println("유효한 날짜입니다.");
					return true;
				}
				else {
					System.out.println("유효하지 않은 날짜입니다.");
					return false;
				}
			}
			else if (month == 2) {
				if (day <= 28) {
					System.out.println("유효한 날짜입니다.");
					return true;
				}
				else {
					System.out.println("유효하지 않은 날짜입니다.");
					return false;
				}
			}
			else {
				if (day <= 30) {
					System.out.println("유효한 날짜입니다.");
					return true;
				}
				else {
					System.out.println("유효하지 않은 날짜입니다.");
					return false;
				}
			}
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
			return false;
		}
	}
	
}
