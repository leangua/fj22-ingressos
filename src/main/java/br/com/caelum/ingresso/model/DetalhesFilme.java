package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalhesFilme {
	
	@JsonProperty("Title")
	private String titulo;
	
	@JsonProperty("Year")
	private String ano;
	
	@JsonProperty("Poster")
	private String imagem;
	
	@JsonProperty("Director")
	private String diretores;
	
	@JsonProperty("Writer")
	private String escritores;
	
	@JsonProperty("Actors")
	private String atores;
	
	@JsonProperty("Plot")
	private String descricao;
	
	@JsonProperty("imdbRating")
	private Double avaliacao;
	
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAno() {
		return this.ano;
	}
	
	public String getImagem() {
		return this.imagem;
	}
	
	public String getdiretores() {
		return this.diretores;
	}
	
	public String getescritores() {
		return this.escritores;
	}
	
	public String getAtores() {
		return this.atores;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getAvaliacao() {
		return this.avaliacao;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public void setImagem(String imagem) {
		this.titulo = imagem;
	}
	
	public void setDiretores(String diretores) {
		this.diretores = diretores;
	}
	
	public void setAtores(String atores) {
		this.atores = atores;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
