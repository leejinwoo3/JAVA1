package java_modeling.ch01.asso2;

import java.util.ArrayList;

public class Student {
	private String name;
	// student student : 1일때
	private ArrayList<Course> courses;// 양방향 관계

	// 생성자
	public Student(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}

	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	//수강취소
	public void dropCourse(Course course) {
		courses.remove(course);
	}
}
