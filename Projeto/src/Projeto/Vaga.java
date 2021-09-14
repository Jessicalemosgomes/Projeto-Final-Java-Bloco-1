package Projeto;

import java.util.Objects;

public abstract class Vaga { //Classe M�e e abstrata
	private String n�velEscolaridade;
	private String local;
	private String nomeVaga;
	private String nomeEmpresa;
	public abstract void atualizarVaga(); //m�todo polimorfico, as classes filhas s�o obrigadas a implementar
	public abstract void imprimirVaga(); //m�todo polimorfico, as classes filhas s�o obrigadas a implementar
	//M�todo Construtor com paramentros
	public Vaga(String n�velEscolaridade, String local, String nomeVaga, String nomeEmpresa) {
		this.n�velEscolaridade = n�velEscolaridade;
		this.local = local;
		this.nomeVaga = nomeVaga;
		this.nomeEmpresa = nomeEmpresa;
	}
	//M�todo Construtor sem paramentros
	public Vaga() {
		
	}
	//Encapsulamento Getters e Setters
	public String getN�velEscolaridade() {
		return n�velEscolaridade;
	}

	public void setN�velEscolaridade(String n�velEscolaridade) {
		this.n�velEscolaridade = n�velEscolaridade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(local, nomeEmpresa, nomeVaga, n�velEscolaridade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaga other = (Vaga) obj;
		return Objects.equals(local, other.local) && Objects.equals(nomeEmpresa, other.nomeEmpresa)
				&& Objects.equals(nomeVaga, other.nomeVaga)
				&& Objects.equals(n�velEscolaridade, other.n�velEscolaridade);
	}
	
	

}
