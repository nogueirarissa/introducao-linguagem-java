package AprendendoJava;

public class Paciente {

		private String numProntuario;
		private String nome;
		private String cpf;
		private int idade;
		private String endereco;
		private String sexo;
		private String telefone;
		
		
		
		public Paciente(String numProntuario, String nome, String cpf, int idade, String endereco, String sexo,
				String telefone) {
			super();
			this.numProntuario = numProntuario;
			this.nome = nome;
			this.cpf = cpf;
			this.idade = idade;
			this.endereco = endereco;
			this.sexo = sexo;
			this.telefone = telefone;
		}
	

		public String getNumProntuario() {
			return numProntuario;
		}


		public String getNome() {
			return nome;
		}


		public String getcpf() {
			return cpf;
		}

		public int getIdade() {
			return idade;
		}



		public void setIdade(int idade) {
			this.idade = idade;
		}



		public String getEndereco() {
			return endereco;
		}



		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}



		public String getSexo() {
			return sexo;
		}



		public void setSexo(String sexo) {
			this.sexo = sexo;
		}



		public String getTelefone() {
			return telefone;
		}



		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public void visualizar() {
			System.out.println("Número do prontuário: "+numProntuario);
			System.out.println("Nome do paciente: "+nome);
			System.out.println("Número do CPF do paciente: "+cpf);
			System.out.println("Idade do paciente: "+idade);
			System.out.println("Endereço do paciente: "+endereco);
			System.out.println("Sexo do paciente: "+sexo);
			System.out.println("Telefone para contato: "+telefone);
		}
}  

