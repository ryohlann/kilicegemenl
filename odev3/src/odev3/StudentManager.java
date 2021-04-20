package odev3;

public class StudentManager {
	
	public void add(Student user) {
		
		System.out.println("Yeni bir öðrenci kayýdý yapýldý.");
		System.out.println("Kayýt No: " + user.getId());
		System.out.println("Adý: " + user.getFirstName());
		System.out.println("Soyadý:" + user.getLastName());
		System.out.println("Öðrenci No:" + user.getStudentNo());
		
		String listOfCourses="";
		
			for (int i = 0; i < user.getCoursesEnrolled().length; i++) {
				
				listOfCourses += user.getCoursesEnrolled()[i];
				if ((i+1)!=user.getCoursesEnrolled().length) { listOfCourses += ", ";}
			}
		
		System.out.println("Kayýt Olduðu Dersler: " + listOfCourses + "\r\n");
		
	}

}
