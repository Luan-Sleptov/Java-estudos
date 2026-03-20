package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		Path salvar = Paths.get("C:/Users/luans/aulas/batata.txt");
		
		List<String> linhas = Files.readAllLines(salvar);
		
		for(int i = 0; i < linhas.size(); i++) {
			String atividades = linhas.get(i);
			
			System.out.println("Tarefa " + (i + 1) + ": " + atividades);
		}
	}

}
