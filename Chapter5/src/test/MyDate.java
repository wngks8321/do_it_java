package test;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isValid() {
		switch(month) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:
				if(this.day > 31) {
					return false;
				}
				break;
				
			case 2:
				if(this.day > 28) {
					return false;
				}
				break;
				
			case 4:
			case 6:
			case 8:
			case 10:
			case 12:
				if(this.day > 30) {
					return false;
				}
				break;
		}
		return true;
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
	
	
}
