package quiz;

public class q5_18 {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
//	static int cv2 = iv; // static값에 인스턴스 사용불가능해서

	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); //static 변수값이 아니여서 출력 오류
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();//static 매서드에서는 인스턴스 메서드 사용불가
	}

	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
