package ch07.sec09;

public class Student extends Person{

	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);//부모클래스의 생성자 호출
		this.studentNo= studentNo;
		
	}
	
	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
