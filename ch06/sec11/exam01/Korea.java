package ch06.sec11.exam01;

public class Korea {
	final String nation = "대한민국";
	final String ssn;//final은 초기값을 줘야하고 생성자에서도 줄수 있다.

	String name;

	public Korea(String name,String ssn) {
		this.ssn = ssn;
		this.name = name;
	}
}
