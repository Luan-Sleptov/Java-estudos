package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("Filme " + (i + 1) + ": " );
			String Nome = "Filme " + (i + 1) + ": " + sc.nextLine();
			
			linhas.add(Nome);
			
}
		
		Path arquivo = Paths.get("C:/Users/luans/arquivo/meuArquivo.txt");
		Files.write(arquivo, linhas);
		
		System.out.println("fim");
		
		sc.close();
		
	}

}
