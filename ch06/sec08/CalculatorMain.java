package ch06.sec08;

public class CalculatorMain {

	public static void powerOn() {
		System.out.println("전원을 켭니다.");

	}

	public static int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	public static void main(String[] args) {
		// 리턴값이 없는 메소드
		powerOn();
		int result = plus(10, 20);
		System.out.println(result);

	}

}
