package ch06.sec13.exam03.pakage1;

public class B {

	public void method() {
		// 필드
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;

		a.method1();
		a.method2();
		a.method3();// 다른클래스이기에 불가능

	}

}
