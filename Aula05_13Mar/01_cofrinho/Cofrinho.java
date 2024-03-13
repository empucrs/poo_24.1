public class Cofrinho {

    private int maximoDeMoedas = 10;
    private Moeda [] listaDeMoedas;

    public Cofrinho() {
        listaDeMoedas = new Moeda[maximoDeMoedas];
    }

    public boolean insere(Moeda m){        
        int qtde=0;
        for(int i=0; i<listaDeMoedas.length; i++)
            if(listaDeMoedas[i]!=null) qtde++;

        if(qtde<maximoDeMoedas){
            listaDeMoedas[qtde]=m;
            return true;
        }
        else
            return false;
    }

    public Moeda retira(){
        int idx=-1;

        for(int i=0; i<listaDeMoedas.length; i++)
            if(listaDeMoedas[i] != null)
              idx=i;
            else
              break;

        if(idx<0)
            return null;
        else{
            Moeda m = listaDeMoedas[idx];
            listaDeMoedas[idx]=null;
            return m;
        }
    }

    public int getQuantidadeMoedas(){
        int qtde=0;
        for(int i=0; i<listaDeMoedas.length; i++)
            if(listaDeMoedas[i]!=null) qtde++;
        return qtde;
    }

    public int getQuantidadeMoedasTipo(NomeMoeda m){
        int qtde=0;
        for(int i=0; i<listaDeMoedas.length; i++)
            if((listaDeMoedas[i]!=null)&&(listaDeMoedas[i].getNomeMoeda()==m))
                qtde++;

        return qtde;
    }

    public int getValorTotalCentavos(){
        int total=0;
        for(int i=0; i<listaDeMoedas.length; i++)
            if(listaDeMoedas[i]!=null)
                total+=listaDeMoedas[i].getValorCentavos();
        return total;
    }

    public double getValorTotalReais(){
        double total=0;
        for(int i=0; i<listaDeMoedas.length; i++)
            if(listaDeMoedas[i]!=null)
                total+=listaDeMoedas[i].getValorReais();
        return total;
    }

}
