package AprendendoJava;

public class Aviao {

	private String fabricante;
	private String modelo;
	private String finalidade;
	private int assentos;


	public Aviao(String fabricante, String modelo, String finalidade, int assentos) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.finalidade = finalidade;
		this.assentos = assentos;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFinalidade() {
		return finalidade;
	}


	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}


	public int getAssentos() {
		return assentos;
	}


	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public void visualizar() {
		System.out.println("Fabricante do avião: "+fabricante);
		System.out.println("Modelo do avião: "+modelo);
		System.out.println("Finalidade do uso do avião: "+finalidade);
		System.out.println("Número de assentos do avião: "+assentos);
		
	}
		
}
