import java.util.Scanner;

public class App{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int valA, valB;
    System.out.print("Informe o primeiro valor: ");
    valA=sc.nextInt();
    
    System.out.print("Informe o segundo valor: ");
    valB=sc.nextInt();
    
    Contas contas = new Contas();
    System.out.println("Teste: "+contas.soma(valA, valB));
  }
}
