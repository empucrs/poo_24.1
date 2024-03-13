public class TesteCofrinho {

    public static void main(String[] args) {
        Cofrinho c = new Cofrinho();

        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.UmReal)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Cinquenta)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.VinteCinco)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Dez)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Cinco)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Um)));
        
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.UmReal)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Cinquenta)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.VinteCinco)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Dez)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Cinco)));
        System.out.println("Inserindo moeda no cofrinho: "+c.insere(new Moeda(NomeMoeda.Um)));

        Moeda m;
        System.out.println();
        System.out.println("Quantidade atual de moedas: "+c.getQuantidadeMoedas());
        System.out.println("Retirando uma moeda...");
        m=c.retira();
        System.out.println("... retirada a moeda "+m.getNomeMoeda().toString());
        System.out.println("Nova quantidade de moedas: "+c.getQuantidadeMoedas());
        System.out.println();

        System.out.println();
        System.out.println("Quantidade atual de moedas: "+c.getQuantidadeMoedas());
        System.out.println("Retirando uma moeda...");
        m=c.retira();
        System.out.println("... retirada a moeda "+m.getNomeMoeda().toString());
        System.out.println("Nova quantidade de moedas: "+c.getQuantidadeMoedas());
        System.out.println();

        System.out.println();
        System.out.println("Quantidade atual de moedas: "+c.getQuantidadeMoedas());
        System.out.println("Retirando uma moeda...");
        m=c.retira();
        System.out.println("... retirada a moeda "+m.getNomeMoeda().toString());
        System.out.println("Nova quantidade de moedas: "+c.getQuantidadeMoedas());
        System.out.println();

        System.out.println();
        System.out.println("Quantidade atual de moedas: "+c.getQuantidadeMoedas());
        System.out.println("Retirando uma moeda...");
        m=c.retira();
        System.out.println("... retirada a moeda "+m.getNomeMoeda().toString());
        System.out.println("Nova quantidade de moedas: "+c.getQuantidadeMoedas());
        System.out.println();

        System.out.println();
        System.out.println("Quantidade atual de moedas: "+c.getQuantidadeMoedas());
        System.out.println("Retirando uma moeda...");
        m=c.retira();
        System.out.println("... retirada a moeda "+m.getNomeMoeda().toString());
        System.out.println("Nova quantidade de moedas: "+c.getQuantidadeMoedas());
        System.out.println();

        System.out.println();
        System.out.println("Qtde por tipo");
        System.out.println("... total de Um real: "+ c.getQuantidadeMoedasTipo(NomeMoeda.UmReal));
        System.out.println("... total de Cinquenta: "+ c.getQuantidadeMoedasTipo(NomeMoeda.Cinquenta));
        System.out.println("... total de VinteCinco: "+ c.getQuantidadeMoedasTipo(NomeMoeda.VinteCinco));
        System.out.println("... total de Dez: "+ c.getQuantidadeMoedasTipo(NomeMoeda.Dez));
        System.out.println("... total de Cinco: "+ c.getQuantidadeMoedasTipo(NomeMoeda.Cinco));
        System.out.println("... total de Um: "+ c.getQuantidadeMoedasTipo(NomeMoeda.Um));

        System.out.println();
        System.out.println("Total em centavos eh: "+c.getValorTotalCentavos());
        System.out.println("Total em reais eh: "+c.getValorTotalReais());

        
    }
    
}