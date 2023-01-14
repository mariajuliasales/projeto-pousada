package mariajulia.projeto;

import java.util.Objects;

public abstract class Pessoa {

	private String nome;
	private String telefone;
	private String cpf;
	private String endereco;
	private int idade;

	public Pessoa() {
	}

	public Pessoa(String nome, String telefone, String cpf, String endereco, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	@Override
	public String toString() {
		return "Pessoa [\nnome=" + nome + "\ntelefone=" + telefone + "\ncpf=" + cpf + "\nendereco=" + endereco
				+ "\nidade=" + idade + "\n]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, endereco, idade, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(endereco, other.endereco) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}

}
