package models;
/**
 * Abstract class para padronizar tipos de usuarios
 * 
 * @author VCOliver
 * @version 1.0
 *
 */
public abstract class Person {
	
	//Attributes
	protected String user_name;
	protected String password;
	protected String email;

	// Methods
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}

	public void deleteAccount() {}	
	
	
}

