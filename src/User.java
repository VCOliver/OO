import java.util.ArrayList;
import java.util.List;

public class User extends Person{
	
	//Attributes
	List<Routine> routines = new ArrayList<>();
	
	//Constructor
	public User(String name, String password, String email) {
		user_name = name;
		this.password = password;
		this.email = email;
	}
	
	
	//Getters
	String getName() {
		return this.user_name;
	}
	
	String getEmail() {
		return this.email;
	}
	
	//Methods
	void createRoutine(String name) {
		Routine routine = new Routine(name, user_name);
		
		this.routines.add(routine); // Adds routine to User
	}

	void deleteRoutine(String name) {

	}
	
}