package CreditCalculationProgram;

import java.util.ArrayList;

public class Subject {
	private String subjectName;
	private int subjectld;
	private int gradeType;

	private ArrayList<Student> Students = new ArrayList<>();

	public void Student(String subjectName, int subjectld) {
		this.subjectName = subjectName;
		this.subjectld = subjectld;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectld() {
		return subjectld;
	}

	public void setSubjectld(int subjectld) {
		this.subjectld = subjectld;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudents() {
		return Students;
	}

	public void setStudents(ArrayList<Student> students) {
		Students = students;
	}

	public void register(Student student) {
		Students.add(student);
	}

}
