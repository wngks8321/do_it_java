package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student james = new Student("james", 5000);
		Student tomas = new Student("tomas", 10000);
		Student edward = new Student("edward", 20000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi1234 = new Taxi(1234);
		edward.takeTaxi(taxi1234);
		edward.showInfo();
		taxi1234.showInfo();
	}

}
