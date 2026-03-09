package primeiraclasse;

public class Atividade01 {
	
	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "celular";
		produto.quantidade = 9;
		
		//Boolean resultado = validarEstoque(produto);
		
		if(validarEstoque(produto)) {
			System.out.println("repor estoque");
			
		}else {
			System.out.println("não precisa repor estoque");
		}
	}
	
	static Boolean validarEstoque(Produto produto) {
		
	//Boolean validar = produto.quantidade < QUANTIDADE_MINIMA_ESTOQUE; 
		return produto.quantidade < QUANTIDADE_MINIMA_ESTOQUE;
	}
}
