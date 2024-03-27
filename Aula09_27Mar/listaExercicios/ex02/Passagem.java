public class Passagem {

    private String cpf;
    private String nome;
    private String assento;
    private double custoPassagem;

    /*
    public Passagem(){
        cpf="alguma coisa";
        nome="Zé ninguém";
        assento="em pé";
        custoPassagem=1_000_000.99;
    }
    */

    public Passagem(String cpf, String nome, String assento, double custoDaPassagem){
        this.cpf=cpf;
        this.nome=nome;
        this.assento=assento;
        this.custoPassagem=custoDaPassagem;
    }

    public double custoBagagem(int qtdeBagagens, int[] pesos){
        if(qtdeBagagens!=pesos.length)
            return -1;

        double custo=0;
        for(int i=0; i<qtdeBagagens; i++)
            custo+=(pesos[i]*0.5);

        return custo;
    }

    public double defineAssento(String a){
        assento=a;
        return 5.0;
    }

    public String toString(){
        return "[ \n"+
               "   CPF: "+this.cpf+";\n"+
               "   NOME: \""+this.nome+"\";\n"+
               "   ASSENTO: \""+this.assento+"\";\n"+
               "   CUSTO: \""+this.custoPassagem+"\"\n"+
               "]";
    }

    
}