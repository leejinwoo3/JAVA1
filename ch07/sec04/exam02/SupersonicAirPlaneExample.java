package ch07.sec04.exam02;

public class SupersonicAirPlaneExample {

	public static void main(String[] args) {
		SupersonicAirPlane sa = new SupersonicAirPlane();
		sa.takeOff();
		sa.fly();
		
		System.out.println();
		
		// 정적필드 호출 => 클래스명. 상수
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();
		
		System.out.println();
		
		sa.flyMode = SupersonicAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}

}
