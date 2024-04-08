import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        CadastroCliente cadastro = new CadastroCliente();

        do{

            System.out.println("Menu de opcoes:");
            System.out.println("1 - Adicionar cliente Pessoa Física");
            System.out.println("2 - Adicionar cliente Pessoa Jurídica");
            System.out.println("3 - Listar clientes");
            System.out.println("0 - Sair do programa");
            System.out.print("Escolha uma opção: ");

            opcao=sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando a pessoa física");                    
                    System.out.print("  Informe o nome: ");
                    String nomeF = sc.next();
                    System.out.print("  Informe a idade: ");
                    int idade = sc.nextInt();
                    System.out.print("  Informe o salario: R$ ");
                    double salario = sc.nextDouble();
                    cadastro.insereClienteFisico(nomeF, idade, salario);
                    break;
                case 2:
                    System.out.println("Cadastrando a pessoa juridica");                    
                    System.out.print("  Informe o nome: ");
                    String nomeJ = sc.next();
                    System.out.print("  Informe a mensalidade: R$ ");
                    double mensalidade = sc.nextDouble();
                    cadastro.insereClienteJuridico(nomeJ, mensalidade);
                    break;
                case 3:  
                    System.out.println(cadastro);                  
                    break;
                case 0:  
                    System.out.println("O programa será finalizado");
                    break;            
                default:
                    System.out.println("Opcao inválida");
                    System.out.println("O programa será finalizado");
                    opcao=0;
                    break;
            }
        }while(opcao!=0);

        System.out.println("fim da execução...");
        
    }


    
}
