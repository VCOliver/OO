/**
 * 
 */
package controllers;

import java.util.ArrayList;

import models.DataBase;
import models.Muscles;

/**
 * @author VCOliver
 *
 */
public class MuscleController {
	
	public static String[] getMuscleArray(){
		
		String[] muscles = new String[8];
		
		for(Muscles muscle : Muscles.values()) {	
			muscles[muscle.getIndex()] = muscle.getValue();
		}
		
		return muscles;
	}
	
	
}
