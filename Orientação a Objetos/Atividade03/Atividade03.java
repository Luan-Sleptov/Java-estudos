package Atividade03;

public class Atividade03 {
	public static void main(String[] args) {
		Pedido pd = new Pedido();
		
		pd.setCogido("3656454356536356");
		pd.setSubtotal(400.00);
		pd.setDesconto(300.00);
//		pd.setTotal(130.00);
		
		System.out.println("código do pedido: " + pd.getCodigo());
		System.out.println("Subtotal do pedido: " + pd.getSubtotal());
		System.out.println("Desconto do pedido: " + pd.getDesconto());
		System.out.println("Total do pedido: " + pd.getTotal());
	}

}
