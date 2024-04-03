/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {

        Circulo c = new Circulo(1,1,2);
        Retangulo r = new Retangulo(1,1,2,3);
        Quadrado q = new Quadrado(1,1,2);

        System.out.println("A área do círculo é: "+c.area());
        System.out.println("A área do retângulo é: "+r.area());
        System.out.println("A área do quadrado é: "+q.area());


        FiguraBidimensional [] lista = new FiguraBidimensional[3];
        lista[0] = new Circulo(1,2,3);
        lista[1] = new Retangulo(4,5,6,7);
        lista[2] = new Quadrado(8,9,10);
        for(int i = 0; i<lista.length; i++)
            System.out.println("A área do "+lista[i].getClass().getName()+" é "+lista[i].area());
    }
}