package test;

import java.time.LocalDate;

class Date implements Cloneable {
	private int day;
	private int month;
	private int year;

	public Date() {
		LocalDate date = LocalDate.now();
		this.day = date.getDayOfMonth();
		this.month = date.getMonthValue();
		this.year = date.getYear();
	}

	public Date(int day, int month, int year) {
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

	@Override
	public Date clone() throws CloneNotSupportedException {
		Date date = new Date(day, month, year);
		// Date date = (Date) super.clone();
		return date;
	}

}

public class Program {

	public static void main(String[] args) {
		try {
			Date date = new Date();

			Date date1 = date.clone();

			date.setDay(4);
			System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
			System.out.println(date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
