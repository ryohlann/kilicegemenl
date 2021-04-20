package odev3;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println("Yeni kiþi eklendi. Eklenen kiþi bilgiler -->");
		System.out.println("Kayýt No: " + user.getId());
		System.out.println("Adý: " + user.getFirstName());
		System.out.println("Soyadý:" + user.getLastName());
		
	}

}
