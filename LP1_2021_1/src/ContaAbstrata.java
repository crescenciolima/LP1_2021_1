
public abstract class ContaAbstrata {
	protected String numero;
	protected double saldo;
	
	//Primeiro construtor
	public ContaAbstrata(String numeroInicial, double saldoInicial){
		numero = numeroInicial;
		saldo = saldoInicial;
	}
	
	//Segundo construtor
	public ContaAbstrata(String numeroInicial){
		numero = numeroInicial;
		saldo = 0.0;
	}
	
	public void creditar(double valor){
		saldo = saldo + valor;
	}
	
	public void relatorio(){
		System.out.println("----------");
		System.out.println("Numero da conta: " + numero);
		System.out.println("Saldo da conta: " + saldo);
	}
	
	public abstract void debitar(double valor);
	public abstract void testando();
	
}
