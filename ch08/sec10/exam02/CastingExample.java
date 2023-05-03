package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();// 자동 타입 변환
		vehicle.run();// 오버라이드 된 메소드 실행
		// vehicle.checkFare(); // 자식의 클래스 고유의 메소드, 필드는 실행이 안된다. => 강제 타입 변환으로 해결

		// 강제 타입 변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
		
		
		
	}

}
