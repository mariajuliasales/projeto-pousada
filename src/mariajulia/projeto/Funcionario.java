package mariajulia.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;
	private double comissao;
	List<Quarto> quartosResponsaveis = new ArrayList<Quarto>();

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String telefone, String cpf, String endereco, int idade) {
		super(nome, telefone, cpf, endereco, idade);
	}

	public Funcionario(String cargo, double salario, double comissao, List<Quarto> quartosResponsaveis) {
		super();
		this.cargo = cargo;
		this.salario = salario;
		this.comissao = comissao;
		this.quartosResponsaveis = quartosResponsaveis;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public List<Quarto> getQuartosResponsaveis() {
		return quartosResponsaveis;
	}

	public void setQuartosResponsaveis(List<Quarto> quartosResponsaveis) {
		this.quartosResponsaveis = quartosResponsaveis;
	}

	@Override
	public String toString() {
		return "Funcionario [\ncargo=" + cargo + "\nsalario=" + salario + "\ncomissao=" + comissao
				+ "\nquartosResponsaveis=" + quartosResponsaveis + "\n" + super.toString() + "]\n";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cargo, comissao, quartosResponsaveis, salario);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cargo, other.cargo)
				&& Double.doubleToLongBits(comissao) == Double.doubleToLongBits(other.comissao)
				&& Objects.equals(quartosResponsaveis, other.quartosResponsaveis)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	public double calcularSalario(double horaTrabalhada) {

		if (this.getCargo() == "func01") {
			this.salario = Constantes.SALARIO_FUNC01_HORA * horaTrabalhada;
		} else if (this.getCargo() == "func02") {
			this.salario = Constantes.SALARIO_FUNC02_HORA * horaTrabalhada;
		} else {
			this.salario = Constantes.SALARIO_FUNC03_HORA * horaTrabalhada;
		}

		for (Quarto quarto : quartosResponsaveis) {

			switch (quarto.getNomeQuarto()) {
			case "normal":
				salario += Constantes.DIARIA_QUARTO_NORMAL * 20 / 100;
				break;
			case "plus":
				salario += Constantes.DIARIA_QUARTO_PLUS * 20 / 100;
				break;
			case "ppremium":
				salario += Constantes.DIARIA_QUARTO_PREMIUM * 20 / 100;
				break;
			}
		}

		return salario;
	}

}
