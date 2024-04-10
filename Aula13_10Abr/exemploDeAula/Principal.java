import java.util.Scanner;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("Iniciando o programa");

        Scanner sc = new Scanner (System.in);

        int vet[] = new int[3];
        int idx=0;

        try{
            System.out.println("Entrando no bloco try");
            int val;
            do{
                System.out.print("informe um numero valido: ");
                String str = sc.next();                
                val = Integer.parseInt(str);
                vet[idx++]=val;
                System.out.println("Inseriou o valor "+val+" na posicao vet["+idx+"];");
            }while(idx<=vet.length);
            System.out.println("Saindo do bloco try");
        }
        catch(NumberFormatException e){
            System.out.println("Entrando no tratamento de exceção");
            System.out.println("Um formado invalido de número foi informado");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Saindo do tratamento de exceção");
        }
        catch(Exception e){
            System.out.println("Tratamento de exceção genérico");
            System.out.println("Não tinha previsto tal exceção");
        }
        finally{
            System.out.println("O codigo chegou ao trecho de finally");
        }

        sc.close();

        System.out.println("Fim do programa");
        
    
    }
    
}