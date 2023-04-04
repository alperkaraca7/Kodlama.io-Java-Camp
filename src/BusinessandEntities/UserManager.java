package BusinessandEntities;

public class UserManager {
	
	public void login(User[] users) {
		
		for (User user : users) {
			
			System.out.println(user.name+" hoşgeldin");
		}
		
		
	}
	
	public void add(User user) {
		System.out.println(user.name+" yeni kullanıcı olarak eklendiniz");
		
	}

}
