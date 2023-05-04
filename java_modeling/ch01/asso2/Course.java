package java_modeling.ch01.asso2;

import java.util.ArrayList;

public class Course {

	private String name;
	// Course courses : 1개 일때
	private ArrayList<Student> students;

	public Course(String name) {
		this.name = name;
		students = new ArrayList<>();// n개일때, 양방향관계 => 서로가 서로의 객체를 필드로 가지고있다.
	}

	public String getName() {
		return name;
	}

	//수강신청한 학생 추가
		public void addStudent(Student student) {
			students.add(student);
		}
		
		//수강취소한 학생 제거
		public void removeStudent(Student student) {
			students.remove(student);
		}
}
