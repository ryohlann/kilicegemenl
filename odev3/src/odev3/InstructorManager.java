package odev3;

public class InstructorManager {
	
	public void add(Instructor user) {
		
		System.out.println("Yeni bir eðitmen kayýdý yapýldý.");
		System.out.println("Kayýt No: " + user.getId());
		System.out.println("Adý: " + user.getFirstName());
		System.out.println("Soyadý:" + user.getLastName());
		
		String listOfCertificates="";
		
			for (int i = 0; i < user.getCertifications().length; i++) {
				
				listOfCertificates += user.getCertifications()[i];
				if ((i+1)!=user.getCertifications().length) { listOfCertificates += ", ";}
			}
		
		System.out.println("Sertifikalarý: " + listOfCertificates);
		
		String listOfCourses="";
		
		for (int i = 0; i < user.getCoursesGiven().length; i++) {
			
			listOfCourses += user.getCoursesGiven()[i];
			if ((i+1)!=user.getCoursesGiven().length) { listOfCourses += ", ";}
		}
	
		System.out.println("Verdiði Dersler: " + listOfCourses);
	}

}
