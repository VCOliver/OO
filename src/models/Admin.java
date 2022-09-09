package models;

/**
 * Classe para orquestrar administradores
 * 
 * @author VCOliver
 * @version 1.1
 */
/**
 * @author VCOliver
 *
 */
public class Admin extends Person{
    
    //Constructor
    public Admin(String name, String password, String email) {
		user_name = name;
		this.password = password;
		this.email = email;
	}

    //Methods
    
    /**
     * Metodo para criar exercicios e adiciona-los a base de dados
     * 
     * @param name
     * @param muscles
     * @param description
     * @param image
     */
    void createExercise(String name, String[] muscles, String description, String image){
    	
    	Exercise exercise = new Exercise(name, muscles, description, image);
   	
    	for(String muscle : muscles) {
    		DataBase.getExercises().get(muscle).add(exercise);
    	}

    }

    /**
     * Método para editar os exercícios, modifica qualquer valor não nulo ou vazio
     * 
     * @param exer
     * @param name
     * @param muscles
     * @param description
     * @param image
     */
    public void editExercise(Exercise exer, String name, String[] muscles, String description, String image){
    	for(String muscle : exer.getMuscles()) {	
    		for(Exercise exercise : DataBase.getExercises().get(muscle)) {
	    		if(exercise == exer) {
	    			if(name != null && !name.trim().isEmpty()) 				 exercise.setName(name);
	    			if(muscles != null && muscles.length != 0) 				 exercise.setMuscles(muscles);
	    			if(description != null && !description.trim().isEmpty()) exercise.setDescription(description);
	    			if(image != null && !image.trim().isEmpty()) 			 exercise.setImage(image);
    			}
    			
    		}
    	}
    }
    
    public void deleteExercise(Exercise exercise) {
    	for(String muscle : exercise.getMuscles()) {	
    		DataBase.getExercises().get(muscle).remove(exercise);
    	}
    }

    /**
     * Metodo para deletar atual instancia de administrador da base de dados
     */
	@Override
	public void deleteAccount() {
		DataBase.getAdmins().remove(Admin.this);
	}
    
    

}
