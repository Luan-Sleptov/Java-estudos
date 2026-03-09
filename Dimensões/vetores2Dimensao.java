

public class vetores2Dimensao {
	public static void main(String[] args) {
		
//		Double FaturamentoDia = 1000.00;
		
		Double[] FaturamentoJaneiro = new Double[] {1500.00, 2000.00, 3500.00 };
		Double[] FaturamentoFevereiro = new Double[] {1200.00, 2100.00, 3600.00 };
		
		Double[][] FaturamentoAnual = new Double[][] { FaturamentoJaneiro, FaturamentoFevereiro};  
		
//		System.out.println(FaturamentoAnual[0][0]);
		
		for (int i = 0; i < FaturamentoAnual.length; i++) {
			System.out.println("Mes: " + (i + 1));
			
			Double[] Mes = FaturamentoAnual[i];
			
			for (int y = 0; y < Mes.length; y++) {
				Double dia = Mes[y];
				
				System.out.println("dia " + (y + 1) +": " + dia);
				
			}
			
		}
		
		
		
	}

}
