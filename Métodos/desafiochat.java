import java.util.Scanner;

public class desafiochat {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] numeros = new int[5];

	        System.out.println("Digite 5 números:");

	        for (int i = 0; i < numeros.length; i++) {
	        	System.out.print("Número: " + i + ": ");
	        	numeros[i] = sc.nextInt();
	            
	        }

	        double soma = 0.0;

	        for (int i = 0; i < numeros.length; i++) {
	            soma += numeros[i];
	            
	        }

	        double media = soma / numeros.length;

	        System.out.println("A média é: " + media);

	        sc.close();
	    }
	}



