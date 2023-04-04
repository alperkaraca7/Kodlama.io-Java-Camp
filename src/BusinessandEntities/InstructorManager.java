package BusinessandEntities;

public class InstructorManager extends UserManager{
	
	
	@Override
	public void login(User[] users) {
		
		for (User user : users) {
			System.out.println("Eğitmen "+user.name+" hoşgeldin ");
		}
		
		
		
	}
	
	@Override
	public void add(User user) {
		System.out.println(user.name+" yeni Eğitmen olarak eklendiniz");
		
	}
}
