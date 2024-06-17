import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02 {

    public static void main(String[] args) {

        if (args.length < 1)
            throw new RuntimeException("Argumento faltando. Informa o N (nro inteiro) a ser utilizado");

        int n = Integer.parseInt(args[0]);

        Set<Integer> primos = new HashSet<>();
        for (int i = 2; i <= n; i++)
            primos.add(i);

        System.out.println("Lista de inteiros originais: " + primos);
        System.out.println("-=-=-=-=-==-\n");

        Set<Integer> remove;
        List<Integer> divisores = new ArrayList<>();
        for (int i = 2; i <= (int) Math.sqrt(n); i++)
            divisores.add(i);

        for (int i = 0; i < divisores.size(); i++) {
            remove = new HashSet<>();
            for (int j = divisores.get(i); j <= n; j += divisores.get(i)) {
                if (j != divisores.get(i))
                    remove.add(j);
            }
            System.out.println("Removendo os múltiplos de " + divisores.get(i));
            System.out.println("Lista de elementos a serem removidos");
            System.out.println("  -> " + remove);
            primos.removeAll(remove);

            System.out.println("Lista de primos após a removação");
            System.out.println("  -> " + primos);
            System.out.println("-=-=-=-=-=-=-=-\n");

            divisores.removeAll(remove);

        }

        System.out.println("Lista resultante: " + primos);

    }

}
