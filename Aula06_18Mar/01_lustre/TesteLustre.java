public class TesteLustre {

    public static void main(String[] args) {
        Lustre l;

        l = new Lustre(10);
        System.out.println(l);

        for(int i =0; i<10; i++){
            l.ligar();
            System.out.println(l);
            l.desligar();
            System.out.println("-=-=-=-=-=-=-=-=-\n");
        }
    }
    
}
