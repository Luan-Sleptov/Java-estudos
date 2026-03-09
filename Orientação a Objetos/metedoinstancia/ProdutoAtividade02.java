package metedoinstancia;

public class ProdutoAtividade02 {
	
	String nome;
	
	Integer quantidade;
	
	Double precoUnitario;
	
	static final int QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	Boolean validarEstoque() {
		
		return quantidade < QUANTIDADE_MINIMA_ESTOQUE;
	}

}
