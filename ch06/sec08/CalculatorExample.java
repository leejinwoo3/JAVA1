package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스 (객체 ) 생성
		Calculator myCalc = new Calculator();
		Calculator myCalc2 = new Calculator();

		// 인스턴스명.메도스명();
		myCalc.powerOn();

		myCalc.plus(5, 6);
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);

		int x = 10, y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);

		myCalc.powerOff();
	}

}
