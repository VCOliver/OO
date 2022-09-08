package models;

public class Admin extends Person{
    
    //Constructor
    public Admin(String name, String password, String email) {
		user_name = name;
		this.password = password;
		this.email = email;
	}

    //Methods
    void createExercise(String name, String[] muscles, String description, String image){
    	
    	Exercise exercise = new Exercise(name, muscles, description, image);
    	
    	for(String m : muscles) {
    		for(Muscles muscle : Muscles.values()) {
    			if(muscle == Muscles.valueOf(m.toUpperCase())) {
    				DataBase.getExercises().get(muscle.getIndex()).add(exercise);
    			}
    		}
    	}

    }

    void editExercise(String[] muscles, String name, String image){
        
    }

}
