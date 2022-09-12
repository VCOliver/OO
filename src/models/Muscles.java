package models;
/**
 * 
 * Enumeracao para padronizar os tipos de musculos ou grupamentos de musculos.
 * 
 * @author VCOliver
 * @version 1.2
 *
 */
public enum Muscles {
	
	BICEPS(0, "Biceps"), 
	TRICEPS(1, "Triceps"), 
	COSTAS(2, "Costas"), 
	PEITO(3, "Peito"), 
	OMBROS(4, "Ombros"), 
	PERNAS(5, "Pernas"), 
	PANTURRILHA(6, "Panturrilha"), 
	PESCOCO(7, "Pescoco");
	
	private final int index;
	private final String value;
	
	/**
	 * Enum constructor para criar relação valor, index e enum
	 */
	Muscles(int index, String value){
		this.index = index;
		this.value = value;
	}
	
	/**
	 * returna o valor do enum
	 * @return the String value	
	 */
	public String getValue() {
		return value;
	}

	/**
	 * retorna o index do enum
	 * @return the int index
	 */
	public int getIndex() {
		return index;
	}
	
}
