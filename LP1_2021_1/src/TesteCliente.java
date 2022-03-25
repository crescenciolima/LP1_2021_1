
public class TesteCliente {

	public static void main(String[] args) {
		PessoaFisica joao = new PessoaFisica("Joao", "Rua A", "77-111", "99");
		//joao.imprimirDados();
		
		PessoaJuridica ACAI = new PessoaJuridica("Acai", "Rua B", "77-222", "88", "Acai Banana");
		//ACAI.imprimirDados();
		
		Cliente [] BD = new Cliente[2];
		BD[0] = joao;
		BD[1] = ACAI;
		
		for(int i = 0; i < BD.length; i++){
			BD[i].imprimirDados();
		}
	}
}
