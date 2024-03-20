import java.util.Random;

/**
 * Lustre
 */
public class Lustre {

    Lampada ls[];
    boolean queimada[];

    public Lustre(int nLampadas) {
        ls = new Lampada[nLampadas];
        queimada=new boolean[nLampadas];
        for(int i=0; i<nLampadas; i++){
          ls[i]=new Lampada();  
          queimada[i]=false;
        }
    }

    public void ligar(){
        for(int i=0; i<ls.length; i++){
            if(!queimada[i]){
                Random r = new Random();
                // 5% de chance de queimar uma lampada
                if(r.nextInt(100)<5){ 
                    queimada[i]=true;
                    ls[i].desligar();
                }
                else
                    ls[i].ligar();
            }
        }
    }

    public void desligar(){
        for(int i=0; i<ls.length; i++){
            if(!queimada[i])
                ls[i].desligar();
        }
    }

    public boolean lustreOK(){
        for(int i=0; i<ls.length; i++)
            if(queimada[i]) return false;
        
        return true;
    }

    public String toString(){
        StringBuilder aux = new StringBuilder();
        if(lustreOK())
            aux.append("Todas as lampadas do lustre estão OK\n");
        else
            aux.append("Há lampadas queimadas no lustre\n");

        for(int i=0; i<ls.length; i++) {
            if(queimada[i])        
                aux.append("["+i+"] Lampada queimada\n");
            else
                if(ls[i].estaLigada())
                    aux.append("["+i+"] Lampada Ligada\n");
                else
                    aux.append("["+i+"] Lampada Desligada\n");
        }
        return aux.toString();
    }
    
}