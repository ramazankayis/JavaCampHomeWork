package Gün3Ödev2;

public class Student extends User{

	private String studentNumber;
	private int courseCount;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, String identityNumber, String email, String password,
			String studentNumber, int courseCount) {
		super(id, firstName, lastName, identityNumber, email, password);
		this.studentNumber = studentNumber;
		this.courseCount = courseCount;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
}
