package encapsulamento;

public class Encapsulamento {
	public static void main(String[] args) {
		Cliente cl = new Cliente();
		
//		cl.nome = "Luan Sleptov";
//		cl.telefone = "19982307697";
//		
//		System.out.println("nome cliente: " + cl.nome);
		
		cl.setNome("Luan Sleptov");
		cl.setTelefone("3324957847");
		
		System.out.println("Nome Cliente: " + cl.getNome());
		System.out.println("Priemniro nome: " + cl.getPrimeiroNome());
		System.out.println("ultimo nome: " + cl.getUltimoNome());
		
	}

}
