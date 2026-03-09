import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("descreva suas atividades do dia dia abaixo: ");
		
		String[] cardapio = new String[5];
		
		for (int i = 1; i < cardapio.length; i++ ) {
				System.out.print("atividade " + i + ": ");
				cardapio[i] = scan.nextLine();
			}
		
		System.out.println("suas atividades são: ");
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println(i + ": " + cardapio[i]);
			
		}
		
		scan.close();
	}

}
