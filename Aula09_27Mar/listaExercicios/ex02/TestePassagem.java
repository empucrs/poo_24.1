public class TestePassagem {
    public static void main(String[] args) {
        Passagem p;
        //p=new Passagem();
        //System.out.println(p);

        p=new Passagem("900.900.900-90", "Edson Brown", "15F", 100.99);
        System.out.println(p);

        int bagagens [] = {23, 20, 12, 32};
        double custoBagagem = p.custoBagagem(bagagens.length, bagagens);
        System.out.println("custo das bagagens= "+custoBagagem);

        double custoAssento = p.defineAssento("15F");
        System.out.println("Custo de marcação do assento: "+ custoAssento);


        Economy e = new Economy();
        System.out.println(e);
        
        custoBagagem=e.custoBagagem(bagagens.length, bagagens);
        System.out.println(custoBagagem);

        custoAssento=e.defineAssento("16F");
        System.out.println(custoAssento);


        Executive x = new Executive("999.888.777-666", "Edward Son", "17F", 199.99);
        System.out.println(x);
        custoBagagem=x.custoBagagem(bagagens.length, bagagens);
        System.out.println(custoBagagem);        
        custoAssento=x.defineAssento("17E");
        System.out.println(custoAssento);

        Premier r = new Premier("111.222.333-44", "King Edward Son", "19FMaster", 0.99);
        System.out.println(r);

        custoBagagem=r.custoBagagem(bagagens.length, bagagens);
        System.out.println(custoBagagem);
        custoAssento=r.defineAssento("MasterBlaster");
        System.out.println(custoAssento);


    }
    
}
