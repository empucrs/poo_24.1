import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        if(args.length<1)
            throw new RuntimeException("O nome do arquivo deve ser informado");

    String currDir = Paths.get("").toAbsolutePath().toString();
    String nameComplete = Paths.get(currDir, args[0]).toString();

    Path path = Paths.get(nameComplete);

    Map<String, Integer> frequencia = new HashMap<>();

    try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
        while (sc.hasNext()){
            String linha = sc.nextLine();
            String palavras[] = linha.split(" ");

            for(String palavra: palavras)
                if(frequencia.containsKey(palavra)){
                    Integer nVezes = frequencia.get(palavra)+1;
                    frequencia.put(palavra, nVezes);
                }
                else
                    frequencia.put(palavra, 1);
            ArrayList<String> al = new ArrayList<>(frequencia.keySet());
            al.sort(null);
            for(String str: al)
                System.out.println(str +" => "+ frequencia.get(str));

            }
    }catch (IOException x){
        System.err.format("Erro de E/S: %s%n", x);
    }


    }
    
}
