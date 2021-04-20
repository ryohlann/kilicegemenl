package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setId(1);
		student.setFirstName("Egemen");
		student.setLastName("KILI�");
		student.setStudentNo("196");
		student.setCoursesEnrolled(new String[] {"C# ile OOP","Java React Kamp�"});
		
		Instructor instructor=new Instructor(2,"Engin","Demiro�", new String[] {"MCP","Cisco Professional"},new String[] {"C# ile OOP", "Java React Kamp�"});
		
		StudentManager studentManager=new StudentManager();
		
		studentManager.add(student);
		
		InstructorManager instructorManager=new InstructorManager();
		
		instructorManager.add(instructor);
		
	}

}
