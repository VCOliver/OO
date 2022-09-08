package models;
/**
 * Classe para definir exercicios
 * @author VCOliver
 *
 */

public class Exercise {
	
    //Atributes
    private String name;
    private String[] muscles;
    private int sets;
    private int reps;
    private double weight;
    private int rest;
    private String description;
    private String image;


	//Constructor
	public Exercise(String name, String[] muscles, String description, String image) {
		this.name = name;
		this.muscles = muscles;
		this.description = description;
		this.image = image;
	}
	
	
	//Getters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the muscles
	 */
	public String[] getMuscles() {
		return muscles;
	}

	/**
	 * @return the sets
	 */
	public int getSets() {
		return sets;
	}

	/**
	 * @return the reps
	 */
	public int getReps() {
		return reps;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @return the rest
	 */
	public int getRest() {
		return rest;
	}

	/**
	 * @return the descriptions
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	
	//Setters
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param muscles the muscles to set
	 */
	public void setMuscles(String[] muscles) {
		this.muscles = muscles;
	}

	/**
	 * @param sets the sets to set
	 */
	public void setSets(int sets) {
		this.sets = sets;
	}

	/**
	 * @param reps the reps to set
	 */
	public void setReps(int reps) {
		this.reps = reps;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @param rest the rest to set
	 */
	public void setRest(int rest) {
		this.rest = rest;
	}

	/**
	 * @param descriptions the descriptions to set
	 */
	public void setDescription(String descriptions) {
		this.description = descriptions;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

}
