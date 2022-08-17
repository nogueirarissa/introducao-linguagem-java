package br.com.generation.animal.model;

public abstract class Animal {
	
	private String nome;
	protected String som;
	protected String movimento;
	private int idade;

	public Animal(String nome, String som, String movimento, int idade) {
		super();
		this.nome = nome;
		this.som = som;
		this.movimento = movimento;
		this.idade = idade;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	public String getMovimento() {
		return movimento;
	}


	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public void emitirSom() {
		System.out.println("Animais abstratos não emitem som");
	}
	
	public void movimentar() {}
	
	public void visualizar() {
		
		System.out.println("Nome do animal: "+this.getNome());
		System.out.println("Idade do animal: "+this.getIdade());
	}

}
