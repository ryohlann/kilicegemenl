package odev3;

public class InstructorManager {
	
	public void add(Instructor user) {
		
		System.out.println("Yeni bir e�itmen kay�d� yap�ld�.");
		System.out.println("Kay�t No: " + user.getId());
		System.out.println("Ad�: " + user.getFirstName());
		System.out.println("Soyad�:" + user.getLastName());
		
		String listOfCertificates="";
		
			for (int i = 0; i < user.getCertifications().length; i++) {
				
				listOfCertificates += user.getCertifications()[i];
				if ((i+1)!=user.getCertifications().length) { listOfCertificates += ", ";}
			}
		
		System.out.println("Sertifikalar�: " + listOfCertificates);
		
		String listOfCourses="";
		
		for (int i = 0; i < user.getCoursesGiven().length; i++) {
			
			listOfCourses += user.getCoursesGiven()[i];
			if ((i+1)!=user.getCoursesGiven().length) { listOfCourses += ", ";}
		}
	
		System.out.println("Verdi�i Dersler: " + listOfCourses);
	}

}
