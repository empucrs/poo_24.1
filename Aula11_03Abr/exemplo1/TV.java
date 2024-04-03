public class TV implements Controlavel{

    boolean ligado;
    int canal;

    public TV() {
        ligado=false;
        canal=12;
    }

    public void setCanal(int canal){
        this.canal=canal;
    }

    public int getCanal(){
        return this.canal;
    }

    @Override
    public void ligar() {
        ligado=true;
    }

    @Override
    public void desligar() {
        ligado=false;
    }

    @Override
    public boolean isLigada() {
        return ligado;
    }
    
}
