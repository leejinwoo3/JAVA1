package ch06.sec13.exam03.pakage2;

import ch06.sec13.exam03.pakage1.A;
import ch06.sec13.exam13.pakage1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;//디폴트인데 다른 패키지에 있어서 불가능
		a.field3 = 1;//

		a.method1();
		a.method2();//디폴트인데 다른 클래스이기에 불가능
		a.method3();// 다른클래스이기에 불가능

	}
}
