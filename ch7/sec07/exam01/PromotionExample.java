package ch7.sec07.exam01;

// 중첩 클래스
class A {

}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// 자동 타입 변환
		A a1 = b; //자식 - 부모
		A a2 = c;
		A a3 = d;//손주 - 할아버지
		A a4 = e;
//
		B b3 = e;
		C c2 = d;
	}

}
