
public class ContaImposto extends ContaAbstrata {
	public static final double TAXA = 0.001;
	
	public ContaImposto(String numeroInicial, double saldoInicial) {
		super(numeroInicial, saldoInicial);
	}
	
	public ContaImposto(String numero){
		super(numero);
	}

	public void testando(){
		System.out.println("Testando ContaImposto");
	}
	
	public void debitar(double valor){
		double imposto = valor * TAXA;
		if(valor+imposto <= saldo){
			saldo = saldo - (valor+imposto);
		}
		else{
			System.out.println("Saldo Insuficiente");
		}
	}
}
