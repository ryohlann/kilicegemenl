package odev3;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println("Yeni ki�i eklendi. Eklenen ki�i bilgiler -->");
		System.out.println("Kay�t No: " + user.getId());
		System.out.println("Ad�: " + user.getFirstName());
		System.out.println("Soyad�:" + user.getLastName());
		
	}

}
