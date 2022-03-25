
public class Aluno {
	private String nome;
	private String cpf;
	private int idade;
	private Curso Curso_do_Aluno;
	
	public Aluno(String nome, String cpf, int idade, Curso x){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.Curso_do_Aluno = x;
	}
	
	public void relatorio(){
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		Curso_do_Aluno.relatorio();

	}

}
