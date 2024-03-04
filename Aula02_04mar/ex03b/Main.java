import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    int i=0;
    int val=Integer.parseInt(args[0]);

    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      i++;
      sc.next();
    }

    System.out.println("nValores: "+i);

    System.out.println("argumento: "+val);

  }

}
