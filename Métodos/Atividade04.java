import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		imprimirTraco();
		
		Integer numeroTabuada = escanearNumero(sc);
		
		imprimirTabuada(numeroTabuada, 0);
		
		
		sc.close();
	}
	
	static void imprimirTabuada(Integer multiplicado, Integer i) {
		
		Integer vezes = multiplicado * i;
		
		imprimir(+ multiplicado + "x" + i + "=" + vezes);
		
		if (++i <= 10) {
			imprimirTabuada(multiplicado, i);
		}
	}
	
	static Integer escanearNumero(Scanner sc) {
		imprimirNaMesmaLinha("Digite o número: ");
		return sc.nextInt();
	}
	
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirTraco() {
		System.out.println("-------------------------------------");
	}

}
