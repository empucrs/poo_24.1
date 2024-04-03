import java.util.ArrayList;

public class Controlador {
    private ArrayList<Controlavel> dispositivos;

    public Controlador() {
        dispositivos = new ArrayList<>();
    }

    public void registrarDispositivo(Controlavel dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void ligarTodosDispositivos() {
        for (Controlavel dispositivo : dispositivos) {
            dispositivo.ligar();
        }
    }

    public void desligarTodosDispositivos() {
        for (int i = 0; i < dispositivos.size(); i++) {
            dispositivos.get(i).desligar();
        }
    }

    public String toString(){
        StringBuffer str;
        str = new StringBuffer();
        str.append("Lista de dispositivos\n[");        
        for(Controlavel c: dispositivos){
            str.append("  Dispositivo "+c+": ");
            if(c.isLigada()) str.append("LIGADO");
            else str.append("DESLIGADO");
            str.append(";\n");
        }
        str.append("]");
        return str.toString();
    }
}
