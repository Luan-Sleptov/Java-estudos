import java.util.Scanner;

public class atividadeChat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Linha();
		
		String[] lanches = new String[] { "X-Burguer", "X-Salada", "Hot Dog", "Misto Quente"};
		exibirValores(lanches);
		
		System.out.print("escolha seu lache: ");
		Integer lancheEscolhido = scan.nextInt();
		
		Boolean posicaoValida = lancheEscolhido >= 0 && lancheEscolhido < lanches.length;
		
		if (!posicaoValida) {
			encerrarPorErro();
		}
		
		String[] bebidas = new String[] { "Refrigerante", "Suco", "Água", "Milkshake"};
		exibirValores(bebidas);
		
		System.out.print("escolha sua bebida: ");
		Integer bebidaEscolhida = scan.nextInt();
		
		posicaoValida = bebidaEscolhida >= 0 && bebidaEscolhida < bebidas.length;
		
		if (!posicaoValida) {
			encerrarPorErro();
		}
		
		String lanchinho = lanches[lancheEscolhido] + ".";
		String drink = bebidas[bebidaEscolhida] + ".";
		
		System.out.println("Seu lanhce escolhido foi o: " + lanchinho + " e sua bebida escolhida foi a: " + drink);
		 
		scan.close();
	}

	static void Linha() {
		System.out.println("------------------------------------");
	}
	
	static void exibirValores(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "]" + vetor[i]);
	}
	}
		static void encerrarPorErro() {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
	
}

