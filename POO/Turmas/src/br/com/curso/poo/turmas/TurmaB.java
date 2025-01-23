package br.com.curso.poo.turmas;

public class TurmaB {
	String nome;
	String id;
	
	public void setNomeAluno(String nomeCapturado) {
		this.nome = nomeCapturado;
		
	}

	public String getNomeAluno() {
		return this.nome;
	}

	public void setIdAluno(String idCapturado) {
		this.id = idCapturado;
		
	}
	
	public String getIdAluno() {
		return this.id;
	}
	@Override
	public String toString() {
		return "TurmaB [nome=" + nome + "]";
	}
}
