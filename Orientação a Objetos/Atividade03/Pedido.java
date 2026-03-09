package Atividade03;

public class Pedido {
	
	String codigo;
	
	Double subtotal;
	
	Double desconto;
	
//	Double total;
	
	String getCodigo() {
		return codigo;
	}
	
	void setCogido(String codigo) {
		this.codigo = codigo;
	}
	
	Double getSubtotal() {
		return subtotal;
	}
	
	void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	Double getDesconto() {
		return desconto;
	}
	
	void setDesconto(Double desconto) {
		
		if(desconto > subtotal) {
			System.err.println("o desconto não pode ser maior que o subtotal");
		}  else {
			this.desconto = desconto;
		}
		
	}

	Double getTotal() {
		return subtotal - desconto;
	}
	
//	void setTotal(Double total) {
//		this.total = total;
//	}
	
}
