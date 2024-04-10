import java.util.Random;

public class Teste {
    public static void main(String[] args) {

        int nCirculos=0;
        Circulo c = new Circulo(1,2,4);
        do{

            Random r = new Random();
            
            try{
                c = new Circulo(r.nextInt(10), r.nextInt(10), r.nextInt(10));
                System.out.println(c);
                nCirculos++;
            }
            catch(Exception e){
                System.out.println("  --> Uma exceção foi percebida; Nenhum circulo foi criado.");
            }

        }while(nCirculos<100);

        try {
            Circulo c1 = new Circulo(1,2,3);
            System.out.println(c1);
            c1.copia(c);
            System.out.println(c1);
            c1.copia(null);
            System.out.println(c1);
        } catch (CirculoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim do programa.");
   }
}
