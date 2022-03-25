
public class PessoaFisica extends Cliente{
	private String cpf;
	
	public PessoaFisica(String n, String e, String t, String c){
		super(n, e, t);
		cpf = c;
	}
	
	public void imprimirDados(){
		System.out.println("-------------------------");
		System.out.println("Informacoes Pessoa Fisica");
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("CPF: " + cpf);
	}
	
}
