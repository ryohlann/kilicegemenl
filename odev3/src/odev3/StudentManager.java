package odev3;

public class StudentManager {
	
	public void add(Student user) {
		
		System.out.println("Yeni bir ��renci kay�d� yap�ld�.");
		System.out.println("Kay�t No: " + user.getId());
		System.out.println("Ad�: " + user.getFirstName());
		System.out.println("Soyad�:" + user.getLastName());
		System.out.println("��renci No:" + user.getStudentNo());
		
		String listOfCourses="";
		
			for (int i = 0; i < user.getCoursesEnrolled().length; i++) {
				
				listOfCourses += user.getCoursesEnrolled()[i];
				if ((i+1)!=user.getCoursesEnrolled().length) { listOfCourses += ", ";}
			}
		
		System.out.println("Kay�t Oldu�u Dersler: " + listOfCourses + "\r\n");
		
	}

}
