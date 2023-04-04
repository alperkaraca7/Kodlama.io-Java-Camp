package BusinessandEntities;

public class StudentManager extends UserManager{
	
	@Override
	public void login(User[] users) {
		
		for (User user : users) {
			System.out.println("hoşgeldiniz "+user.name+"  öğrenci girişi yaptınız ");
		}
		
		
		
	}
	
	@Override
	public void add(User user) {
		System.out.println(user.name+" yeni öğrenci olarak eklendiniz");
		
	}
	

}
