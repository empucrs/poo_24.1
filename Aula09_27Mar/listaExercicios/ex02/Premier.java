public class Premier extends Executive{

    public Premier(String cpf, String nome, String assento, double custo){
        super(cpf, nome, assento, custo);
        this.milhas=custo*0.2;
    }

    @Override
    public double defineAssento(String a) {
        return 0.0;
    }

    @Override
    public double custoBagagem(int qtdeBagagens, int[] pesos) {
        double custo = super.custoBagagem(qtdeBagagens, pesos);
        return custo/2;
    }
    
}