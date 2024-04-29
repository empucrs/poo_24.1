import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01 {

    public static void main(String[] args) {

        // PRIMEIRO ITEM
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        System.out.println("1 pertence ao conjunto "+s1+"? "+s1.contains(1));

        // SEGUNDO ITEM
        Set<Integer> s2 = new HashSet<>();
        System.out.println("{vazio} pertence ao conjunto "+s1+"? "+s1.containsAll(s2));

        // TERCEIRO ITEM
        s1.add(4);
        s2.addAll(Arrays.asList(1,2));
        System.out.println(s2+" não pertence ao conjunto "+s1+"? "+!s1.containsAll(s2));

        // QUARTO ITEM
        s2.add(5);
        System.out.print(s1+" - "+ s2+" => ");
        s1.removeAll(s2);
        System.out.println(s1);        

        // QUINTO ITEM
        s1 = new HashSet<>(Arrays.asList(1,2));
        s2 = new HashSet<>(Arrays.asList(3,4));

        Set<List<Integer>> sResultante = new HashSet<>();

        for(Integer e1: s1)
            for(Integer e2: s2)
                sResultante.add(new ArrayList<>(Arrays.asList(e1, e2)));

        System.out.println("O produto cartesiano de "+s1+" com "+ s2+" é :" +sResultante);        
 
        // SEXTO ITEM
        s1 = new HashSet<>(Arrays.asList(1,2));
        Set<Set<Integer>> sSetResult = new HashSet<>();
        sSetResult.add(new HashSet<>()); // {vazio}

        for(Integer e: s1){
            Set<Integer> x = new HashSet<>();
            x.add(e);
            sSetResult.add(x);
        }         
        
        sSetResult.add(new HashSet<>(s1));

        System.out.println("O resultado da operação 2^"+s1+" é "+sSetResult);

    }
    
}