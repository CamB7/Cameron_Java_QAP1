package Project2;

public class Date {
	private int day;
	private int month;
	private int year;

	// Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	//Getters
	public int getDay(){return day;}
	public int getMonth(){return month;}
	public int getYear(){return year;}

	//Setters
	public void setDay(int day) {this.day = day;}
	public void setMonth(int month) {this.month = month;}
	public void setYear(int year) {this.year = year;}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// toString method
	public String toString(){
		String dayStr = (day < 10 ? "0" : "") + day;
		String monthStr = (month < 10 ? "0" : "") + month;
		return "Date: " + dayStr + "/" + monthStr + "/" + year;
	}

}
