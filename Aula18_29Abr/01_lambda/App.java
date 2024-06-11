public class App {
    public static void main(String[] args) {
        PrecoFinal pf = new PrecoFinal(5);
        CalculoConcreto cc = new CalculoConcreto();

        System.out.println("Valor calculado com classe q implementa a interface ICalculo:");
        System.out.println(pf.calculaPreco(cc));
        System.out.println();

        System.out.println("Valor calculado com classe anonima:");
        System.out.println(pf.calculaPreco(
                new ICalcula() {
                    public float calcula(float v) {
                        return 3 * v;
                    }
                }));

        System.out.println("Valor calculado com arrow function:");
        System.out.println(pf.calculaPreco(parametro -> 4 * parametro));

        System.out.println("Valor calculado com arrow function atribuia a uma variável:");
        ICalcula ic = parametro -> 5 * parametro;
        System.out.println(pf.calculaPreco(ic));

    }
}
