package Project3;

public class Time {
	// Instance Variables
	private int hour;
	private int minute;
	private int second;

	// Constructor
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	//Getters
	public int getHour(){return hour;}
	public int getMinute(){return minute;}
	public int getSecond(){return second;}

	//Setters
	public void setHour(int hour){this.hour = hour;}
	public void setMinute(int minute){this.minute = minute;}
	public void setSecond(int second){this.second = second;}
	public void setTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	//Mutators
	public void nextSecond() {
		second++;
		if (second >= 60) {
			second = 0;
			minute++;
			if (minute >= 60) {
				minute = 0;
				hour = (hour + 1) % 24;
			}
		}
	}

	public void previousSecond() {
		second--;
		if (second < 0) {
			second = 59;
			minute--;
			if (minute < 0) {
				minute = 59;
				hour--;
				if (hour < 0) {
					hour = 23;
				}
			}
		}
	}


	//toString method
	public String toString(){
		String hourStr = (hour < 10 ? "0" : "") + hour;
		String minuteStr = (minute < 10 ? "0" : "") + minute;
		String secondStr = (second < 10 ? "0" : "") + second;

		return hourStr + ":" + minuteStr + ":" + secondStr;
	}
}
