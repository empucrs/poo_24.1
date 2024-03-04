import java.lang.Integer;

public class App{
  public static void main(String args[]){
    if(args.length<2)
      System.out.println("Falta informa dois parametros. int int");
    else{
      
      int valA, valB;
      valA=Integer.parseInt(args[0]);
      valB=Integer.parseInt(args[1]);

      Contas contas = new Contas();
      System.out.println("Teste: "+contas.soma(valA, valB));
    }
  }
}
