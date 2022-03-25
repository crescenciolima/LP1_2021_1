
public class Conta extends ContaAbstrata {
	
	public Conta(String numero, double saldo){
		super(numero, saldo);
	}
	
	public Conta(String numero){
		super(numero);
	}
	
	public static void teste(){
		System.out.println("Conta funcionando!");
	}
	
	public void debitar(double valor){
		if(saldo >= valor){
			saldo -= valor;
		}else{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public double getSaldo(){
		return saldo;
	}
	

	@Override
	public void testando() {
		System.out.println("Implementando o metodo abstrato Conta");
		
	}
}
