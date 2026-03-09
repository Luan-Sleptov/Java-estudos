package primeiraclasse;

public class primeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Iphone";
		produto.precoUnitario = 7000.00;
		produto.quantidade = 200;
		
		exibirQuantidadeEmEstoque(produto);
		

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("quantidade em estoque " + produto.nome + " é de: " + produto.quantidade);
	}

}
