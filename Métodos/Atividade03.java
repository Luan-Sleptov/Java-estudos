import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		imprimirTraco();
		
		imprimir("CALCULADORA");
		
		imprimirTraco();
		
		Double primeiroNumero = numero(sc);
		
		imprimirTraco();
		
		Integer operacao = escolhaAOperacao(sc);
		
		imprimirTraco();
		
		Double segundoNumero = numero(sc);
		
		imprimirTraco();
		
		Double resultado = realizarOperacao(operacao, primeiroNumero, segundoNumero);
		
		imprimir("seu resultado é: " + resultado);
		
		imprimirTraco();
		
		
	sc.close();	
	}
	
	static Double numero(Scanner sc) {
		System.out.print("Digite o número: ");
		return sc.nextDouble();
		
	}
	
	static Integer escolhaAOperacao(Scanner sc){
		System.out.println("escolha a operação");
		
		String[] operadores = new String[] { "[+] - adição", "[-] - subtração ", "[*] - multiplicação", "[/] - divisão", "[%] - módulo"};
		
		for(int i = 0; i < operadores.length; i++) {
			System.out.println("[" + i + "] para: " + operadores[i]);
		}
		
		System.out.print("Digite o numero da operação: ");
		
		return sc.nextInt();
	}
	
	static Double realizarOperacao(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;
		
		switch (operacao) {
		case 0:
			resultado = adicao(primeiroNumero, segundoNumero);
			break;
			
		case 1:
			resultado = subtracao(primeiroNumero, segundoNumero);
			break;
			
		case 2:
			resultado = multiplicacao(primeiroNumero, segundoNumero);
			break;
			
		case 3:
			resultado = divisao(primeiroNumero, segundoNumero);
			break;
			
		case 4:
			resultado = modulo(primeiroNumero, segundoNumero);
			break;
			
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(0);			
		}
		
		return resultado;
	}
	
	static Double modulo(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero % segundoNumero;
	}
	
	static Double divisao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero / segundoNumero;
	}
	
	static Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
	static Double subtracao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	
	static Double adicao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	

	static void imprimirTraco() {
		System.out.println("-----------------------------");
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
}
