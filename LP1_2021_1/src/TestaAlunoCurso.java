
public class TestaAlunoCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso("123", "BSI");
		Aluno aluno1 = new Aluno("Chimbinha", "888", 30, curso1);
		
		aluno1.relatorio();

	}
}
