package Project3;

public class TestTime {
	public static void main(String[] args) {
		Time t1 = new Time(21,10,15);
		Time t2 = new Time(10,20,25);
		//Extras to show time rollover using nextSecond() and previousSecond()
		Time t3 = new Time(23,59,59);
		Time t4 = new Time(0,0,0);

		System.out.println("Times before changes");
		System.out.println("t1: " + t1 + " | t2: " + t2 + " | t3: " + t3 + " | t4: " + t4);

		t1.nextSecond();
		t2.previousSecond();
		t3.nextSecond();
		t4.previousSecond();

		System.out.println("Times after changes");
		System.out.println("t1: " + t1 + " | t2: " + t2 + " | t3: " + t3 + " | t4: " + t4);
	}
}
