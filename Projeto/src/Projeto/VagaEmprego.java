package Projeto;

import java.util.Objects;

public class VagaEmprego extends Vaga{
	private double salario;
	private String regimeContratacao;
	
	public VagaEmprego(String n�velEscolaridade, String local, String nomeVaga, String nomeEmpresa,
			double salario, String regimeContratacao) {
		super(n�velEscolaridade, local, nomeVaga, nomeEmpresa);
		this.salario = salario;
		this.regimeContratacao = regimeContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRegimeContratacao() {
		return regimeContratacao;
	}

	public void setRegimeContratacao(String regimeContratacao) {
		this.regimeContratacao = regimeContratacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(regimeContratacao, salario);
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
		VagaEmprego other = (VagaEmprego) obj;
		return Objects.equals(regimeContratacao, other.regimeContratacao)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	@Override
	public void ataualizarVaga(Object vaga) {
		
		
	}
	
    public void AdicionarVagas() {//deixei void mas quando formos testar vai ter retorno
		
	}
	
	public void ExcluirVaga() {
		
	}
	
	public void pesquisarVagas() {
		
	}

	@Override
	public void imprimirVaga(Object vaga) {
		
		
	}
	
	
}
