package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe responsável por representar uma carona.
 * 
 * @author Yorras Gomes, Fábio Dantas
 *
 */
public class Carona {

	private String origem;
	private String destino;
	private String cidade;
	private LocalDate data;
	private LocalTime hora;
	private int vagas;
	private boolean municipal;
	private LocalDate dataVolta;
	private int minimoCaroneiros;
	private String idUsuario;
	
	/**
	 * Construtor padrão.
	 */
	public Carona(){
		
	}
	
	/**
	 * Construtor que recebe a origem, o destino, a data, a saida e a quantidade de vagas da carona.
	 * Cria uma carona.
	 * 
	 * @param origem origem da carona
	 * @param destino destino da carona
	 * @param data data da carona
	 * @param saida saida da carona
	 * @param vagas quantidade de vagas da carona
	 */
	public Carona(String origem, String destino, LocalDate data, LocalTime saida, int vagas) {
		this.origem = origem;
		this.destino = destino;
		this.cidade = null;
		this.data = data;
		this.hora = saida;
		this.vagas = vagas;
		this.municipal = false;
		this.dataVolta = null;
		this.minimoCaroneiros = 0;
	}
	
	/**
	 * Construtor que recebe a origem, o destino, a cidade, a data, a saida e a quantidade de vagas da carona.
	 * Cria uma carona municipal.
	 * 
	 * @param origem
	 * @param destino
	 * @param cidade
	 * @param data
	 * @param saida
	 * @param vagas
	 */
	public Carona(String origem, String destino, String cidade, LocalDate data, LocalTime saida, int vagas) {
		this.origem = origem;
		this.destino = destino;
		this.cidade = cidade;
		this.data = data;
		this.hora = saida;
		this.vagas = vagas;
		this.municipal = true;
		this.dataVolta = null;
		this.minimoCaroneiros = 0;
	}
	
	/**
	 * Construtor que recebe a origem, o destino, a data de ida, a data de volta, a hora e o mínimo de caroneiros necessários para a carona.
	 * Cria uma carona relâmpago.
	 * 
	 * @param origem origem da carona
	 * @param destino destino da carona
	 * @param dataIda data de ida da carona
	 * @param dataVolta data de volta da carona
	 * @param hora hora da carona
	 * @param minimoCaroneiros mínimo de caroneiros necessários para a carona
	 */
	public Carona(String origem, String destino, LocalDate dataIda, LocalDate dataVolta, LocalTime hora,
			int minimoCaroneiros) {
		this.origem = origem;
		this.destino = destino;
		this.data = dataIda;
		this.dataVolta = dataVolta;
		this.hora = hora;
		this.minimoCaroneiros = minimoCaroneiros;
		this.cidade = null;
		this.vagas = -1;
	}

	/**
	 * 
	 * @return origem da carona
	 */
	public String getOrigem() {
		return origem;
	}

	/**
	 * 
	 * @return destino da carona
	 */
	public String getDestino() {
		return destino;
	}	

	/**
	 * 
	 * @return cidade da carona
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * 
	 * @return data da carona
	 */
	public String getData() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formato.format(data);
	}	

	/**
	 * 
	 * @return hora da carona
	 */
	public String getHora() {
		return hora.toString();
	}
	
	/**
	 * 
	 * @return vagas da carona
	 */
	public int getVagas() {
		return vagas;
	}	

	/**
	 * 
	 * @return id do usuário
	 */
	public String getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * 
	 * @return true = carona municipal
	 */
	public boolean getMunicipal() {
		return municipal;
	}

	/**
	 * 
	 * @return data de volta da carona
	 */
	public LocalDate getDataVolta() {
		return dataVolta;
	}

	/**
	 * 
	 * @return mínimo de caroneiros da carona
	 */
	public int getMinimoCaroneiros() {
		return minimoCaroneiros;
	}

	/**
	 * 
	 * @param idUsuario id do usuário
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}	
}
