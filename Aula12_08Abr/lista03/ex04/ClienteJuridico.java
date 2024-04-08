public class ClienteJuridico extends Cliente{
    private double mensalidade;
    public ClienteJuridico(String nome, double mensalidade) {
        super(nome);
        if(mensalidade>0)
            this.mensalidade=mensalidade;
    }

    public void setMensalidade(double mensalidade){
        if(mensalidade>0)
            this.mensalidade=mensalidade;
    }

    @Override
    public double getMensalidade() {        
        return this.mensalidade;
    }
    
}
