/**
 * 
 */
package controllers;

import models.Admin;
import models.DataBase;

/**
 * @author VCOliver
 *
 */
public class AdminController {
	public static void initAdminDataBase() {
		
		if(DataBase.getAdmins().isEmpty()) {
			DataBase.getAdmins().add(new Admin("adm", "adm@gmail.com", "12345"));
		}
		
	}
}
