package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();

		Bus bus = new Bus();
		driver.dirive(bus);
		
		Taxi taxi = new Taxi();
		driver.dirive(taxi);
		
		 Vehicle vehicle = new Vehicle();
		 driver.dirive(vehicle);
	}

}
