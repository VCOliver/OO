package models;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para definir usuarios padroes
 * @author VCOliver
 * @version 1.1
 */

public class User extends Person{
	
	//Attributes
	private ArrayList<Routine> routines = new ArrayList<>();
	
	//Constructor
	public User(String name, String email, String password) {
		user_name = name;
		this.password = password;
		this.email = email;
	}
	
	
	//Getters
	
	/**
	 * Returna o nome do usuario
	 * @return
	 */
	String getName() {
		return this.user_name;
	}
	
	/**
	 * retorna o email do usuario
	 * @return
	 */
	String getEmail() {
		return this.email;
	}
	
	/** 
	 * Retorna lista de rotinas do usuario
	 * @return the routines
	 */
	public ArrayList<Routine> getRoutines() {
		return routines;
	}
	
	
	//Methods

	/**
	 * Cria nova rotina para o usuario
	 * @param name
	 */
	public Routine createRoutine(String name) {
		
		Routine routine = new Routine(name, user_name);
		
		this.routines.add(routine); // Adds routine to User
		
		return routine;
		
	}

	public void deleteRoutine(Routine routine) {
		this.routines.remove(routine);
	}

	
	@Override
	public void deleteAccount() {
		
		if(DataBase.getUsers().contains(User.this)) {
			DataBase.getUsers().remove(User.this);
		}

	}	
	
}
