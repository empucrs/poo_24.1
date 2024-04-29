import java.util.HashSet;
import java.util.Set;

public class Ex02 {

    public static void main(String[] args) {

        if(args.length<1)
            throw new RuntimeException("Argumento faltando. Informa o N (nro inteiro) a ser utilizado");
        
        int n = Integer.parseInt(args[0]);

        Set<Integer> primos = new HashSet<>();
        for(int i=2; i<=n; i++)
            primos.add(i);

        System.out.println("Lista de inteiros originais: "+primos);

        for(int i=2; i<=(int) Math.sqrt(n); i++)
            for(int j=i+1; j<=n; j++)
                if(j%i==0) primos.remove(j);        

        System.out.println("Lista resultante: "+ primos);
        
    }
    
}
