public class Executive extends Passagem{

    protected double milhas;

    public Executive (String cpf, String nome, String assento, double custo){
        super(cpf, nome, assento, custo);
        milhas=custo*0.1;
    }

    public double getMilhas(){
        return milhas;
    }

    @Override
    public double custoBagagem(int qtdeBagagens, int[] pesos) {
        // ALTERNATIVA A
        if(qtdeBagagens!=pesos.length)
            return -1;        
        double custo=0;
        if(qtdeBagagens>2)
            for(int i=2; i<qtdeBagagens; i++)
                custo+=pesos[i]*0.5;
        return custo;

        // ALTERNATIVA B
        /*
        double custo = super.custoBagagem(qtdeBagagens, pesos);
        if(custo<0) return custo;
        if(qtdeBagagens>2)
            for(int i=0; i<2; i++)
                custo-=(pesos[i]*0.5);
        return custo;
        */
    }
    
}