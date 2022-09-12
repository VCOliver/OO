package models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Classe utilizada para armazenar todos os bancos de dados
 * 
 * @author Victor Cruz de Oliveira
 * @see Exercise
 * @see User
 * @see Admin
 */

public class DataBase {

	/**
	 * HashMap para armazerar os exercicios e seus respectivos musculos associados
	 * @see Exercise
	 */
	private static HashMap<String, ArrayList<Exercise>> exercises = new HashMap<>();

	/**
	 * Array para armazenar usuarios
	 * @see User
	 */
	private static ArrayList<User> users = new ArrayList<>();
	
	/**
	 * Array para armazenar admins
	 * @see Admin
	 */
	private static ArrayList<Admin> admins = new ArrayList<>();

	
	// Getters
	
	/**
	 * Returna Mapa de exercicios 
	 * @return the exercises
	 */
	public static HashMap<String, ArrayList<Exercise>> getExercises() {
		return exercises;
	}

	/**
	 * Retorna lista de usuarios
	 * @return the users
	 */
	public static ArrayList<User> getUsers() {
		return users;
	}

	/**
	 * Retorna lista de admins
	 * @return the admins
	 */
	public static ArrayList<Admin> getAdmins() {
		return admins;
	}
	
	
}
