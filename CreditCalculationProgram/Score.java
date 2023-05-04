package CreditCalculationProgram;

import java.util.ArrayList;

public class Score {

	private int studentid;
	private Subject subject;
	private int point;

	public Score(int studentid, Subject subject, int point) {
		this.studentid = studentid;
		this.subject = subject;
		this.point = point;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String toString() {
		return "학번:" + studentid + "," + subject.getSubjectName() + ":" + point;
	}

}
