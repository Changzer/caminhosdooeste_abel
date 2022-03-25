package br.com.uniamerica.transportadora.caminhao;

public class Caminhao {
	
	private Long id;
	private String placa;
	private String marca;
	private String modelo;
	private Long ano;
	private Long tara;
	private int eixos;
	private String cor;
	private String obs;	
	
	
	public Caminhao() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getId() {
		return id;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public Long getAno() {
		return ano;
	}
	
	public Long getTara() {
		return tara;
	}
	
	public int getEixos() {
		return eixos;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}
	
	public void setTara(Long tara) {
		this.tara = tara;
	}
	
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}	
}
