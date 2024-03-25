import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("produto1", 1.99);
        System.out.println(p1);
        ProdutoPerecivel p2 = new ProdutoPerecivel("produto2", 2.5, LocalDate.of(2018,9,20));
        System.out.println(p2);


        System.out.println(p1 instanceof Produto);
        System.out.println(p1 instanceof ProdutoPerecivel);
        System.out.println(p2 instanceof  Produto);
        System.out.println(p2 instanceof  ProdutoPerecivel);

        Produto p3 = new ProdutoPerecivel("produto3", 10.35, LocalDate.of(2024,3,25));
        System.out.println(p3);

        Produto psuper;
        ProdutoPerecivel psub;

        psuper=p3;
        System.out.println(psuper);

        psub=(ProdutoPerecivel)psuper;
        System.out.println(psub);

        psuper=(Produto)psub;
        System.out.println(psuper);

        psuper=p1;

        Object o;


        o=psub;
        System.out.println(o);

        o=psuper;
        System.out.println(o);


        System.out.println(psub.getDataValidade());
        System.out.println(((ProdutoPerecivel)psuper).getDataValidade());
        System.out.println(((ProdutoPerecivel)o).getDataValidade());

    }
}   
