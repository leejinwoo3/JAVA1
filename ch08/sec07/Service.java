package ch08.sec07;

public interface Service {
	default void defaultMethod1() {
		System.out.println("defaultMethod 종속코드");
		defaultCommon();
	}

	default void defaultMethod2() {
		System.out.println("defaultMethod 종속코드");
		defaultCommon();
	}

	// private 메소드
	private void defaultCommon() {
		System.out.println("defaultCommon 중복코드A");
		System.out.println("defaultCommon 중복코드B");
	}

	static void staticMethod1() {
		System.out.println("staticMethod 중속코드");
		staticCommon();
	}

	static void staticMethod2() {
		System.out.println("staticMethod 중속코드");
		staticCommon();
	}

	private static void staticCommon() {
		System.out.println("staticMethod 중복코드 C");
		System.out.println("staticMethod 중복코드 D");
	}
}
