/**
 * Lampada
 */
public class Lampada {

    private boolean ligada;

    public Lampada() {
        ligada=false;
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public boolean estaLigada(){
        return ligada;
    }
    public String toString(){
        if(ligada)
            return "A lâmpada está ligada";
        else
            return "A lâmpada NÃO está ligada";
    }
    
}