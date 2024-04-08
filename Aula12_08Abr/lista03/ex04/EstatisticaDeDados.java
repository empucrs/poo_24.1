public class EstatisticaDeDados {
    private Mensuravel [] listaDeMensuraveis;
    private int count;

    public EstatisticaDeDados() {
        this.count=0;
        listaDeMensuraveis=new Mensuravel[100];
    }

    public void adicionar(Mensuravel m){
        if(m!=null){
            listaDeMensuraveis[count]=m;
            count++;
        }
    }

    public double getMaior(){
        if(count==0) return 0;
        double resultado=listaDeMensuraveis[0].getValor();
        for(Mensuravel m: listaDeMensuraveis)
            if((m!=null)&&(m.getValor()>resultado))
                resultado=m.getValor();
        return resultado;
    }
    public double getMenor(){        
        if(count==0) return 0;
        double resultado=listaDeMensuraveis[0].getValor();
        for(Mensuravel m: listaDeMensuraveis)
            if((m!=null)&&(m.getValor()<resultado))
                resultado=m.getValor();
        return resultado;
    }
    public double getMedia(){        
        double acumula=0;
        for(Mensuravel m: listaDeMensuraveis)
            if(m!=null)
                acumula+=m.getValor();
        return acumula/count;
    }

}