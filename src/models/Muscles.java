package models;
/**
 * 
 * Enumeracao para padronizar os tipos de musculos ou grupamentos de musculos.
 * 
 * @author VCOliver
 *
 */
public enum Muscles {

	BICEPS(0), 
	TRICEPS(1), 
	COSTAS(2), 
	PEITO(3), 
	OMBROS(4), 
	PERNAS(5), 
	PANTURRILHA(6), 
	PESCOCO(7);
	
	private final int index;
	
	/**
	 * Enum constructor para criar relacao index e valor
	 * 
	 * @param int index 
	 * 
	 */
	
	Muscles (int index){
		this.index = index;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	
}
