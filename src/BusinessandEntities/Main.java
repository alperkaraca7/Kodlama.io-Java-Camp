package BusinessandEntities;

public class Main {

	public static void main(String[] args) {
		
		User user1= new User(78,"alper","karaca");
		User user2 = new User(34, "kerim", "bal");
		
		Student student1 = new Student(84, "mahmut", "yas");
		Student student2 = new Student(789, "Şahin", "Yel");
		
		
		Instructor instructor1 = new Instructor(4455, "engin", "demirog");
		Instructor instructor2 = new Instructor(456, "Enes", "kalaycı");
		

		User[] users = {user1,user2};
		User[] instructors = {instructor1,instructor2}; 
		User[] students = {student1,student2};
		
		UserManager usermanager = new UserManager();
		usermanager.login(users);
		usermanager.add(user1);
		
		
		System.out.println("***************");
		
		
		StudentManager studentmanager  = new StudentManager();
		studentmanager.add(student1);
		studentmanager.login(students);
		
		System.out.println("***************");
		
		InstructorManager instructormanager = new InstructorManager();
		instructormanager.add(instructor1);
		instructormanager.login(instructors);
		
	}

}
