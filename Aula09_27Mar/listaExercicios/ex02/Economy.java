public class Economy extends Passagem{

    public Economy(){
        super("Algum cpf", "algum nome", "algum assento", -1);

    }

    @Override
    public double custoBagagem(int qtdeBagagens, int[] pesos) {
        double custo=super.custoBagagem(qtdeBagagens, pesos);

        if(custo>0)
            custo+=10.0*qtdeBagagens;

        return custo;
    }
    
}
