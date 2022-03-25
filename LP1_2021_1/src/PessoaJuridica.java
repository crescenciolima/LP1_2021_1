
public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String fantasia;
	
	public PessoaJuridica(String n, String e, String t, String c, String f){
		super(n, e, t);
		cnpj = c;
		fantasia = f;
	}
	
	public void imprimirDados(){
		System.out.println("---------------------------");
		System.out.println("Informacoes Pessoa Juridica");
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Nome Fantasia: " + fantasia);
	}
}
