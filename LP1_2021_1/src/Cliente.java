
public abstract class Cliente {
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	public Cliente(String n, String e, String t){
		nome = n;
		endereco = e;
		telefone = t;
	}
	
	public abstract void imprimirDados();
}
