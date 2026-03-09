
public class atividadechat {
	public static void main(String[] args) {
		Double[] semanaUm = { 30.0, 25.0, 28.0, 35.0, 40.0, 20.0, 15.0 };
		Double[] semanaDois = { 32.0, 22.0, 30.0, 38.0, 45.0, 18.0, 12.0 };
		Double[] semanaTres = { 28.0, 20.0, 26.0, 33.0, 39.0, 17.0, 10.0 };
		Double[] semanaQuatro = { 35.0, 27.0, 29.0, 40.0, 42.0, 25.0, 18.0 };
		
		Double[][] mes = new Double[][] {semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Double MaiorQuantidadeDeAlunos = 0.0;
		Integer SemanaComODiaDaMaiorQuantidade = null;
		Integer DiaDoMaiorDia = null;
		
		for (int i = 0; i < mes.length; i++) {
			Double[] semana = mes[i];
			
			
			Double quantidade = 0.0;
			
			for (int y = 0; y < semana.length; y++) {
				quantidade = semana[y];
				
				Boolean Maior = quantidade > MaiorQuantidadeDeAlunos;
				
				if(Maior) {
					MaiorQuantidadeDeAlunos = quantidade;
					SemanaComODiaDaMaiorQuantidade = i + 1;
					DiaDoMaiorDia = y + 1;
					
				}
				
				
				
			}
			
			System.out.println("A semana: " + SemanaComODiaDaMaiorQuantidade + " teve a maior quantidade de alunos no dia: " + DiaDoMaiorDia + " que foi de: " + MaiorQuantidadeDeAlunos);
		}
		
	}

}
