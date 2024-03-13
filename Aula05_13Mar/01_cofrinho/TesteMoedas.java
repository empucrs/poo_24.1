public class TesteMoedas {

    public static void main(String[] args) {
        
        Moeda [] listaDeMoedas;
        listaDeMoedas = new Moeda[6];
        listaDeMoedas[0]= new Moeda(NomeMoeda.UmReal);
        listaDeMoedas[1]= new Moeda(NomeMoeda.Cinquenta);
        listaDeMoedas[2]= new Moeda(NomeMoeda.VinteCinco);
        listaDeMoedas[3]= new Moeda(NomeMoeda.Dez);
        listaDeMoedas[4]= new Moeda(NomeMoeda.Cinco);
        listaDeMoedas[5]= new Moeda(NomeMoeda.Um);

        for(Moeda m : listaDeMoedas){
            System.out.println("=-=-=-=-=-=-=");
            System.out.println(m);
            System.out.println("Valor  em centavos: "+m.getValorCentavos());
            System.out.println("Valor  em Reais: "+m.getValorReais());
            System.out.println();
        }





    }
    
}
