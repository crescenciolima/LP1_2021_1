
public class RepositorioContasArray {
	private ContaAbstrata[] Base_contas;
	private int indice;
	private final static int MAX = 10;
	
	public RepositorioContasArray(){
		indice = 0;
		Base_contas = new ContaAbstrata[MAX];
	}
	
	public void inserir(ContaAbstrata conta_temp){
		if(indice < MAX){
			Base_contas[indice] = conta_temp;
			indice++;
		}else{
			System.out.println("Ultrapassou o tamanho do Array");
		}
	}
	
	public void relatorio(){
		for (int i = 0; i < indice; i++) {
			Base_contas[i].relatorio();
		}
	}	
}
