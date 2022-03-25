
public class Main {

	public static void main(String[] args) {
		Conta primeira_conta = new Conta("123", 100.0);

		primeira_conta.creditar(100.0);
		
		Conta segunda_conta = new Conta("222");

		
		Conta terceira_conta = new Conta("333", 20.0);
		Conta quarta_conta = new Conta("444", 15.0);
		Conta quinta_conta = new Conta("555", 200.0);
		
		Poupanca p1 = new Poupanca("666", 100.0);
		p1.renderJuros(0.01);
	
		
		RepositorioContasArray BD = new RepositorioContasArray();
		BD.inserir(primeira_conta);
		BD.inserir(segunda_conta);
		BD.inserir(terceira_conta);
		BD.inserir(quarta_conta);
		BD.inserir(p1);
		
		
		ContaImposto CI1 = new ContaImposto("777", 100.0);
		CI1.debitar(10.0);
		ContaImposto CI2 = new ContaImposto("888", 200.0);
		
		BD.inserir(CI1);
		BD.inserir(CI2);
		
		
		BD.relatorio();
		
		
		
		
		
		
		
		
	}
}
