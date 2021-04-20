package odev3;

public class Student extends User {
	
	private String studentNo;
	private String[] coursesEnrolled;
	
	public Student() {};
	
	public Student(int id, String firstName, String lastName, String studentNo, String[] coursesEnrolled) {
		super(id, firstName, lastName);
		this.studentNo = studentNo;
		this.coursesEnrolled = coursesEnrolled;
	}
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String[] getCoursesEnrolled() {
		return coursesEnrolled;
	}
	public void setCoursesEnrolled(String[] coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}
	

}
