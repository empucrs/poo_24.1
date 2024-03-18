public class TesteLampada {

    public static void main(String[] args) {
        Lampada l = new Lampada();
        System.out.println(l);

        l.ligar();
        System.out.println(l);

        if(l.estaLigada())
            System.out.println("minha consulta diz q lampada esta ligada");
        else
            System.out.println("Estamos na escuridão");

        l.desligar();
        System.out.println(l);

        if(l.estaLigada())
            System.out.println("minha consulta diz q lampada esta ligada");
        else
            System.out.println("Estamos na escuridão");

    }
    
}
