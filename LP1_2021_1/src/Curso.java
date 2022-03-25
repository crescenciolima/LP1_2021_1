
public class Curso {
	private String codigo;
	private String nome;
	
	public Curso(String codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public void relatorio(){
		System.out.println("Codigo do curso: " + codigo);
		System.out.println("Nome do curso: " + nome);
	}
}
