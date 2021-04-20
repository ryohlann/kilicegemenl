package odev3;

public class Instructor extends User{
	
	public String[] certifications;
	public String[]	coursesGiven;
	
	public Instructor() {}
	
	public Instructor(int id, String firstName, String lastName, String[] certifications, String[] coursesGiven) {
		super(id, firstName, lastName);
		this.certifications = certifications;
		this.coursesGiven = coursesGiven;
	}

	public String[] getCertifications() {
		return certifications;
	}

	public void setCertifications(String[] certifications) {
		this.certifications = certifications;
	}

	public String[] getCoursesGiven() {
		return coursesGiven;
	}

	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}

}
