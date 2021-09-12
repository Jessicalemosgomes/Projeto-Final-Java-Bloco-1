package Projeto;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class VagaCurso extends Vaga{
	private String regimeMatricula;
	private String duracao;
	private String campus;
	private String turno;
	
	public VagaCurso(String nívelEscolaridade, String local, String nomeVaga, String nomeEmpresa, String regimeMatricula, 
			String duracao, String campus, String turno) {
		super(nívelEscolaridade, local, nomeVaga, nomeEmpresa);
		this.regimeMatricula = regimeMatricula;
		this.duracao = duracao;
		this.campus = campus;
		this.turno = turno;
	}

	public VagaCurso() {
		super();
	}

	public String getRegimeMatricula() {
		return regimeMatricula;
	}

	public void setRegimeMatricula(String regimeMatricula) {
		this.regimeMatricula = regimeMatricula;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(campus, duracao, regimeMatricula, turno);
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
		VagaCurso other = (VagaCurso) obj;
		return Objects.equals(campus, other.campus) && Objects.equals(duracao, other.duracao)
				&& Objects.equals(regimeMatricula, other.regimeMatricula) && Objects.equals(turno, other.turno);
	}

	@Override
	public void atualizarVaga() {
		Scanner leia = new Scanner(System.in);
		String str;
		double salario;
		int op;
		System.out.println("O que deseja atualizar?");
		System.out.println("1 - Nivel de Escolaridade: ");
		System.out.println("2 - Local: ");
		System.out.println("3 - Nome da Vaga: ");
		System.out.println("4 - Nome da Empresa: ");
		System.out.println("5 - Regime de Mátricula: ");
		System.out.println("6 - Duração: ");
		System.out.println("7 - Campus: ");
		System.out.println("8 - Turno: ");
		op = leia.nextInt();
		switch (op) {
		case 1:
			System.out.println("Digite o novo Nivel de Escolaridade");
			str = leia.next();
			setNívelEscolaridade(str);
			break;
		case 2:
			System.out.println("Digite o novo local");
			str = leia.next();
			setLocal(str);
			break;
		case 3:
			System.out.println("Digite o novo nome da vaga");
			str = leia.next();
			setNomeVaga(str);
			break;
		case 4:
			System.out.println("Digite o novo nome da empresa");
			str = leia.next();
			setNomeEmpresa(str);
			break;
		case 5:
			System.out.println("Digite o novo Regime de Mátricula");
			str = leia.next();
			setRegimeMatricula(str);
			break;
		case 6:
			System.out.println("Digite a nova duração: ");
			str = leia.next();
			setDuracao(str);
			break;
		case 7:
			System.out.println("Digite o novo campus: ");
			str = leia.next();
			setCampus(str);
		case 8:
			System.out.println("Digite o novo turno: ");
			str = leia.next();
			setTurno(str);
		default:
			System.out.println("Opção Inválida!");
			break;
		}
	}

	@Override
	public void imprimirVaga() {
		System.out.println("\nNome da Vaga: "+getNomeVaga()+ "\nEmpresa : "+getNomeEmpresa()+"\nLocal : "+getLocal()+"\nNível de Escolaridade : "+getNívelEscolaridade()
		+"\nRegime de Mátricula : "+getRegimeMatricula()+"\nDuração : "+getDuracao()
		+"\nCampus : "+getCampus()
		+"\nTurno : "+getTurno());		
	}
	
	public VagaCurso AdicionarVagas(ArrayList<VagaCurso> list) {
		//Nesse método ele cria a vaga e adiciona na lista
    	VagaCurso curso;
    	String nívelEscolaridade, local, nomeVaga, nomeEmpresa, nRegimeMatricula, nDuracao, nCampus, nTurno;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o nome o nome do curso: ");
		nomeVaga = leia.nextLine();
		System.out.println("\nEscreva o nome da empresa: ");
		nomeEmpresa = leia.nextLine();
		System.out.println("\nEscreva o local da vaga: ");
		local = leia.nextLine();
		System.out.println("\nEscreva o Nível de Escolaridade: ");
		nívelEscolaridade = leia.nextLine();
		System.out.println("\nEscreva o Regime de Mátricula ");
		nRegimeMatricula = leia.nextLine();
		System.out.println("\nEscreva o Duração: ");
		nDuracao = leia.nextLine();
		System.out.println("\nEscreva o Campus");
		nCampus = leia.nextLine();
		System.out.println("\nEscreva o Turno");
		nTurno = leia.nextLine();
		curso = new VagaCurso(nívelEscolaridade, local, nomeVaga, nomeEmpresa, nRegimeMatricula, nDuracao, nCampus, nTurno); 	
		list.add(curso);
		return curso;
	
	}
	
	public void ExcluirVaga(ArrayList<VagaCurso> list) {
		pesquisarVagas(list);
		Scanner leia = new Scanner(System.in);
		int indice;
		System.out.println("Digite o indice da vaga que deseja excluir");
		indice = leia.nextInt();
		if(indice <= list.size()) {
			list.remove(indice);
			System.out.println("Vaga Removida");
		}else {
			System.out.println("Indice não existe");
		}
	}
	
	public void pesquisarVagas(ArrayList<VagaCurso> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Indice: "+i +" | " 
					+"Vaga: "+list.get(i).getNomeVaga() + "-"
					+" Empresa: "+list.get(i).getNomeEmpresa()+ "-"
					+" Local: "+list.get(i).getLocal()+ "-"
					+" Nivel de Escolaridade: "+list.get(i).getNívelEscolaridade()+ "-"
					+" Regime de Matrícula: "+list.get(i).getRegimeMatricula()+ "-"
					+" Duração: "+list.get(i).getDuracao()+ "-"
					+" Campus: "+list.get(i).getCampus()+ "-"
					+" Turno: "+list.get(i).getTurno());
		}
		}
	}
	

	

