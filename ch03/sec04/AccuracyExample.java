package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// 정확한 계산은 정수 연산으로 해야한다.

		int apple = 1;// 사과 1조각
		double totalPieces = apple * 10;// 10분의 1
		int number = 7;

		double result = totalPieces - number;// 10-7 =3 true
		System.out.println("사과 1개에서 남은양 " + result/10.0);

	}

}
