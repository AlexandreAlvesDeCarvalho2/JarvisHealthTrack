package br.com.Jarvis.HealthTrack;

import java.io.Serializable;

/**
 * Classe que abstrai uma atividade
 * @author alexa
 * @version 1.0
 */

public class Atividade implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * Nome da Atividade
	 */
	private String nomeAtividade;
	/**
	 * Data da Atividade
	 */
	private String dataAtividade;
	/**
	 * Tempo total da Atividade
	 */
	private String tempoTotalAtividade;
	/**
	 * caloria total da atividade
	 */
	private String caloriaAtividade;
	
	/**
	 * Declarando construtor Atividade
	 * @param dataAtividade
	 * @param nomeAtividade
	 * @param tempoTotalAtividade
	 * @param caloriaAtividade
	 */
	
	public Atividade(String nomeAtividade, String dataAtividade, String tempoTotalAtividade, String caloriaAtividade) {
		this.nomeAtividade = nomeAtividade;
		this.caloriaAtividade = caloriaAtividade;
		this.dataAtividade= dataAtividade;
		this.tempoTotalAtividade = tempoTotalAtividade;
	}
	/**
	 * declarando um construtor padrao
	 */
	
	public Atividade() {
		
	}
	public String getNomeAtividade() {
		return nomeAtividade;
	}
	/**
	 * Altera o nome da Atividade	
	 * @param nomeAtividade
	 */
	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}
	/**
	 * verifica a data da atividade
	 * @return dataAtividade
	 */

	public String getDataAtividade() {
		return dataAtividade;
	}
	/**
	 * Altera o nome da Atividade
	 * @param dataAtividade
	 */

	public void setDataAtividade(String dataAtividade) {
		this.dataAtividade = dataAtividade;
	}
	/**
	 * verifica o tempo total da Atividade
	 * @return tempoTotalAtividade
	 */
	

	public String getTempoTotalAtividade() {
		return tempoTotalAtividade;
	}
	/**
	 * Altera o tempo toral da Atividade
	 * @param tempoTotalAtividade
	 */

	public void setTempoTotalAtividade(String tempoTotalAtividade) {
		this.tempoTotalAtividade = tempoTotalAtividade;
	}
	
	/**
	 * verifica as calorias gastas na atividade
	 * @return caloriaAtividade
	 */

	public String getCaloriaAtividade() {
		return caloriaAtividade;
	}
	/**
	 * Altera as calorias gastas na atividade
	 * @param caloriaAtividade
	 */

	public void setCaloriaAtividade(String caloriaAtividade) {
		this.caloriaAtividade = caloriaAtividade;
	}

}
