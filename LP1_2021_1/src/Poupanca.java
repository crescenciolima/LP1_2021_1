
public class Poupanca extends Conta{
	
	public Poupanca(String numero, double saldo){
		super(numero, saldo);
	}
	
	public Poupanca(String numero){
		super(numero);
	}
	
	public void renderJuros(double taxa){
		double juros = saldo * taxa;
		saldo += juros;
	}
	
}
