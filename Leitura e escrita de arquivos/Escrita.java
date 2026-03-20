package Atividade01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefas;
		int i = 0;
		
		while(true) {
			System.out.println("Digite " + "x " + "para parar de digitar");
			System.out.print("Tafera " + (i + 1) + ": ");
			tarefas = sc.nextLine();
			
			if("x".equals(tarefas)) {
			
			break;
			}
			
			linhas.add(tarefas);
			i++;
			
		}
		
		escreverESalvarNoArquivo("C:/Users/luans/aulas/tafeas.txt", linhas);
		
		sc.close();
		
		
		System.out.println("fimmmmmmm");
	}
	
	static void escreverESalvarNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		
		Path salvar = Paths.get(arquivo);
		Files.write(salvar, linhas, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	}
}
