package metedoinstancia;

public class Atividade02 {
	public static void main(String[] args) {
		ProdutoAtividade02 produto02 = new ProdutoAtividade02();
		
		produto02.nome = "celular";
		produto02.quantidade = 8;
		
		if(produto02.validarEstoque()) {
			System.out.println("repor estoque");
		} else {
			System.out.println("não precisa repor estoque");
		}
			
	}

}
