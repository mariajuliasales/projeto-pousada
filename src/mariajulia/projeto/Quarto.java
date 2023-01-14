package mariajulia.projeto;

import java.util.Objects;

public class Quarto {

	private int numeroQuarto;
	private String nomeQuarto;
	private boolean ocupado = false;

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public Quarto() {
	}

	public Quarto(int numeroQuarto, String nomeQuarto) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.nomeQuarto = nomeQuarto;
	}

	public Quarto(int numeroQuarto, String nomeQuarto, boolean ocupado) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.nomeQuarto = nomeQuarto;
		this.ocupado = ocupado;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public String getNomeQuarto() {
		return nomeQuarto;
	}

	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Quarto [numeroQuarto=" + numeroQuarto + ", nomeQuarto=" + nomeQuarto + ", ocupado=" + ocupado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeQuarto, numeroQuarto, ocupado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quarto other = (Quarto) obj;
		return Objects.equals(nomeQuarto, other.nomeQuarto) && numeroQuarto == other.numeroQuarto
				&& ocupado == other.ocupado;
	}

}
